package problem3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAnalyzer {

	public static void analyzeFile(String inputFile,String outputFile,String name,String rollNo) {
		int lineCount=0,wordCount=0,charCount=0;
		
		String longestWord="";
				
		try(BufferedReader br=new BufferedReader(new FileReader(inputFile))){
			String line;
			while((line=br.readLine())!=null) {
				lineCount++;
				charCount+=line.length();
				String[]words=line.split("\\s+");
				for(String word:words) {
					if(!word.trim().isEmpty()) {
						wordCount++;
						if(word.length()>longestWord.length()) {
							longestWord=word;
						}
					}
				}
			}
		}catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
		}
		
		
		try(FileWriter fw=new FileWriter(outputFile,true)){
			fw.write("File Analysis Report\n");
			fw.write("----------------------------\n");
			fw.write("Total Lines: "+lineCount+"\n");
			fw.write("Total Words: "+wordCount+"\n");
			fw.write("Total Characters: "+charCount+" \n");
			fw.write("Longest Word: "+longestWord+"("+longestWord.length()+")\n");
			fw.write("Analyzed By: "+name+", Roll No: "+rollNo+"\n\n");
			
		}catch(IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
		}
		
		
		System.out.println("File Analysis ---");
        System.out.println("Total Lines: " + lineCount);
        System.out.println("Total Words: " + wordCount);
        System.out.println("Total Characters: " + charCount);
        System.out.println("Longest Word: " + longestWord + " (" + longestWord.length() + ")");
        System.out.println("Results written to " + outputFile);

	}
}
