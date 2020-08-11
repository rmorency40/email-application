/*
 Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
 Your application should do the following:
 Ask the user how many new students will be added to the database
 The user should be prompted to enter the name and year for each student
 The student should have a 5-digit unique ID, with the first number being their grade level
 A student can enroll in the following courses: History 101 Mathematics 101 English 101 Chemistry 101 Computer Science 101
 Each course costs $600 to enroll
 The student should be able to view their balance and pay the tuition
To see the status of the student, we should see their name, ID, courses enrolled, and balance
 */


package studentsdatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new students we wnat to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int maxOfStudents = in.nextInt();
		Student[] students = new Student[maxOfStudents]; // Creating an array of objects
		
		//Create n numbers of new students
		for (int n = 0; n < maxOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		 for (int n = 0; n < maxOfStudents; n++) {
			 System.out.println(students[n].toString());
		 }
	}

}
