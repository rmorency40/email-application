package studentsdatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private String tuitionBalance;
	private int costOfCourse = 600;
	
	
	// Constructor prompts user to enter student's nad and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Softmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
			
	}
	
	//Generate the ID
	
	//Enroll in courses
	
	//View balance
	
	//Pay tuition
	
	//Show the status

}
