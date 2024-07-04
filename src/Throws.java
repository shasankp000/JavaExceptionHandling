/*
* 4. throws Keyword
* The throws keyword is used in method signatures to declare that a method can throw one or more exceptions.
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

    public static void readFile(String fileName) throws IOException {

        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);

        for (int i = 0; i < 3; i++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }


    public static void main(String[] args) {

        try {

            readFile(".nonexistentfile.txt");
        }
        catch (IOException exception) {

            System.out.println("IOException caught: " + exception.getMessage());

        }

    }


}
