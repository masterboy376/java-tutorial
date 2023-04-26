package com.company;


public class TryCatchBlock_80 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{// it will try to process.
            int c = a/b;
            System.out.println("Answer: "+c);
        }
        catch (Exception e){// this will find exception
            System.out.println("We failed to divide. Reason: "+ e);
        }
        System.out.println("End of this program.");
    }
}
