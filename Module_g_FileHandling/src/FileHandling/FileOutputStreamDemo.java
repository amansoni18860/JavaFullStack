package FileHandling;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try {
			java.io.FileOutputStream fout = new java.io.FileOutputStream("abc.txt");
			String str = "Hello World";

			byte b[] = str.getBytes();

			fout.write(b);

			fout.close();
			System.out.println("Success Written...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
