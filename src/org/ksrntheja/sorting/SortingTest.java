package org.ksrntheja.sorting;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class SortingTest {

    public static int[] testCase01Input;
    public static int[] testCase01Output;
    public static int[] testCase02Input;
    public static int[] testCase02Output;
    public static int[] testCase03Input;
    public static int[] testCase03Output;

    static {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("src//TestCasesSorting.txt", "r");

            String testCase01InputLine = randomAccessFile.readLine();
            String[] testCase01InputStrings = testCase01InputLine.split(" ");
            testCase01Input = Arrays.stream(testCase01InputStrings).mapToInt(Integer::parseInt).toArray();
            String testCase01OutputLine = randomAccessFile.readLine();
            String[] testCase01OutputStrings = testCase01OutputLine.split(" ");
            testCase01Output = Arrays.stream(testCase01OutputStrings).mapToInt(Integer::parseInt).toArray();

            String testCase02InputLine = randomAccessFile.readLine();
            String[] testCase02InputStrings = testCase02InputLine.split(" ");
            testCase02Input = Arrays.stream(testCase02InputStrings).mapToInt(Integer::parseInt).toArray();
            String testCase02OutputLine = randomAccessFile.readLine();
            String[] testCase02OutputStrings = testCase02OutputLine.split(" ");
            testCase02Output = Arrays.stream(testCase02OutputStrings).mapToInt(Integer::parseInt).toArray();

            String testCase03InputLine = randomAccessFile.readLine();
            String[] testCase03InputStrings = testCase03InputLine.split(" ");
            testCase03Input = Arrays.stream(testCase03InputStrings).mapToInt(Integer::parseInt).toArray();
            String testCase03OutputLine = randomAccessFile.readLine();
            String[] testCase03OutputStrings = testCase03OutputLine.split(" ");
            testCase03Output = Arrays.stream(testCase03OutputStrings).mapToInt(Integer::parseInt).toArray();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
