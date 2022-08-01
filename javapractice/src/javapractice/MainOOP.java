package javapractice;
import java.util.Scanner;
public class MainOOP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		PersonOOP person1 = new PersonOOP("john","doe",18,"male","earth");
		PersonOOP person2 = new PersonOOP("hatdog","doe",19,"female","Mars");
		PersonOOP person3 = new PersonOOP("futlong","doe");
		
		person1.boy();
		person1.setfname("hamburger");
		person1.boy();
		person2.girl();
		
		
		
		System.out.println(person3.getfname());
		System.out.println(person2.getage());
		
	
		
	}

}
