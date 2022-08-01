package javapractice;

public class PersonOOP {

	private String fname, lname,sex,address;
	private int age;
	
	PersonOOP(String fname, String lname,int age, String sex, String address){
		this.fname=fname;
		this.lname=lname;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
	
	PersonOOP(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
		sex="n/a";
		address="n/a";
		int age=0;
		
		
		
	}
	//setter - remove to make more private and can't editable
	void setfname(String fname) {
		this.fname=fname;
	}
	
	//getter
	String getfname(){
		return fname;
	}
	int getage(){
		return age;
	}
	
	void boy() {
		System.out.println(this.fname + " is a boy");
	}
	
	void girl() {
		System.out.println(this.fname + " is a girl");
	}
	
}
