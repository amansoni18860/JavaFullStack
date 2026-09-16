package problem7;

public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine("LG", 1500);
        Appliance rf = new Refrigerator("Samsung", 800);
        Appliance mw = new Microwave("Panasonic", 1200);

        wm.turnOn();
        rf.turnOn();
        mw.turnOn();
    }
}
