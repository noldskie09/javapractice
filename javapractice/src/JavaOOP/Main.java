package JavaOOP;
import java.util.Scanner;
public class Main {

	
	// array object with constructor and encapsulation
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter how many student:");
		int studentnum = s.nextInt();
		s.nextLine();

		
		Student student[] = new Student[studentnum];
		
	
		for(int i=0; i<student.length; i++) {
		
			System.out.println("Student number: " + (i+1));
			System.out.println("");
			
			System.out.println("Enter first name: ");
			String fname = s.nextLine(); 
			System.out.println("Enter last name: ");
			String lname = s.nextLine();
			System.out.println("Enter a year : ");
			int year = s.nextInt();
			s.nextLine();
			
			System.out.println("Enter your course : ");
			String course = s.nextLine();
			System.out.println("Enter your section : ");
			String section = s.nextLine();
			
			student[i] = new Student(fname, lname, year,course,section);
		}
		for(int x=0; x<student.length; x++) {
			student[x].studentstatus();
			
		}
		
	}

	
	}
