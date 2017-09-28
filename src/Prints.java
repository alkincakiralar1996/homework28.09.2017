public class Prints {

    public static void println(String text) {
        System.out.println(text);
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public  static void printSpace() {System.out.println("");}

    public static void printsValues(Object[] previousArray,Object[] currentArray) {
        println("Onceki Hali : ");
        for(int i=0;i<previousArray.length;i++) {
            print(previousArray[i].toString() + " ");
        }

        printSpace();
        println("Siralanmis Hali : ");
        for(int i=0;i<currentArray.length;i++) {
            print(currentArray[i].toString() + " ");
        }
    }

    public final static void clearConsole()  {
        for(int i = 0; i < 80*300; i++) {
            Prints.println("\b");
        }
    }

}
