/**
 * example for single inheritance 
 */


class Shape {
private int length;
private int breadth;

Shape(int length, int breadth)
{
	System.out.println("in constructor of Shape class");
	this.length=length;
	this.breadth=breadth;
	
}
public void display() {
	System.out.println("length is"+length+"breadth is"+breadth);
}
}
class Cuboid extends Shape{
	private int height;
	Cuboid(int length,int breadth,int height){
	super(length,breadth);
	System.out.println("constructor of cuboid class");
	this.height=height;
	}
public static void main(String args[]) {
Cuboid c=new Cuboid(10,11,12);
c.display();
}
public void display() {
	System.out.println("in display----child");
super.display();
System.out.println("height is"+height);
}
}
