package javapractice;

import java.util.Scanner;
public class javalearning {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String email[] = {"user1@gmail.com", "user2@gmail.com", "user3@gmail.com", "user4@gmail.com", "user5@gmail.com"};
		String username[] = {"user1", "user2", "user3", "user4", "user5"};
		String password[] = {"pass1", "pass2", "pass3", "pass4", "pass5"};
		
		/*
		System.out.println("enter an index: ");
		int index = input.nextInt();
		
		
		 
		 
		
		username[0] +"\n"+ password[0]+"\n" + email[0];
		username[1] +"\n"+ password[1]+"\n" + email[1];
		username[2] +"\n"+ password[2]+"\n" + email[2];
		username[3] +"\n"+ password[3]+"\n" + email[3];
		username[4] +"\n"+ password[4]+"\n" + email[4];
		
		/*System.out.println("select user index")*/
		
		
		for(int i = 0; i<email.length; i++)
		{
		
		System.out.println(" index : " + i);
		System.out.println("email :" + email[i]);
		System.out.println("username :" + username[i]);
		System.out.println("password :" + password[i]);
		System.out.println("");
		}
		
		input.close();
	}

}
