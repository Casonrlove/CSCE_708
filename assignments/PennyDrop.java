import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PennyDrop
{
    public static void main(String[] args)
    {
        playgame();
    }
    
    public static void playgame()
    {
        /* PRINT OUT */
        JOptionPane.showMessageDialog(null, "Welcome to Penny Drop!", "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Penny Drop is a game where players race to get rid of all pennies!", "Message", JOptionPane.INFORMATION_MESSAGE);
        int num_of_players = Integer.parseInt(JOptionPane.showInputDialog(null, "How many players are playing? (1-5 players)\n\n"));
        int num_of_pennies = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pennies would you like to play with?\n\n"));


        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < num_of_players; i++)
        {
            /* PLAYER NAMES */
            String player_name = JOptionPane.showInputDialog("Enter the name for Player " + (i + 1));
            if (player_name == null)
            {
                JOptionPane.showMessageDialog(null, "Input canceled. Exiting.");
                System.exit(0);
            }
            Player player = new Player(player_name, num_of_pennies);
            players.add(player);
        }

        /* GAME PLAY */
        int maxRoll = 0;
        int playerCounter = 0;
        for(int i = 0; i < num_of_players; i++)
        {
            int playerRoll = Dice.rollDice();
            players.get(i).setRoll(playerRoll);
            JOptionPane.showMessageDialog(null, players.get(i).getName() + " rolled a " + playerRoll, "Message", JOptionPane.INFORMATION_MESSAGE);
            if(playerRoll > maxRoll)
            {
                maxRoll = playerRoll;
                playerCounter = i;
            }
        }
        
        /* STARTING PLAYER */
        JOptionPane.showMessageDialog(null, players.get(playerCounter).getName() + " will start after a roll of " + players.get(playerCounter).getRoll(), "Message", JOptionPane.INFORMATION_MESSAGE);
        
        //games actually begins here
        boolean win = false;
        boolean[] gameBoard = new boolean[6];
        clearBoard(gameBoard);
        int pennies = 0;
        boolean option = true;

        while (!win)
        {
            if(playerCounter == num_of_players)
            {
                playerCounter = 0;
            }

            Player currentPlayer = players.get(playerCounter);

            currentPlayer.setRoll(Dice.rollDice());
            int currentRoll = currentPlayer.getRoll();
            
            if(currentRoll != 6 && gameBoard[currentRoll - 1])
            {
                /* COLLECT PENNIES */
                int penniesOnBoard = 0;
                for(boolean slot : gameBoard)
                {
                    if(slot == true)
                    {
                        penniesOnBoard ++;
                    }
                    
                }
                /* ADD PENNIES TO PLAYERS */
                pennies = currentPlayer.getPennies();
                pennies += penniesOnBoard;
                currentPlayer.setPennies(pennies);
                clearBoard(gameBoard);
                option = false;
            }
            else if(currentRoll == 6)
            {
                /* SPECIAL CASE OF 6 */
                pennies = currentPlayer.getPennies();
                pennies --;
                currentPlayer.setPennies(pennies);
                option = true;
            }
            else
            {
                /* ADD PENNIES */
                gameBoard[currentRoll - 1] = true;
                pennies = currentPlayer.getPennies();
                pennies --;
                currentPlayer.setPennies(pennies);
                option = true;
            }
            /* CHECK FOR WIN */
            win = checkForWin(players);
            if(win)
            {
                break;
            }

            int counter = buildBoard(gameBoard, players, currentPlayer, option);
            playerCounter += counter;
        }
    }

    /* CHECK FOR WIN */
    public static boolean checkForWin(ArrayList<Player> players)
    {
        for(Player player : players)
        {
            if(player.getPennies() <= 0)
            {
                int userChoice = JOptionPane.showConfirmDialog(
                null, player.getName() + " has won penny drop!" + "\n\n" + "Do you want to play again?", "Roll Again?", JOptionPane.YES_NO_OPTION);
                
                /* PLAY AGAIN */
                if (userChoice == JOptionPane.YES_OPTION)
                {
                    playgame();
                }
                /* BREAK OUT OF playgame() */
                else
                {
                    return true;
                }
            }
        }
        return false;
    }

    /* BUILD GUI + BOARD */
    public static int buildBoard(boolean[] gameBoard, ArrayList<Player> players, Player currentPlayer, boolean option){
        String board = "";
        for(Player player : players)
        {
            board += player.getName() + " Pennies: " + player.getPennies() + "\n\n";
        }
        board += "\n              " + currentPlayer.getName() + " rolled a " + currentPlayer.getRoll() + "\n\n";

        for(boolean slot : gameBoard)
        {
            if(slot)
            {
                board += "O   ";
            }
            else
            {
                board += "-   ";
            }
            
        }

        /* ROLL AGAIN */
        if(option)
        {
            int userChoice = JOptionPane.showConfirmDialog(null, board + "\n\n Do you wish to roll again?", "Roll Again?", JOptionPane.YES_NO_OPTION);
                if (userChoice == JOptionPane.YES_OPTION)
                {
                    return 0;
                }
                else{
                    return 1;
                }
        }
        /* OUTPUT BOARD */
        else
        {
            JOptionPane.showMessageDialog(null, board, "Message", JOptionPane.INFORMATION_MESSAGE);
            return 1;
        }
        
    }

    /* CLEAR BOARD AND RESET VALUES */
    public static void clearBoard(boolean[] gameBoard)
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            gameBoard[i] = false;
        }
    }
}

