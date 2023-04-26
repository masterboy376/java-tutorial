package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_111 {
    public static void main(String[] args) {

        //code to create new file
        File myFile = new File("FileHandling_111");
        try {
           myFile.createNewFile();
        }
        catch(Exception e ){
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------
        //code to write to a file.
        try {
            FileWriter filewriter = new FileWriter("FileHandling_111");
            filewriter.write("This is our first file.\nOkay now bye.");
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------
        //reading a file
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------
        //deleting a file
        if(myFile.delete()){
            System.out.println("I hav deleted: "+myFile.getName());
        }
        else{
            System.out.println("error");
        }
//----------------------------------------------------------------------------------------------------------------------
        // For more method go to oracle.com

    }
}
