package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
    // Constructor to receive the  first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName =  firstName;
		this.lastName = lastName;
		//System.out.println("Email CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that returns arandom password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is: " +this.password);
		
		//Combine element to nenerate teh email address
		
		email = firstName.toLowerCase() + '.' + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " +email);
	}
	
	// Ask for the  department
	
	private String setDepartment() {
		System.out.print("New worker " + firstName + " .Department  codes :\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else {return ""; }
		
	}
	
	// Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			//System.out.println(rand);
			//System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	
	public void SetMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email address
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Get methods
	
	public int getMailBoxCapacity () { return mailBoxCapacity;}
	public  String getalternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName + " " +
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + " mb ";
				
	}
	
}
