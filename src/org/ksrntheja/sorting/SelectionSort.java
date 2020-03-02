package org.ksrntheja.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {11, 25, 8, 22, 1};

        System.out.println("Before Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));

        selection_sort(numbers);

        System.out.println("\nAfter Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }

    public static void selection_sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int minimum_index = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[minimum_index] > numbers[j]) {
                    minimum_index = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minimum_index];
            numbers[minimum_index] = temp;
        }
    }

}
