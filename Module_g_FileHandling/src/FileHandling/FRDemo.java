package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FRDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr=new FileReader("file.txt");
		
		int x;
		
		while((x=fr.read())!=-1) {
			System.out.print((char)x);
		}
	}

}
