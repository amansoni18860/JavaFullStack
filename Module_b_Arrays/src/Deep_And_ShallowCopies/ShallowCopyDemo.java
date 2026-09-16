package Deep_And_ShallowCopies;

import java.util.Arrays;

public class ShallowCopyDemo {

    public static void main(String[] args) {

        // =======================
        // 1D ARRAY
        // =======================
        int[] original1D = {1, 2, 3};

        int[] assign1D = original1D;
        int[] clone1D = original1D.clone();
        int[] copyOf1D = Arrays.copyOf(original1D, original1D.length);

        assign1D[0] = 100;  // affects original
        clone1D[1] = 200;   // does NOT affect original
        copyOf1D[2] = 300;  // does NOT affect original

        System.out.println("===== 1D ARRAY =====");
        System.out.println("Original : " + Arrays.toString(original1D));
        System.out.println("Assign   : " + Arrays.toString(assign1D));
        System.out.println("Clone    : " + Arrays.toString(clone1D));
        System.out.println("CopyOf   : " + Arrays.toString(copyOf1D));



        // =======================
        // 2D ARRAY
        // =======================
        int[][] original2D = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] assign2D = original2D;
        int[][] clone2D = original2D.clone();
        int[][] copyOf2D = Arrays.copyOf(original2D, original2D.length);

        assign2D[0][0] = 100;
        clone2D[0][1] = 200;
        copyOf2D[0][2] = 300;

        System.out.println("\n===== 2D ARRAY =====");
        System.out.println("Original:");
        printArray(original2D);

        System.out.println("\nClone:");
        printArray(clone2D);

        System.out.println("\nCopyOf:");
        printArray(copyOf2D);
    }

    static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}