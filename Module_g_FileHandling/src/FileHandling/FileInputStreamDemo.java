package FileHandling;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("abc.txt");

			int x;

			while ((x = fin.read()) != -1) {
				System.out.print((char) x);
			}
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
