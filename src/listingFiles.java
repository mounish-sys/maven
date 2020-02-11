import java.io.*;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.util.List;
public class listingFiles {
public static void main(String[] args) throws IOException {
	path file=paths.get("D:/New folder/HelloWorld.txt");
	List<String> lines=Files.readAllLines(file);
	for(Stringnline:lines) {
		System.out.println(line);
	
	}
}
}
