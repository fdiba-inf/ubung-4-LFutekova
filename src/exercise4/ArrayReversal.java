package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();
        char[] array = new char[size];

        System.out.print("Enter array values: ");

        for (int i = 0; i < size; i++) {
            String value = input.next();
            char valueChar = value.charAt(0);
            array[i] = valueChar;
        }

        char[] reversedArray = new char[size];

        for (int i = 0; i < size; i++) {
            int position = size - i - 1;
            reversedArray[i] = array[position];
        }

        String output = Arrays.toString(reversedArray);
        System.out.print("Reversed symbols: " + output);
    }
}