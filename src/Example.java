
import java.util.*;
public class Example {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		System.out.println(c+" is at position "+i);
	}
	}
}

