package lec_c_thisKeyword;

public class ThisKeywordDemo {

    String name;
    int age;

    // Using this to refer instance variables
    ThisKeywordDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Using this to call a method
    void print() {
        this.display();
    }

    public static void main(String[] args) {

        ThisKeywordDemo obj =
                new ThisKeywordDemo("Aman", 22);

        obj.print();
    }
}