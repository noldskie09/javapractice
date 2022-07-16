package javapractice;

public class codingtest {

	public static void main(String[] args) {
		
		// select the second number without using sort array
		//input 5,1,9,2,6,8
		
		int array[] = {5,1,9,2,6,8,66,77,88,24,75,16,99};
		int num1;
		int num2;
		int temp;
		
		if(array[0]>array[1]) {
			num1=array[0];
			num2=array[1];
		}
		
		else {
			num1=array[1];
			num2=array[0];
		}
		
		for(int i=2; i<array.length; i++) {
			if(num1<array[i]){
				temp=num1;
				num2=temp;
				num1=array[i];		
			}
			else {
				num2=array[i];
			}
			
		}
		System.out.println(num2);
		// end of coding test 1
		
		
		// balance
		int accbal = 25000;
		int minbal = 1500;
		int withdraw = 2000;
		
		while (withdraw < accbal && accbal-withdraw > minbal) {
			
			accbal=accbal-withdraw;
			System.out.println(accbal);
			
		}
		// end balance
		
		// add all the number
		int sum=1;
		
		for(int x=1; x<=10; x++)
		{
		sum=sum + x;
		System.out.println(sum);
		}
		
		System.out.println(sum);
		
		// end add
		
		//add even number
int o=1;
int add1 =0;
		for( o=1; o<=11; o++)
		{
			if(o % 2== 0) {
		System.out.println(o);
			}
			else {
				add1=add1+o;
				o++;
				System.out.println(o);
			}
			
			}
		
		
		}
		
		
	
	}


