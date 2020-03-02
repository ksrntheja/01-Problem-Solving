package org.ksrntheja.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {11, 25, 8, 22, 1};

        System.out.println("Before Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));

        bubble_sort(numbers);

        System.out.println("\nAfter Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }

    public static void bubble_sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

}
