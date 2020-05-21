import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr = new String[4][4];
        String x = "1";
        for (int i = 0; i < arr.length; i++) {
            x = "0";
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = x;
                x = x + i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int firstParameter = arr.length;
        int secondParameter = arr[arr.length - 1].length;
        if (firstParameter > 4) {
            throw new MyArraySizeException("First parameter in array more than 4");
        } else if (secondParameter > 4) {
            throw new MyArraySizeException("Second parameter in array more than 4");
        }

        int y = classForParseStringArrayToInt(arr);
            System.out.println(y);
    }

        public static int classForParseStringArrayToInt (String arr[][]) throws MyArrayDataException {
            int[][] integerArray = new int[arr.length][arr[arr.length - 1].length];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    String str;
                    char[] arrayToCheck = arr[i][j].toCharArray();
                    for (int k = 0; k < arrayToCheck.length; k++) {
                        if (arrayToCheck[k] < '0' || arrayToCheck[k] > '9') {
                            throw new MyArrayDataException("\nВ ячейке с индексами " + i + " : " + j + " имеется нечисловой символ, приведение которого не возможно.");
                        }
                    }
                    integerArray[i][j] = Integer.parseInt(arr[i][j]);
                    sum += integerArray[i][j];
                }
            }
            return sum;
        }
        public static class MyArrayDataException extends Exception {
            public MyArrayDataException(String message) {
                super(message);
            }
        }

        public static class MyArraySizeException extends Exception {
            public MyArraySizeException(String message) {
                super(message);
            }
        }
}
