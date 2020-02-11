import java.io.*;
public class ObjectIOStream {
public static void main(String args[]) {
	try(FileOutputStream fos=new FileOutputStream("D:/New folder/HelloWorld.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);)
	{
		Student s1=new Student(2,"tyson");
		System.out.println("s1 object is:"+s1);
		oos.writeObject(s1);
		oos.flush();
	}
	catch(Exception e) {
		
	
}
	try(FileInputStream fis=new FileInputStream("D:/New folder/HelloWorld.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);)
	{
		Object o=ois.readObject();
		Student c=(Student) o;
        c.displayStudentInfo();
	
	}
			catch(Exception e)
{
				}
}
}
