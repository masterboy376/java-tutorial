package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// prob 1
// create java doc
//----------------------------------------------------------------------------------------------------------------------
// prob 2
class MyDeprecated{
    @Deprecated
    public void meth1 (){
        System.out.println("I am deprecated.");
    }
}
//----------------------------------------------------------------------------------------------------------------------
// prob 3
interface MyIn{
    public void display();
}
//----------------------------------------------------------------------------------------------------------------------


public class PracticeSet_17_18_19_20_112_AdvanceJava {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // prob 2
        MyDeprecated mD = new MyDeprecated();
        mD.meth1();
        //prob 3
        MyIn mI = new MyIn() {
            @Override
            public void display() {
                System.out.println("hi");
            }
        };
//----------------------------------------------------------------------------------------------------------------------
        // prob 4
        File myFile1 = new File("FilePracticeSetProb_4");
        try {
            myFile1.createNewFile();
        }
        catch(Exception e ){
            e.printStackTrace();
        }

        int a = 5;
        String table = "";
        for(int j = 0; j<11; j++){
            table += a+" X "+j+" = "+ a*(j);
            table += "\n";
        }

        try {
            FileWriter filewriter = new FileWriter("FilePracticeSetProb_4");
            filewriter.write(table);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner sc = new Scanner(myFile1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
