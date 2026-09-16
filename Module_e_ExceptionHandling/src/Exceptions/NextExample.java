package Exceptions;

import java.io.*;

public class NextExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter your name and age : ");

        String name = "";
        int age = 0;

        try {
            name = br.readLine();              // reads a line of text
            age = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (br != null)
                br.close();

            System.out.println("resource closed!");
        }

        System.out.println(name + " " + age);
    }
}