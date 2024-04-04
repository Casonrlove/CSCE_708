public class Player
{
    private String player_name;
    private int number_of_pennies;
    private int last_roll;
    
    /* CONSTRUCTOR */
    public Player(String name, int pennies)
    {
        this.player_name = name;
        this.number_of_pennies = pennies;
        this.last_roll = 0;
    }

    /* GETTERS */
    public String getName()
    {
        return this.player_name;
    }
    public int getPennies()
    {
        return this.number_of_pennies;
    }
    public int getRoll()
    {
        return this.last_roll;
    }

    /* SETTERS */
    public void setName(String name)
    {
        this.player_name = name;
    }
    public void setPennies(int pennies)
    {
        this.number_of_pennies = pennies;
    }
    public void setRoll(int roll)
    {
        this.last_roll = roll;
    }
}
