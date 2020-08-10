package studentsdatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int  tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor prompts user to enter student's nad and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Softmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
			
	}
	
	//Generate the ID
	private void setStudentID() {
		
		// grade level plus static ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	
	public void enroll() {
		do {
				System.out.print("Enter course to enroll (Q to quit): ");
				Scanner in =  new Scanner(System.in);
				String course = in.nextLine();
				if (!course.equals("Q")) {
					courses = courses + "\n" + course;
					tuitionBalance = tuitionBalance + costOfCourse;
				}
				else {
					System.out.println("BREAK! ");
					break;
				}
		} while (1 !=0);	
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	     
	}		
	
	//View balance
	
	//Pay tuition
	
	//Show the status

}
