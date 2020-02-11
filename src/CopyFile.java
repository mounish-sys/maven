import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class CopyFile {
FileInputStream fromFile;
FileOutputStream toFile;
public void anyt(String arg1,String arg2) {
	try {
		fromFile=new FileInputStream(arg1);
		toFile=new FileOutputStream(arg2);
		}

catch(FileNotFoundException fnfe) {
	System.out.println("exception"+fnfe);
}
	catch(ArrayIndexOutOfBoundsException aob) {
		System.out.println("exception"+aob);
		
	}}
	public void copyContents() {
		try {
			int i=fromFile.read();
			while(i!=-1) {
				toFile.write(i);
				i=fromFile.read();
			}
		}catch (IOException ioe) {
			System.out.println("exception"+ioe);
	return;
		}
		}
public void closeFile() {
	try {
	fromFile.close();
	toFile.close();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String args[]) {
	CopyFile c1=new CopyFile();
	c1.anyt("D:/New folder/HelloWorld.txt","D:/new folder/kk.txt");
	c1.copyContents();
c1.closeFile();	
}
}



