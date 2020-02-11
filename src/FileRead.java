import java.io.BufferedReader;
import java.io.*;
public class FileRead {
public static void main(String[] args) {
	String s;
	try(BufferedReader br=new BufferedReader(new FileReader("D:/New folder/HelloWorld.txt"));)
	{
		while((s = br.readLine())!=null) {
			System.out.println(s);		
		}}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
		
}

