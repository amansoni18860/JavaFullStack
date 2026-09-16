package List;

import java.util.*;

// Employee class
class Employee {

    private int id;
    private String name;
    private double cgpa;
    private String city;
    private String institute;

    // Constructor
    public Employee(int id, String name, double cgpa,
                    String city, String institute) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.city = city;
        this.institute = institute;
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", cgpa=" + cgpa +
               ", city='" + city + '\'' +
               ", institute='" + institute + '\'' +
               '}';
    }
}

// Main class
public class ListDemo {

    public static void main(String[] args) {

        // Generic List
        List<Employee> arrList = new ArrayList<>();

        arrList.add(new Employee(101, "Raj", 9.1,
                                 "Bangalore", "University"));

        arrList.add(new Employee(102, "Ramesh", 7.4,
                                 "Mumbai", "College"));

        arrList.add(new Employee(103, "Manash", 2.25,
                                 "Delhi", "School"));

        // Print complete list
        System.out.println(arrList);
         
        System.out.println();
        
        Iterator itr=arrList.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	System.out.println();
        }
        
    
    }
}