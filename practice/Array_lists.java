import java.util.ArrayList;

public class Array_lists {
    public static void main(String[] args) {
        
        ArrayList<String> superbowlPlays;
        superbowlPlays = new ArrayList<String>();
        superbowlPlays.add("Touchdown Pass");
        superbowlPlays.add("Interception");
        superbowlPlays.add("Field Goal");

        // superbowlPlays.set(1, "Fumble Recovery");
        // superbowlPlays.replace("Interception", "Fumble Recovery");

        for (String element : superbowlPlays) {
            System.out.println(element);
        }
    }
}