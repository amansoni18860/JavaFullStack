package Searching_And_Sorting.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPairSum {

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return true;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements in Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements in Array are : ");
        display(arr);

        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();

        boolean isFound = twoSum(arr, target);

        if (isFound) {
            System.out.println("Pair with given sum exists.");
        } else {
            System.out.println("Pair with given sum does not exist.");
        }

        sc.close();
    }
}