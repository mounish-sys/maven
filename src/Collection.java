import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("jayanth");
	list.add("mounish");
	String b="jayanth";
	list.remove(b);
	Iterator<String> i=list.iterator();
	while(i.hasNext()){  
		System.out.println(i.next());  
		}  
		System.out.println(list);
	int a=	list.size();
	System.out.println(a);
}
}
