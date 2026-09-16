package lec_e_ControlStatements.ConditionalStatements;

public class ConditionalStatements {

    public static void main(String[] args) {

        int age = 20;
        int marks = 78;
        int day = 3;

        // if statement
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        // if-else statement
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        // nested if
        if (age >= 18) {
            if (marks >= 75) {
                System.out.println("Scholarship Eligible");
            }
        }

        // traditional switch
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid Day");
        }

        // switch with String
        String month = "JAN";

        switch (month) {
        case "JAN":
            System.out.println("January");
            break;
        case "FEB":
            System.out.println("February");
            break;
        case "MAR":
            System.out.println("March");
            break;
        default:
            System.out.println("Unknown Month");
        }

        // modern switch expression (Java 14+)
        String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid Day";
        };

        System.out.println(result);
    }
}