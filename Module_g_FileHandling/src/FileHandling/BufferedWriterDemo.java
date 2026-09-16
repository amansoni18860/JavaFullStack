package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		// File f = new File("file.txt");
		// FileWriter fw = new FileWriter(f,true); // appending true

		// BufferedWriter bw=new BufferedWriter(fw);
		BufferedWriter bw=new BufferedWriter(new FileWriter("file1.txt",true));
		bw.write("\nHello World");
		bw.write("\nI am Learning Buffered Writer File Handling IN JAVA");

		bw.close();
		
		
		System.out.println("File Written Successfully...");
	}


}
