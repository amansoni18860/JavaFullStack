package lec_a_Class_And_Object;

public class NextExample {

    String brand;
    String color;
    int price;

    void start() {
        System.out.println(brand + " is starting...");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        NextExample car1 = new NextExample();

        car1.brand = "BMW";
        car1.color = "Black";
        car1.price = 5000000;

        car1.display();
        car1.start();

        System.out.println();

        NextExample car2 = new NextExample();

        car2.brand = "Audi";
        car2.color = "White";
        car2.price = 4500000;

        car2.display();
        car2.start();
    }
}