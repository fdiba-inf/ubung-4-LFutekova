package exercise4;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("Enter array values: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int spaceCounter = 0;
        for (int i = 0; i < size; i++) {
            while(spaceCounter != i){
                System.out.print(" ");
                spaceCounter++;
            }
            System.out.println(array[i]);
            spaceCounter = 0;
        }
    }
}