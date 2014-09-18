package LawnOlympicsGames;

/**
 * Created by Kathy on 9/15/2014. Project I for CMPT 220.
 */


class LawnOlympicsGames {

        public static void main(String[] args) {
        System.out.println(" ");                             // I wanted a blank line here
        System.out.println("Lawn Olympics Games");           // prints the title of my program
        System.out.println(" ");                            // I wanted another blank line here
        System.out.println("For help, type h and enter.");  // prints a little help for the user
        System.out.println(" ");                            // Just another blank line
        if (args[0].equals("e"))
            eventList();                                    //calls the eventlist method if e is entered
        else if (args[0].equals("o"))
            olympianList();                             //calls the olympianList method if o is entered
        else if (args[0].equals("h"))
            helpList();                                     //calls the helpList method if h is entered
        else
            System.out.println("Please enter e, o, or h and enter"); // prints error message if not e, o or h
   }
    public static void helpList() {                     // helpList method defined
        String[] helpArray =                     // initializes and populates an array of help messages
                {"for a list of events, type e", "for a list of olympians type o"};
        for (int i = 0; i < helpArray.length; i++)
            System.out.println(helpArray[i]);           // prints the array of help messages
    }
    public static void eventList() {                    // eventList method defined
                                                // initializes and populates an array of events
        String[] eventArray = {"Washoos ", "CanJam ", "Horseshoes ", "Cornhole ", "Ladderball ", "Stickgame "};
        for (int i = 0; i < eventArray.length; i++)
            System.out.println(eventArray[i]);          //prints the array of events
    }
    public static void olympianList() {             // olympianList method defined
        String[][] olympianArray = {        // initializes and populates a 2 dimensional array
                {"John Doe, ", "M, ", "45"},
                {"Terri Doe, ", "F, ", "43"},
                {"Harry Smith, ", "M, ", "23"},
                {"Mary Jones, ", "F, ", "33"},
                {"Howard Jones, ", "M, ", "43"},
                {"Maxwell Jones, ", "M, ", "43"},
                {"Teresa Jones, ", "F, ", "11"},
                {"Vanessa Jones, ", "F, ", "14"},
                {"Mitchell Johnson, ", "M, ", "54"},
                {"Lori Johnson, ", "F, ", " 32"},
                {"Michael Johnson, ", "M, ", "12"},
                {"Kerry Johnson, ", "F, ", "32"},
                {"Aaron Quinn, ", "M, ", "22"},
                {"Danielle Quinn, ", "F, ", "21"},
                {"Margaret Wheeler, ", "F, ", "25"},
                {"Ardie Wheeler, ", "M, ", "30"}
        };
        for(int i = 0; i < olympianArray.length; i++) {     // prints the 2D array
            for (int j = 0; j < olympianArray[i].length; j++) {
                System.out.print(olympianArray[i][j]);
            }
            System.out.println();
        }
    }
}



