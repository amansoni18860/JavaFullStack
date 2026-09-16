package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {

		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		
		int x;
		
		while((x=br.read())!=-1) {
			System.out.print((char)x);
		}
		br.close();
	}

}
