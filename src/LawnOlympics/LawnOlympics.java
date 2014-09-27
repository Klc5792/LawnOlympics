package LawnOlympics;

/**
 * Created by Kathy on 9/18/2014.
 */
class LawnOlympics {

    public static void main(String[] args) {
                    // printing a blank line here between the C:\Program and the Title of the Program
        System.out.println(" ");
                    // prints the title of my program
        System.out.println("Lawn Olympics Games");
                    // I wanted another blank line here
        System.out.println(" ");
                    // prints a little help for the user
        System.out.println("For help, type h or help and enter.");
                    // Just another blank line
        System.out.println(" ");

        if (args.length < 1)
            System.out.print("You must enter something. Please try again.");
        else if ((args[0].equals("e")) || (args[0].equals("events")))
                     //calls the eventlist method if e or events is entered
            eventList();
        else if ((args[0].equals("o"))   || (args[0].equals("olympians")))
                    //calls the olympianList method if o or olympians is entered
            olympianList();
        else if ((args[0].equals("h"))  ||  (args[0].equals("help")))
                    //calls the helpList method if h or help is entered
            helpList();
        else
                     // prints error message if not e, o or h
            System.out.println("Please enter e or events for a list of events, " +
                    "or olympians for a list of olympians, or h or help for assistance and enter");
    }

                    // helpList method defined
        public static void helpList() {
                    // initializes and populates an array of help messages
            String[] helpArray =
                    {"for a list of events, type e or events",
                     "for a list of olympians type o or olympians"};
            for (int i = 0; i < helpArray.length; i++)
                    // prints the array of help messages
                System.out.println(helpArray[i]);
        }

                    // eventList method defined
        public static void eventList() {
            // initializes and populates an array of events
            String[] eventArray = {"Washoos ", "CanJam ", "Horseshoes ", "Cornhole ", "Ladderball ", "Stickgame "};
            for (int i = 0; i < eventArray.length; i++)
                    //prints the array of events
                System.out.println(eventArray[i]);
        }

                    // olympianList method defined
    public static void olympianList() {
                    // initializes and populates a 2 dimensional array
        String[][] olympianArray = {
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
                    // prints the 2D array
        for(int i = 0; i < olympianArray.length; i++) {
            for (int j = 0; j < olympianArray[i].length; j++) {
                System.out.print(olympianArray[i][j]);
            }
            System.out.println();
        }
    }
}



