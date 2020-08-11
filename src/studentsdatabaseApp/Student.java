package studentsdatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
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
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
			
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
			System.out.println("Choose the courses you want to enroll: "
					+ "\n 1 - History 101"
					+ "\n 2 - Mathematics 101"
					+"\n 3 - English 101" 
					+ "\n 4 - Chemistry 101"
					+ "\n 5 - Computer Science 101 ");
				System.out.print("Enter course to enroll (Q to quit): ");
				Scanner in =  new Scanner(System.in);
				String course = in.nextLine();
				if (!course.equals("Q")) {
					courses = courses + "\n " + course;
					tuitionBalance = tuitionBalance + costOfCourse;
				}
				else {
					break;
				}
		} while (1 !=0);	
		//System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);
	     
	}		
	
	//View balance
	public void viewBalance() {
		System.out.println("Your Balance is : $" +tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment amount: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	//Show the status
	public String toString() {
		return "Student full name: " +firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: "  + studentID +
				"\nCourses Enrolled " + courses +
				"\nBalance: $" +tuitionBalance;
	}

}
