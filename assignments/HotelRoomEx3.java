

/*
 * Cason Love
 * 529008776
 * CSCE 708
 * HotelRoomEx3.java
 */
import javax.swing.JOptionPane;

public class HotelRoomEx3{
     public static void main(String[] args) { //start main
        
        
        //----------GATHER INPUTS----------//
        int starting_floor  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the starting floor"));
        // try {
        //     numBoxes= Integer.parseInt(askBoxes);
        //  } catch(NumberFormatException e) {
        //    JOptionPane.showMessageDialog(null, "Value must be an integer!");
        //  }
        int num_floors      = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the total number of floors"));
        int rooms_per_floor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the total number of rooms per floor"));
        
        //----------CHECK CONDITIONS----------//
        while(starting_floor <3 || starting_floor > 6)
        {
            JOptionPane.showMessageDialog(null, "Starting floor must be between 3 and 6.");
            starting_floor  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the starting floor"));
            // System.exit(0);
        }
        while((starting_floor + num_floors) > 21)
        {
            JOptionPane.showMessageDialog(null, "Top floor must be between 3 and 21.");
            num_floors      = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the total number of floors"));
            // System.exit(0);
        }
        while((rooms_per_floor > 999) || (rooms_per_floor < 1))
        {
            JOptionPane.showMessageDialog(null, "Rooms per floor should be between 1 and 999.");
            rooms_per_floor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the total number of rooms per floor"));
            // System.exit(0);
        }
        
        //----------PRINT----------//
        System.out.println("Hotel Room Cleaning Roster\n");
        System.out.println("Room Number\tCleaned");

        //----------LOOP THROUGH FLOORS----------//
        for(int floor = starting_floor; floor <= (starting_floor + num_floors); floor++){

            //----------FLOOR STRING----------//
            String floorString = Integer.toString(floor);
            String current_room;

            //----------SKIP 13----------//
            if(floor != 13)
            {
                //----------UNDER 100 ROOMS/FLOOR----------//
                if(rooms_per_floor <= 99)
                {
                    //----------LOOP THROUGH ROOMS----------//
                    for(int room = 0; room <= rooms_per_floor; room++){
                        String room_string = Integer.toString(room);
                        if(room < 10){
                            //----------PLACE EXTRA 0----------//
                            current_room = floorString + "0" + room_string + "\t\t___";
                            // current room adds the floor and room number together with the underscores for a cleaning person to sign off (same all the way down)
                        }
                        else{
                            current_room = floorString + room_string + "\t\t___";
                        }
                        
                        System.out.println(current_room);
                    }
                }
                //----------OVER 100 ROOMS/FLOOR----------//
                else{
                    //----------LOOP THROUGH ROOMS----------//
                    for(int room = 0; room <= rooms_per_floor; room++){
                        String room_string = Integer.toString(room);

                        //----------ADD 00----------//
                        if(room < 10){
                            current_room = floorString + "00" + room_string + "\t\t___";
                        }
                        //----------ADD 0----------//
                        else if(room < 100){
                            current_room = floorString + "0" + room_string + "\t\t___";
                        }
                        else{
                            current_room = floorString + room_string + "\t\t___";
                        }
                        System.out.println(current_room);
                    }
                }
            }
            System.out.println("");
        }
        
    }
}