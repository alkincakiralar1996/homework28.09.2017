import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {

    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String stringInput(String text) {
        String input = "";
        while (input.length() <= 0) {
            try {
                Prints.print(text);
                input = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return input;
    }

    public static void goMainMenu(Object[] array,byte type) {
        Prints.printSpace();
        Prints.printSpace();
        try
        {
            Prints.print("Ust menuye devam etmek icin enter tusuna basiniz.");
            bufferedReader.readLine();
            Menus.configureMainMenu(array,type);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static byte numberInputWithRequiredNumbers(byte[] requiredNumbers,String text) {
        byte input = -1;
        boolean requiredState = false;
        while (input == -1) {
            try {
                Prints.print(text);
                input = Byte.parseByte(bufferedReader.readLine());
                for (int i=0;i<requiredNumbers.length;i++) {
                    if (input == requiredNumbers[i]) {
                            requiredState = true;
                    }
                }
                if (!requiredState) {
                        input = -1;
                        Prints.println("Girilen deger menude ki islemlerden biri degildir");
                }
            } catch (NumberFormatException ex) {
                Prints.println("Girilen deger sayi karakterinden olusmak zorundadir.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return input;
    }

    public static int numberInput(String text) {
        int input = -1;
        boolean requiredState = false;
        while (input == -1) {
            try {
                Prints.print(text);
                input = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException ex) {
                Prints.println("Girilen deger sayi karakterinden olusmak zorundadir.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return input;
    }

    public static Integer[] getNumbers() {
        int arrayLenght = Inputs.numberInput("Kac adet sayi girmek istiyorsunuz : ");
        Integer numbersArray[] = new Integer[arrayLenght];
        for(int i=0;i<numbersArray.length;i++) {
            int number = Inputs.numberInput("Sayi " + (i+1) + ": ");
            numbersArray[i] = number;
        }
        return numbersArray;
    }

    public static String[] getString() {
        int arrayLenght = Inputs.numberInput("Kac adet isim girmek istiyorsunuz : ");
        String nameArray[] = new String[arrayLenght];
        for(int i=0;i<nameArray.length;i++) {
            String name = Inputs.stringInput("Isim " + (i+1) + ": ");
            nameArray[i] = name;
        }
        return nameArray;
    }

}

