import java.io.File;

class FileDemo {
String fname;
public static void main(String[] args) {
	String fname= args[0];
	File f=new File(fname);
	if(f.isDirectory()) {
		String[] first=f.list();
		for(String s: fList) {
			System.out.println(s);
			if(s.equals("HelloWorld.txt")) {
				
			}
		}
}
	System.out.println("Filename:"+f.getName());
	System.out.println("parent directory name:"+f.getParent());
}
}
