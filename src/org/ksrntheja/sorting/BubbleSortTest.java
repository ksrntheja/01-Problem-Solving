package org.ksrntheja.sorting;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        System.out.println("*****************************************************************************************");
        System.out.println("TESTCASE-01");
        System.out.println("*****************************************************************************************");
        tester(SortingTest.testCase01Input, SortingTest.testCase01Output);

        System.out.println("*****************************************************************************************");
        System.out.println("TESTCASE-02");
        System.out.println("*****************************************************************************************");
        tester(SortingTest.testCase02Input, SortingTest.testCase02Output);

        System.out.println("*****************************************************************************************");
        System.out.println("TESTCASE-03");
        System.out.println("*****************************************************************************************");
        tester(SortingTest.testCase03Input, SortingTest.testCase03Output);
    }

    private static void tester(int[] numbers, int[] sortedNumbers) {

        System.out.println("Before Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
        BubbleSort.bubble_sort(numbers);
        // By default, assertions are disabled. Add '-ea' to VM options.
        assert Arrays.equals(numbers, sortedNumbers);
        System.out.println("\nAfter Sorting");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }

}
