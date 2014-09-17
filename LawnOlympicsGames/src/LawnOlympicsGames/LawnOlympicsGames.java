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
        System.out.println("For a list of events, type e and enter.");
        System.out.println("For a list of Olympians, type o and enter.");
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
        String[] helpArray = {"help1", "help2"};
        for (int i = 0; i < helpArray.length; i++)
            System.out.println(helpArray[i]);
    }
    public static void eventList() {
        String[] eventArray = {"Washoos", "CanJam",};
        for (int i = 0; i < eventArray.length; i++)
            System.out.print(eventArray[i]);
    }
    public static void olympianList() {
        String[][] olympianArray = {
                {"John Doe: ", "M ", "45"},
                {"Terri Doe: ", "F ", "43"},
                {"Harry Smith: ", "M ", "23"},
                {}
        };
        for(int i = 0; i < olympianArray.length; i++) {
            for (int j = 0; j < olympianArray[i].length; j++) {
                System.out.print(olympianArray[i][j]);
            }
            System.out.println();
        }
            };
        }



