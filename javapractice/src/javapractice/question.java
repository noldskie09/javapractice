package javapractice;

public class question extends Gui{
	int index=0;

	String q1[]= {
			
			"1. what is color of banana: ",
			"2. what is color of sky: ",
			"3. what is color of forest: ",
			"4. what is color of dessert: ",
			"5. what is color of Lava: ",
			"6. addtion of 1 + 2 : ",
			"7. multiply 9 x 9 : ",
			"8. substract 5-3 :  ",
			"9. 10 / 2 : ",
			"10. 6 + (3*4) / 4 : "		
			};
	
	String choicesA[] ={
			"a. blue",
			"a. blue",
			"a. yellow",
			"a. green",
			"a. red",
			"a. 1",
			"a. 91",
			"a. 1",
			"a. 5",
			"a. 9",
	};
	
	String choicesB[] ={
			"b. yellow",
			"b. red",
			"b. blue",
			"b. red",
			"b. green",
			"b. 2",
			"b. 81",
			"b. 2",
			"b. 12",
			"b. 1",
	};
	
	String choicesC[] ={
			"c. red",
			"c. yellow",
			"c. green",
			"c. brown",
			"c. brown",
			"c. 3",
			"c. 71",
			"c. 5",
			"c. 20",
			"c. 6",
	};
	
	String ans[]= 
		{ 	"b",
			"a",
			"c",
			"c",
			
			"a",
			"c",
			"b",
			"b",
			"a",
			"a"
			};	
		
	String fname;
	String lname;
	int age;
	
	question(String fname, String lname, int age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		
		}
		

		
	}

	
