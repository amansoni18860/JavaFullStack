package project.mini.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

	private static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		String fileName = "students.txt";
		readStudentData(fileName);

		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println(
					"\n---------------------------------------------Student Management System--------------------------------------------------------");
			System.out.println("1.	Add Student");
			System.out.println("2.	Remove Student");
			System.out.println("3.	Update Student");
			System.out.println("4.	Display Students By Name (Ascending)");
			System.out.println("5.	Display Students By GPA (Descending)");
			System.out.println("6.	Exit");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudent(sc);
				break;

			case 2:
				removeStudent(sc);
				break;

			case 3:
				updateStudent(sc);
				break;

			case 4:
				showStudentsByName();
				break;

			case 5:
				showStudentsByGpa();
				break;

			case 6:
				exit = true;
				System.out.println("Thank you for using the Student Management System.");
				break;
			default:
				System.out.println("This is Invalid Choice. Please Try Again Later!");
				break;
			}
		}

	}

	public static void readStudentData(String fileName) {

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] data = line.split(" ");
				int id = Integer.parseInt(data[0].trim());
				String name = data[1].trim();
				double gpa = Double.parseDouble(data[2].trim());
				String city = data[3].trim();
				String university = "XYZ";

				Student student = new Student(id, name, gpa, city, university);
				students.add(student);
			}
			System.out.println("Student data loaded successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while reading the student data : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number format in the student data : " + e.getMessage());

		}
	}

	public static void addStudent(Scanner sc) {
		System.out
				.println("\n---------------------------------- Add Student -----------------------------------------");

		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		sc.nextLine(); // consume newline character

		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		System.out.println("Enter GPA : ");
		double gpa = sc.nextDouble();
		sc.nextLine(); // consume newline character

		System.out.println("Enter City : ");
		String city = sc.nextLine();

		Student student = new Student(id, name, gpa, city, "XYZ");
		students.add(student);

		System.out.println("Student Added Successsfully.");
	}

	public static void removeStudent(Scanner sc) {
		System.out.println(
				"\n------------------------------------------ Remove Student Data -----------------------------------------");

		System.out.println("Enter the ID of the student to remove : ");
		int id = sc.nextInt();

		boolean found = false;

		Iterator<Student> iterator = students.iterator();

		while (iterator.hasNext()) {
			Student s = iterator.next();
			if (s.getId() == id) {
				iterator.remove();
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Student Data Removed Successfully.");
		} else {
			System.out.println("Student Not Found.");
		}
	}

	public static void updateStudent(Scanner sc) {

		System.out.println(
				"\n----------------------------Update Student Data ------------------------------------------");

		System.out.println("Enter the ID of the student to update : ");
		int id = sc.nextInt();

		boolean found = false;

		for (Student s : students) {

			if (s.getId() == id) {
				System.out.println("Enter Name : ");
				String name = sc.nextLine();
				if (!name.isEmpty()) {
					s.setName(name);
				}

				System.out.println("Enter GPA : ");
				String gpaInput = sc.nextLine();
				if (!gpaInput.isEmpty()) {
					double gpa = Double.parseDouble(gpaInput);
					s.setGpa(gpa);
				}

				System.out.println("Enter City : ");
				String city = sc.nextLine();

				if (!city.isEmpty()) {
					s.setCity(city);
				}

				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Student Updated Succesfully.");
		} else {
			System.out.println("Student Not Found.");
		}
	}

	public static void showStudentsByName() {

		System.out.println(
				"-------------------------------------- Student by Name (Ascending) -------------------------------------------");

		List<Student> sortedStudents = new ArrayList<>(students);

		Collections.sort(sortedStudents, Comparator.comparing(Student::getName));

		System.out.println("ID\tName\tGPA\tUniversity\tCity");
		System.out.println(
				"**********************************************************************************************************************");
		showStudents(sortedStudents);
	}

	public static void showStudentsByGpa() {
		System.out.println(
				"-----------------------------------------------Students By GPA (Descending) ---------------------------------");

		List<Student> sortedStudents = new ArrayList<>(students);

		Collections.sort(sortedStudents, Comparator.comparing(Student::getGpa).reversed());

		System.out.println("ID\tName\tGPA\tUniversity\tCity");
		System.out.println(
				"***********************************************************************************************************");
		showStudents(sortedStudents);
	}

	public static void showStudents(List<Student> students) {
		for (Student stu : students) {
			System.out.println(stu);
		}
	}

}
