package javapractice;
import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	    	
		 
		
	       /* System.out.print("Enter your first number: ");
	        int number1 = input.nextInt();
	        System.out.print("Enter your second number: ");
	        int number2 = input.nextInt();
	    
	        int result = number1+number2;
	        System.out.println("adding result of two number is \n: "+result);
	        */
	        
	        System.out.print("Enter your firstname: ");
	        String firstname= input.nextLine();
	        System.out.print("Enter your lastname: ");
	        String lastname= input.nextLine();

	         System.out.println("your full name is: "+ firstname+" "+lastname);
	        

	        System.out.print("Enter your grade: ");
	        int grade= input.nextInt();
	        
	        if(grade >=90 && grade <= 100)
	            System.out.print("you grade is 1.0 ");
	        else if(grade >=80 && grade <=89)
	            System.out.print("you grade is 1.50 ");
	        else if(grade >=70 && grade <=79)
	            System.out.print("you grade is 3.0 ");
	        else
	            System.out.print("you grade is 5.0 ");
	        
	        
	        
	        // closing the scanner object
	        input.close();
	}

}
