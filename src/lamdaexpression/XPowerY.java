package lamdaexpression;
import java.lang.Math;
@FunctionalInterface
interface power{
	void xpowery(double x, double y);
	
}
public class XPowerY {
public static void main(String args[]) {
	power in=(double x,double y)->System.out.println(Math.pow(x,y));
	in.xpowery(2, 2);
}
}
