package LawnOlympicsGames;

import com.sun.org.apache.xml.internal.utils.StringVector;

/**
 * Created by Kathy on 9/15/2014.
 */
class LawnOlympicsGames {
        public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Lawn Olympics Games");
        System.out.println(" ");
        System.out.println("For help, type h and enter.");

        System.out.println(" ");
        if (args[0].equals("e"))
            eventList();
        else if (args[0].equals("o"))
            olympianList();
        else if (args[0].equals("h"))
            helpList();
        else
            System.out.println("Please enter e, o, or h and enter");
   }
    public static void helpList() {
        String[] helpArray =
                {"for a list of events, type e", "for a list of olympians type o"};
        for (int i = 0; i < helpArray.length; i++)
            System.out.println(helpArray[i]);
    }
    public static void eventList() {
        String[] eventArray = {"Washoos ", "CanJam ", "Horseshoes ", "Cornhole ", "Ladderball ", "Stickgame "};
        for (int i = 0; i < eventArray.length; i++)
            System.out.println(eventArray[i]);
    }
    public static void olympianList() {
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
        for(int i = 0; i < olympianArray.length; i++) {
            for (int j = 0; j < olympianArray[i].length; j++) {
                System.out.print(olympianArray[i][j]);
            }
            System.out.println();
        }
            };
        }



