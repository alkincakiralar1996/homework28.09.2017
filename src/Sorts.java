
import java.util.Arrays;

public class Sorts {
    
    public static void doBubbleSort(Object[] array,byte type) {
        int moveLenght = array.length;
        Integer[] previousArray = Arrays.copyOf(array, array.length, Integer[].class);
        Integer[] currentArray = (Integer[]) array;
        while (moveLenght != 0) {
            for(int i=0;i<moveLenght-1;i++) {
                if (currentArray[i] > currentArray[i+1]) {
                    int previousValue = currentArray[i];
                    currentArray[i] = currentArray[i+1];
                    currentArray[i+1] = previousValue;
                }
            }
            moveLenght -= 1;
        }

        Prints.printsValues(previousArray,currentArray);
        
        Inputs.goMainMenu(array,type);
    }

    public static void doMergeSort(Object[] array,byte type) {

        Inputs.goMainMenu(array,type);
    }

    public static void doQuickSort(Object[] array,byte type) {

        Inputs.goMainMenu(array,type);
    }

    public static void doAddedSort(Object[] array,byte type) {

        Inputs.goMainMenu(array,type);
    }

}
