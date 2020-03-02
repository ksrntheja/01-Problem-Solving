package org.ksrntheja.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] numbers = {11, 25, 8, 22, 1};

        System.out.println("Before Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));

        merge_sort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }

    public static void merge_sort(int[] numbers, int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            merge_sort(numbers, start, mid);
            merge_sort(numbers, mid + 1, end);

            merge(numbers, start, mid, end);
        }
    }

    private static void merge(int[] numbers, int start, int mid, int end) {

        int part01Size = mid - start + 1;
        int part02Size = end - mid;

        int[] part01 = new int[part01Size];
        int[] part02 = new int[part02Size];

        for (int i = 0; i < part01Size; i++) {
            part01[i] = numbers[start + i];
        }
        for (int i = 0; i < part02Size; i++) {
            part02[i] = numbers[mid + 1 + i];
        }

        int part01Start = 0;
        int part02Start = 0;

        int startNumbers = start;

        while (part01Start < part01Size && part02Start < part02Size) {

            if (part01[part01Start] <= part02[part02Start]) {
                numbers[startNumbers++] = part01[part01Start++];
            } else {
                numbers[startNumbers++] = part02[part02Start++];
            }
        }

        while (part01Start < part01Size) {
            numbers[startNumbers++] = part01[part01Start++];
        }

        while (part02Start < part02Size) {
            numbers[startNumbers++] = part02[part02Start++];
        }
    }

}
