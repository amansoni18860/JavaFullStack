package lect_c_MethodReference;

/*
 * Constructor Method Reference Example
 *
 * Constructor Reference Syntax:
 *      ClassName::new
 *
 * It is a shorthand form of:
 *      () -> new ClassName()
 *
 * Here, Sample::new refers to the constructor of the Sample class.
 */

// Sample class
class Sample {

    // Constructor
    Sample() {
        System.out.println("Sample Class Constructor Executed and Object Created");
    }
}

// Functional Interface
// Contains only one abstract method
interface Interf {

    // Method returns a Sample object
    Sample get();
}

public class MethodReferenceDemo1 {

    public static void main(String[] args) {

        /*
         * Constructor Reference
         *
         * Java internally treats:
         *      Sample::new
         * as
         *      () -> new Sample()
         */
        Interf i = Sample::new;

        /*
         * Calling get() invokes the Sample constructor
         * and returns the created object.
         */
        Sample s = i.get();

        // Object reference created successfully
        System.out.println("Object Reference : " + s);
    }
}

/*
 * Execution Flow:
 *
 * 1. Interf i = Sample::new;
 *      -> Constructor reference is created.
 *
 * 2. i.get();
 *      -> Calls Sample constructor.
 *
 * 3. Constructor executes and creates object.
 *
 * Output:
 *
 * Sample Class Constructor Executed and Object Created
 * Object Reference : lect_c_MethodReference.Sample@XXXXXX
 *
 * Equivalent Lambda Expression:
 *
 * Interf i = () -> new Sample();
 *
 * Constructor Reference Version:
 *
 * Interf i = Sample::new;
 */