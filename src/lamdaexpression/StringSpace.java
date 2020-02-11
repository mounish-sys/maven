package lamdaexpression;

@FunctionalInterface
interface strgap{
	void string(String str);
}
public class StringSpace {
	public static void main(String args[]) {

strgap sg=(String str)->System.out.println(str.replace("", " ").trim());
sg.string("Hello");
}
}