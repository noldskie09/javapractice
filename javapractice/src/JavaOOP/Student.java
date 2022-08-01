package JavaOOP;

public class Student {
	 private String fname, lname;
	 private int year;
	 private String course;
	 private String section;
	
	Student(String fname, String lname, int year, String course, String section){
		this.fname=fname;
		this.lname=lname;
		this.year=year;
		this.course=course;
		this.section=section;
	}
	
	//setname but not use in this program
	void setname(String fname)	{
		this.fname=fname;
	}
	//getname but not use in this program
	String getfname() {
		return fname;
	}
	void studentstatus() {
		System.out.println("firstname : "+ fname);
		System.out.println("lastname : " + lname);
		System.out.println("year : " + year);
		System.out.println("course : " + course);
		System.out.println("section : " + section);
		System.out.println("");
		
	}
}
