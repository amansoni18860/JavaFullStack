package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Parent Class
abstract class Shape {
    abstract void draw();
}

// Child Class 1
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Child Class 2
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Not a child of Shape
class Triangle {

    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class GenericMethodDemo {

    // 1. UNBOUNDED WILDCARD <?>
    public static void display(List<?> list) {

        System.out.println("\nUsing <?> Wildcard:");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    // 2. UPPER BOUNDED WILDCARD <? extends Shape>

    public static void drawShapes(List<? extends Shape> list) {

        System.out.println("\nUsing <? extends Shape> Wildcard:");

        for (Shape s : list) {
            s.draw();
        }
    }


    // 3. LOWER BOUNDED WILDCARD <? super Integer>

    public static void addNumbers(List<? super Integer> list) {

        System.out.println("\nUsing <? super Integer> Wildcard:");

        list.add(10);
        list.add(20);
        list.add(30);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {


        // <?> EXAMPLE


        List<String> names =
                Arrays.asList("Aman", "Rahul", "Neha");

        List<Integer> numbers =
                Arrays.asList(100, 200, 300);

        display(names);
        display(numbers);

        // <? extends Shape> EXAMPLE


        List<Rectangle> rectangles =
                new ArrayList<>();

        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Circle> circles =
                new ArrayList<>();

        circles.add(new Circle());
        circles.add(new Circle());

        drawShapes(rectangles);
        drawShapes(circles);

        /*
         * Compile Time Error
         *
         * List<Triangle> triangles = new ArrayList<>();
         * drawShapes(triangles);
         *
         * Triangle does not extend Shape
         */
        

        // <? super Integer> EXAMPLE

        List<Integer> intList =
                new ArrayList<>();

        List<Number> numberList =
                new ArrayList<>();

        List<Object> objectList =
                new ArrayList<>();

        addNumbers(intList);
        addNumbers(numberList);
        addNumbers(objectList);
    }
}