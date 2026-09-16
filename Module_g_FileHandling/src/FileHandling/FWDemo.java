package FileHandling;

import java.io.*;

public class FWDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("file.txt");
	//	FileWriter fw = new FileWriter(f); // appending false
		FileWriter fw = new FileWriter(f,true); // appending true

		fw.write("\nHello World");
		fw.write("\nI am Learning File Handling IN jAVA");

		fw.close();
		
		
		System.out.println("File Written Successfully...");
	}

}
