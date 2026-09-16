package lec_g_Inheritance;

public class TechEmp extends Employee {

    private String technology;

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void showTechDetails() {
        display();  // inherited method
        System.out.println("Technology  : " + technology);
    }

    public static void main(String[] args) {

        TechEmp te = new TechEmp();

        te.setEmp(101, "Rajesh", 990000);
        te.setTechnology("Java");

        te.showTechDetails();
    }
}