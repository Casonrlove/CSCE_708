/*
 * Cason Love
 * 529008776
 * CSCE 708
 */
// package assignments;

public class CardDeck {
    public static void main(String[] args) {
        
        //*****************************************************************************//
        //--------------------FUNCTION CALLS--------------------//
        //----------heading and title----------//
        System.out.println("\n\n********************** Deck Of Cards ***********************\n\n");
        System.out.println("Let's print out a deck of cards!\n\n");
        System.out.println("Our deck is a classis set of 52 cards with 2 jokers.\n\n");

        //----------set cardDeck to a deck of cards----------//
        String[] cardDeck = setCards();

        //----------print cards----------//
        System.out.println("************************************************************\n");
        printCards(cardDeck);
        System.out.println("************************************************************\n\n");

        //----------shuffle cards----------//
        System.out.println("************************************************************");
        shuffleCards(cardDeck);
        System.out.println("************************************************************\n\n");

        //----------randomly choose card----------//
        System.out.println("************************************************************\n");
        randomCard(cardDeck);
        System.out.println("********************** Deck Of Cards ***********************\n\n");
    }
    //*****************************************************************************//
    //*****************************************************************************//
    

    //*****************************************************************************//
    //--------------------method to populate card deck in order--------------------//
    public static String[] setCards()
    {
        //----------suits in an array----------//
        String[] suit = {"H","S","C","D"};
        //----------cards in an array----------//
        String[] cards = {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
        //----------new array to populate cards----------//
        String[] cardDeck = new String[54];
        //----------third iterator init to 0----------//
        int card_counter = 0;

        //----------run for every suit----------//
        for(int i = 0; i < suit.length; i++)
        {
            //----------run for every number----------//
            for(int c = 0; c < cards.length; c++)
            {
                //----------add suit and card into cardDeck----------//
                cardDeck[card_counter] = suit[i] + cards[c];
                //----------increment----------//
                card_counter++;
            }
        }

        //----------add jokers----------//
        cardDeck[52] = "j0";
        cardDeck[53] = "j1";
        return cardDeck;
    }
    //******************************************************************//
    //******************************************************************//
    

    //*****************************************************************//
    //--------------------method to print card deck--------------------//
    public static void printCards(String[] cardDeck){
        System.out.println("Here is the deck of cards!\n");

        String[] suit = {"H","S","C","D"};
        //----------print by suit ----------//
        for(String selectedSuit : suit)
        {
            //----------sort through cards----------//
            for(String card : cardDeck)
            {
                //----------match suit with card----------//
                if(card.startsWith(selectedSuit))
                {
                    System.out.print(card + " ");
                }
            }
            //----------Newline per suit----------//
            System.out.println();
        }
        //----------manually print jokers----------//
        System.out.print(cardDeck[52] + " ");
        System.out.print(cardDeck[53] + "\n\n");
    }
    //*******************************************************************//
    //*******************************************************************//
    

    //*******************************************************************//
    //--------------------method to shuffle card deck--------------------//
    public static void shuffleCards(String[] cardDeck){
        System.out.println("\nHere is that shuffled deck of cards you requested!\n");
        
        for(int i = cardDeck.length-1; i > 0; i--)
        {
            //----------pick random position----------//
            int j = (int) (Math.random() * (i + 1));

            //----------swap values with temp var----------//
            String temp = cardDeck[i];
            cardDeck[i] = cardDeck[j];
            cardDeck[j] = temp;
        }
        //----------same print technique again----------//
        int counter = 0;

        //----------for suits/rows----------//
        for(int i = 0; i < 4; i++)
        {
            //----------for cards/cols----------//
            for(int j = 0; j < 13; j++)
            {
                System.out.print(cardDeck[counter] + " ");
                counter++;
            }
            //----------Newline per row----------//
            System.out.println();
        }
        //----------last 2 cards----------//
        System.out.print(cardDeck[52] + " " + cardDeck[53] + "\n\n");
    }
    //*******************************************************************//
    //*******************************************************************//


    //*******************************************************************//
    //--------------------method to draw random card---------------------//
    public static void randomCard(String[] cardDeck){
        System.out.println("Your randomly selected card is: ");

        //----------select random card----------//
        int j = (int) (Math.random() * (54));

        //----------printable string----------//
        String random_card = cardDeck[j];

        //----------gather suit + number----------//
        String suit = random_card.substring(0,1);
        String number = random_card.substring(1);
        String suit_string = "";
        String number_string = "";
        
        //switch for  the suit and making a string with a real word and not a letter
        switch(suit){
            case "H":
                suit_string = "Hearts";
                break;
            case "S":
                suit_string = "Spades";
                break;
            case "C":
                suit_string = "Clubs";
                break;
            case "D":
                suit_string = "Diamonds";
                break;
        }
        //switch for  the number and making a string with a real word and not a letter
        switch(number){
            case "A":
                number_string = "Ace";
                break;
            case "2":
                number_string = "Two";
                break;
            case "3":
                number_string = "Three";
                break;
            case "4":
                number_string = "Four";
                break;
            case "5":
                number_string = "Five";
                break;
            case "6":
                number_string = "Six";
                break;
            case "7":
                number_string = "Seven";
                break;
            case "8":
                number_string = "Eight";
                break;
            case "9":
                number_string = "Nine";
                break;
            case "T":
                number_string = "Ten";
                break;
            case "J":
                number_string = "Jack";
                break;
            case "Q":
                number_string = "Queen";
                break;
            case "K":
                number_string = "King";
                break;
        }

        //----------print random card----------//
        System.out.println(random_card);
        System.out.println("You drew a " + number_string + " of " + suit_string + "\n");
    }
}
    //*******************************************************************//
    //*******************************************************************//