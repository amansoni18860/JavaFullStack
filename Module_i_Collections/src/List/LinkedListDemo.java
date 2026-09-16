package List;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> l1 = new LinkedList<>();

        l1.add("ABC");
        l1.add("XYZ");
        l1.add("PQR");
        l1.add("EFG");
        l1.add("MNO");

        System.out.println("Before Modification: " + l1);

        ListIterator<String> litr = l1.listIterator();

        while (litr.hasNext()) {

            String str = litr.next();

            // Replace ABC with APM
            if (str.equalsIgnoreCase("ABC")) {
                litr.set("APM");
            }

            // Remove XYZ
            if (str.equals("XYZ")) {
                litr.remove();
            }
        }

        System.out.println("After Modification: " + l1);
    }
}