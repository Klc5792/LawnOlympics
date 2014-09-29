package LawnOlympics;

/**
 * Created by Kathy on 9/18/2014.
 */
class LawnOlympics {

    public static String[] eventsArray = new String[6];
    public static String[][] olympiansArray = new String[16][3];

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
            // calls the eventsList method if e or events is entered
        {
            eventsList();
            eventsListPrint();
        }

        else if ((args[0].equals("o")) || (args[0].equals("olympians")))
            // calls the olympiansList method if o or olympians is entered
        {
            olympiansList();
            olympiansListPrint();
        }

        else if ((args[0].equals("h")) || (args[0].equals("help")))
            // calls the helpList method if h or help is entered
            helpList();
        else
            // prints error message if not e, o or h
            System.out.println("Please enter e or events for a list of events, " +
                    "or o or olympians for a list of olympians");

    }

    // helpList method defined
    public static void helpList() {
        // prints help messages
        System.out.println("for a list of events, type e or events");
        System.out.println("for a list of olympians, type o or olympians");
    }

    // eventsList method initializes eventsArray
    public static void eventsList() {
        eventsArray[0] = "Washoos";
        eventsArray[1] = "CanJam";
        eventsArray[2] = "Horseshoes";
        eventsArray[3] = "Cornhole";
        eventsArray[4] = "Ladderball";
        eventsArray[5] = "Stickgame";

    }

    //   eventsListPrint method prints the eventsArray
    public static void eventsListPrint() {
        System.out.println("LIST OF EVENTS:");
        // Just another blank line
        System.out.println(" ");
        for (int i = 0; i < eventsArray.length; i++)
            //prints the array of events
            System.out.println(eventsArray[i]);
    }

    // olympianList method initializes olympiansArray
    public static void olympiansList() {
        olympiansArray[0] = new String[] {"John Doe, ", "M, ", "45"};
        olympiansArray[1] = new String[] {"Terri Doe, ", "F, ", "43"};
        olympiansArray[2] = new String[] {"Harry Smith, ", "M, ", "23"};
        olympiansArray[3] = new String[] {"Mary Jones, ", "F, ", "33"};
        olympiansArray[4] = new String[] {"Howard Jones, ", "M, ", "43"};
        olympiansArray[5] = new String[] {"Maxwell Jones, ", "M, ", "43"};
        olympiansArray[6] = new String[] {"Teresa Jones, ", "F, ", "11"};
        olympiansArray[7] =  new String[] {"Vanessa Jones, ", "F, ", "14"};
        olympiansArray[8] = new String[] {"Mitchell Johnson, ", "M, ", "54"};
        olympiansArray[9] = new String[] {"Lori Johnson, ", "F, ", " 32"};
        olympiansArray[10] = new String[] {"Michael Johnson, ", "M, ", "12"};
        olympiansArray[11] = new String[] {"Kerry Johnson, ", "F, ", "32"};
        olympiansArray[12] = new String[] {"Aaron Quinn, ", "M, ", "22"};
        olympiansArray[13] = new String[] {"Danielle Quinn, ", "F, ", "21"};
        olympiansArray[14] = new String[] {"Margaret Wheeler, ", "F, ", "25"};
        olympiansArray[15] = new String[] {"Ardie Wheeler, ", "M, ", "30"};

    }

    public static void olympiansListPrint() {
        // prints the 2D array
        System.out.println("LIST OF OLYMPIANS:");
        // Just another blank line
        System.out.println(" ");
        for(int i = 0; i < olympiansArray.length; i++) {
            for (int j = 0; j < olympiansArray[i].length; j++) {
                System.out.print(olympiansArray[i][j]);
            }
            System.out.println();
        }
    }
}



