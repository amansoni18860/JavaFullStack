package problem10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CaesarCipherFile {
	
	
	public static String encrypt(String text, int shift) {
		StringBuilder result=new StringBuilder();
		
		for(char ch:text.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				char c=(char)(((ch-'A'+shift)%26)+'A');
				result.append(c);
			}else if(Character.isLowerCase(ch)) {
				char c=(char)(((ch-'a'+shift)%26)+'a');
				result.append(c);
			}else {
				result.append(ch);
			}
			
		}
		return result.toString();
	}
	
	
	public static String decrypt(String text,int shift) {
		return encrypt(text,26-shift);
	}

	
	public static void main(String[]args) {
		String message = "Hello World";
        int shift = 3;

        String encrypted = encrypt(message, shift);
        String decrypted = "";

        // Step 1: Write encrypted text to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/problem10/enc_message.txt"))) {
            writer.write(encrypted);
            System.out.println("Encrypted message written to enc_message.txt");
        } catch (IOException e) {
            System.out.println("Error writing encrypted message: " + e.getMessage());
        }

        // Step 2: Read encrypted text from file and decrypt it
        try (BufferedReader reader = new BufferedReader(new FileReader("src/problem10/enc_message.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                decrypted += decrypt(line, shift);
            }
        } catch (IOException e) {
            System.out.println("Error reading encrypted message: " + e.getMessage());
        }

        // Step 3: Write decrypted text to new file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/problem10/dec_message.txt"))) {
            writer.write(decrypted);
            System.out.println("Decrypted message written to dec_message.txt");
        } catch (IOException e) {
            System.out.println("Error writing decrypted message: " + e.getMessage());
        }

        // Step 4: Display all results
        System.out.println("\nOriginal Message : " + message);
        System.out.println("Encrypted Message: " + encrypted);
        System.out.println("Decrypted Message: " + decrypted);
    }
}
