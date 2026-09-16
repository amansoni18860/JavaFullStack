package lec_h_Polymorphism;

public class TechEmp extends Employee {

    @Override
    void work() {
        System.out.println("Tech Employee is coding");
    }

    void develop() {
        System.out.println("Developing Java Application");
    }
}