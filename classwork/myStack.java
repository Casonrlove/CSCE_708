public class myStack {

public static void theStack(int i) 
{
    private int j = 0;
    System.out.println("In the stack with " + i++);
    
    if (i>50000) 
    {
        System.out.println("Out of the stack at " + --i);
        return;
    }
    theStack(i);
}

    public static void main(String[] args) 
    {
        theStack(1);
    }
}


