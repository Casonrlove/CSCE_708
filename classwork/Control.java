public class Control {
    
    
    public static void sleep(int s)
    {
        try {
            Thread.sleep(s);
        } catch (Exception e) {
            System.out.println("Cant sleep");
        }
    }

    public static void beeping()
    {
        System.out.println("\007");
        System.out.println("Beep!");
    }

    public static void clear()
    {
        if(System.getProperty("os.name").contains("Mac"))
        {
            System.out.println("\033[H\033[J2");
        }
        else if(System.getProperty("os.name").contains("Mac"))
        {
            try {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            } catch (Exception e) {
                System.out.println("CLS error");
            }
        }
    }
}
