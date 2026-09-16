package Searching_And_Sorting.SortingAlgos;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];  // 1 2 3 5

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m]; // 2 2 3 4 5

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();   // 1 2 3 5

        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Common Elements:");

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num); // avoids duplicate printing
            }
        }

        sc.close();
    }
}