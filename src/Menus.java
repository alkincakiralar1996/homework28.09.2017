public class Menus {

    public static void configureLoginMenu() {

        Prints.println("Girisleri Yapiniz");
        Prints.println("Isim Girisi Icin : 1");
        Prints.println("Sayi Girisi Icin : 2");
        byte[] requiredNumbers = {1,2};
        byte result = Inputs.numberInputWithRequiredNumbers(requiredNumbers,"Isleminiz : ");
        Prints.clearConsole();
        byte type;
        if (result == 1) {
            type = 1;
            configureMainMenu(Inputs.getString(),type);
        } else {
            type = 2;
            configureMainMenu(Inputs.getNumbers(),type);
        }
    }

    public static void configureMainMenu(Object[] array,byte arrayType) {
        Prints.clearConsole();
        Prints.println("Islem Tipi : " + ((arrayType == 1)  ? "Isim Dizisi" : "Sayi Dizisi"));
        Prints.printSpace();
        Prints.println("--Menu--");
        Prints.println("I - Buble Sort Siralamasi Yap : 1");
        Prints.println("II - Merge Sort Siralamasi Yap : 2");
        Prints.println("III - Quick Sort Siralamasi Yap : 3");
        Prints.println("IV - Ekleme Sort Siralamasi Yap : 4");
        Prints.println("V - Ust Menuye Don : 5");
        byte requiredNumbers[] = {1,2,3,4,5};
        Prints.printSpace();
        byte result = Inputs.numberInputWithRequiredNumbers(requiredNumbers,"Isleminiz :");
        Prints.clearConsole();
        switch (result) {
            case 1: Sorts.doBubbleSort(array,arrayType); break;
            case 2: Sorts.doMergeSort(array,arrayType); break;
            case 3: Sorts.doQuickSort(array,arrayType); break;
            case 4: Sorts.doAddedSort(array,arrayType); break;
            default: configureLoginMenu();
        }
    }

}
