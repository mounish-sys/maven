import java.io.*;
import java.io.Serializable;
public class Student implements Serializable{
	private static final long serialVersionUID=1L;
	int roll;
	String name;
	public Student(int r,String n) {
		this.roll=r;
		this.name=n;
	}

public  void displayStudentInfo() {
	Student a=new Student(1,"mounish");
	System.out.println(a.toString());
	
}
}
