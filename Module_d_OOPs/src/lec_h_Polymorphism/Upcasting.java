package lec_h_Polymorphism;

/*
 * UPCASTING
 *
 * Parent Reference = Child Object
 *
 * Employee emp = new TechEmp();
 *
 * Upcasting is automatic.
 *
 * Used for Runtime Polymorphism.
 */

public class Upcasting {

    public static void main(String[] args) {

        Employee emp = new TechEmp();

        emp.work();

        // emp.develop(); // Not Allowed

        /*
         * Reference Type = Employee
         * Object Type = TechEmp
         *
         * Employee methods can be accessed.
         * Overridden methods execute from child.
         */
    }
}