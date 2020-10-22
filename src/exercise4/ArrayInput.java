package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("Enter array values: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        String output = Arrays.toString(array);
        System.out.print("Numbers: " + output);
    }
}
