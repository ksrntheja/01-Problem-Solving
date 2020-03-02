package org.ksrntheja.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = {11, 25, 8, 22, 1};

        System.out.println("Before Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));

        quick_sort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }

    public static void quick_sort(int[] numbers, int start, int end) {

        if (start < end) {

            int pivot_position = partition(numbers, start, end);

            quick_sort(numbers, start, pivot_position - 1);
            quick_sort(numbers, pivot_position + 1, end);
        }
    }

    private static int partition(int[] numbers, int start, int end) {

        int pivot_boundary = start + 1;
        int pivot = numbers[start];

        for (int partition_boundary = start + 1; partition_boundary <= end; partition_boundary++) {

            if (numbers[partition_boundary] < pivot) {

                int temp = numbers[partition_boundary];
                numbers[partition_boundary] = numbers[pivot_boundary];
                numbers[pivot_boundary] = temp;

                pivot_boundary++;
            }

        }

        int temp = numbers[start];
        numbers[start] = numbers[pivot_boundary - 1];
        numbers[pivot_boundary - 1] = temp;

        return pivot_boundary - 1;
    }

}
