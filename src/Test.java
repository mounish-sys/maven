
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println("adding integers"+ test.add(5,6));
System.out.println("adding double values"+test.add(5.2,6.5));
	}
public int add (int a, int b) {
	return a+b;
}
public double add(double a, double b) {
	return a+b;
}
}
