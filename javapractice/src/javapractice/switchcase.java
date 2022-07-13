package javapractice;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String monthword=" ";

		System.out.println("enter a month");
		int month = input.nextInt();
		
		System.out.println("enter a date");
		int date = input.nextInt();
		
		System.out.println("enter a year");
		int year = input.nextInt();
		
		
		
		switch(month) 
		{
		case 1:
			monthword = "january";
			break;
		case 2:
			monthword = "february";
			break;
		case 3:
			monthword = "march";
			break;
		case 4:
			monthword = "april";
			break;
		case 5:
			monthword = "may";
			break;	
		case 6:
			monthword = "june";
			break;
		case 7:
			monthword = "july";
			break;
		case 8:
			monthword = "augost";
			break;
		case 9:
			monthword = "september";
			break;
		case 10:
			monthword = "october";
			break;
		case 11:
			monthword = "november";
			break;
		case 12:
			monthword = "december";
			break;	
		default:
			System.out.println("invald month");
	}
		System.out.println(monthword+ " "+date + " " + year);
		
		input.close();
		
		}
		
	}


