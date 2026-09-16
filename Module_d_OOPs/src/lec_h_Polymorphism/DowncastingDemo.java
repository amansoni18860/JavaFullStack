package lec_h_Polymorphism;

/*
 * DOWNCASTING
 *
 * Child Reference = Parent Reference
 *
 * Explicit casting required
 */

public class DowncastingDemo {

    public static void main(String[] args) {

        Employee emp = new TechEmp();

        TechEmp te = (TechEmp) emp;

        te.work();
        te.develop();
    }
}