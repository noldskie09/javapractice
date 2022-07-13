package javapractice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class quizgame {

	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int score=0;
		// initialize array
		String q[] = new String[3];
		String a[] = new String[3];
		String b[] = new String[3];
		String c[] = new String[3];
		String ans[] = new String[3];
		
		//question
		q[0] = "1+1 ";
		q[1] = "2+2 ";
		q[2] = "4+4 ";
		
		//choices for q1
		a[0] = "a = 1" ;
		b[0] = "b = 2" ;
		c[0] = "c = 3" ;
		
		//choices for q2
		a[1] = "a = 4" ;
		b[1] = "b = 2" ;
		c[1] = "c = 3" ;
		
		//choice ;
		a[2] = "a = 1" ;
		b[2] = "b = 2" ;
		c[2] = "c = 8" ;
		
		//answer
		ans[0] = "b" ;
		ans[1] = "a" ;
		ans[2] = "c" ;
		
		
		
		System.out.println("    Quiz game");
		
		System.out.print("enter your name: ");
		String name = input.nextLine();
		
		for(int i=0; i<q.length; i++)
		{
		System.out.println(q[i]);
		System.out.println(a[i]);
		System.out.println(b[i]);
		System.out.println(c[i]);
		
		System.out.print(" Enter your answer: ");
		String answer = input.nextLine();
		
				if(ans[i].equals(answer)) {
					score++;	
				}
				else {
					score = score + 0;
						 
				}
				
		}
		
		System.out.println("hi "+ name+ " Thanks for answering question your score is " + score);
		
		/* try again decsion
		System.out.println("Do you want to try again? y/n?");
		String tryagain = input.nextLine();
		
		switch(tryagain)
		{
		case "y":
			System.out.println(" okay ");
			break;
		case "n":	
			
			break;
			}
		
			*/
		
			System.out.print("enter how many array numbers");
			int arrnum= input.nextInt(); 
			System.out.println("");
			
			int arr[]= new int [arrnum];
			
			for(int j=0; j<arr.length; j++)
			{
				System.out.print("enter your array number: ");
				arr[j] = input.nextInt();
				
			}
			
			System.out.println("this are the unsorted array" );
			
			for(int x=0; x< arr.length; x++) {
				
				System.out.println(arr[x]);
				
			}
			
			// sorting the array
			Arrays.sort(arr);
			
			
			System.out.println("this is the sorted array ");
			
			for(int y=0; y<arr.length; y++) {
				System.out.println(arr[y]);
			}
			
			
			System.out.print(" ");
			
		input.close();

}
}