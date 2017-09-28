public class Sorts {

    public static void doBubbleSort(Object[] array,byte type) {
        int moveLenght = array.length;
        Integer[] numbersArray = (Integer[]) array;
        while (moveLenght != 0) {
            for(int i=0;i<moveLenght-1;i++) {
                if (numbersArray[i] > numbersArray[i+1]) {
                    int previousValue = numbersArray[i];
                    numbersArray[i] = numbersArray[i+1];
                    numbersArray[i+1] = previousValue;
                }
            }
            moveLenght -= 1;
        }

        Prints.printsValues(array,numbersArray);
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
