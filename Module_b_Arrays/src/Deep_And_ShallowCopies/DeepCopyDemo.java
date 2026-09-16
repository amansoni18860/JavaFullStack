package Deep_And_ShallowCopies;

import java.util.Arrays;

public class DeepCopyDemo {

    public static void main(String[] args) {

        // ==========================
        // 1D ARRAY DEEP COPY
        // ==========================
        int[] original1D = {1, 2, 3};

        int[] clone1D = original1D.clone();
        int[] copyOf1D = Arrays.copyOf(original1D, original1D.length);

        int[] arrayCopy1D = new int[original1D.length];
        System.arraycopy(original1D, 0, arrayCopy1D, 0, original1D.length);

        clone1D[0] = 100;
        copyOf1D[1] = 200;
        arrayCopy1D[2] = 300;

        System.out.println("===== 1D ARRAY =====");
        System.out.println("Original   : " + Arrays.toString(original1D));
        System.out.println("Clone      : " + Arrays.toString(clone1D));
        System.out.println("Arrays.copyOf : " + Arrays.toString(copyOf1D));
        System.out.println("arraycopy  : " + Arrays.toString(arrayCopy1D));



        // ==========================
        // 2D ARRAY DEEP COPY
        // ==========================
        int[][] original2D = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Deep Copy using clone() row-wise
        int[][] clone2D = new int[original2D.length][];
        for (int i = 0; i < original2D.length; i++) {
            clone2D[i] = original2D[i].clone();
        }

        // Deep Copy using Arrays.copyOf() row-wise
        int[][] copyOf2D = new int[original2D.length][];
        for (int i = 0; i < original2D.length; i++) {
            copyOf2D[i] =
                    Arrays.copyOf(original2D[i], original2D[i].length);
        }

        // Deep Copy using System.arraycopy()
        int[][] arrayCopy2D =
                new int[original2D.length][original2D[0].length];

        for (int i = 0; i < original2D.length; i++) {
            System.arraycopy(
                    original2D[i],
                    0,
                    arrayCopy2D[i],
                    0,
                    original2D[i].length
            );
        }

        clone2D[0][0] = 100;
        copyOf2D[0][1] = 200;
        arrayCopy2D[0][2] = 300;

        System.out.println("\n===== 2D ARRAY =====");

        System.out.println("Original:");
        printArray(original2D);

        System.out.println("\nClone Row-wise:");
        printArray(clone2D);

        System.out.println("\nArrays.copyOf Row-wise:");
        printArray(copyOf2D);

        System.out.println("\nSystem.arraycopy:");
        printArray(arrayCopy2D);
    }

    static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}