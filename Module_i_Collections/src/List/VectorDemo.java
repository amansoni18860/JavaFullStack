package List;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Default capacity = 10
        Vector<String> v = new Vector<>();

        System.out.println("Initial Capacity : " + v.capacity());
        System.out.println("Initial Size     : " + v.size());

        // Add elements
        v.add("ABC");
        v.add("XYZ");
        v.add("PQR");
        v.add("MNO");
        v.add("EFG");

        System.out.println("\nVector Elements : " + v);
        System.out.println("Size            : " + v.size());
        System.out.println("Capacity        : " + v.capacity());

        // Insert element
        v.add(2, "JAVA");
        System.out.println("\nAfter Insertion : " + v);

        // Update element
        v.set(1, "PYTHON");
        System.out.println("After Update    : " + v);

        // Remove element
        v.remove("MNO");
        System.out.println("After Removal   : " + v);

        // Access element
        System.out.println("\nFirst Element   : " + v.firstElement());
        System.out.println("Last Element    : " + v.lastElement());

        // Search element
        System.out.println("Contains JAVA?  : " + v.contains("JAVA"));

        // Traverse using for-each loop
        System.out.println("\nTraversing Vector:");
        for (String str : v) {
            System.out.println(str);
        }

        // Demonstrate capacity growth
        for (int i = 1; i <= 10; i++) {
            v.add("Item" + i);
        }

        System.out.println("\nFinal Size      : " + v.size());
        System.out.println("Final Capacity  : " + v.capacity());
    }
}