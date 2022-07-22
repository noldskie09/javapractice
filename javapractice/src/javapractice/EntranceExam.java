package javapractice;
import java.util.Scanner;
public class EntranceExam{

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		question q = new question("john", "dog", 19);
		
		
		System.out.printf(q.fname, q.lname, q.age);
		
		int score1 =0;
		
		
		
		System.out.print("Enter you name: ");
		String name= input.nextLine();
		
	
		// color question
		for (int i=0; i<q.q1.length; i++)
		{
			System.out.println(q.q1[i]);
			System.out.println(q.choicesA[i]);
			System.out.println(q.choicesB[i]);
			System.out.println(q.choicesC[i]);
			
			
					System.out.print(" Enter your answer: ");
					String answer1 = input.nextLine();
					
					if(q.ans[i].equals(answer1)) {
						score1++;	
					}
					else {
						score1 = score1 + 0;
						
							 
					}
				
			}
		System.out.println("Congrats "+ name+" your score is "+ score1);
		
			
		}
		}
		
	

