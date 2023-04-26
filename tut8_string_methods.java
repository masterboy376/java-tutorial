package com.company;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Sambhav is in class 12";
        String name1 = new String("                        Sambhav is in class 12                    ");

        //.....String methods.....

        //...method 1...
        int value1 = name.length();
        System.out.println(value1);

        //...method 2...
        String value2 = name.toLowerCase();
        System.out.println(value2);

        //...method 3...
        String value3 = name.toUpperCase();
        System.out.println(value3);

        //...method 4...
        String value4 = name1.trim();
        System.out.println(value4);

        //...method 5...
        String value5 = name.substring(4);
        System.out.println(value5);

        //...method 6...
        String value6 = name.substring(3,19);
        //String value6 = name.substring(0,23);//returns complete string
        System.out.println(value6);

        //...method 7...
        //--------------------------------------------------------------------------------------------------------------
        //-method 7.1-
        String value7 = name.replace('a','e'); //it will replace 'a' with 'e' everywhere.
        System.out.println(value7);
        //System.out.println(name.replace('a','e')); //same as just above one;
        //--------------------------------------------------------------------------------------------------------------
        //-method 7.2-
        String value70 = name.replace("class","standard"); //it will replace "class" with "standard" everywhere.
        System.out.println(value70);

        //...method 8...
        boolean value8 = name.startsWith("Sa");
        System.out.println(value8);

        //...method 9...
        boolean value9 = name.endsWith("sp");
        System.out.println(value9);

        //...method 10...
        char value10 = name.charAt(17); //index values start from '0'.
        System.out.println(value10);

        //...method 11...
        int value11 = name.indexOf("class");
        System.out.println(value11);
        //--------------------------------------------------------------------------------------------------------------
        int value11a = name.indexOf("S");
        System.out.println(value11a);

        //...method 12...
        int value12 = name.indexOf("s",17);
        System.out.println(value12);
        int value12a = name.indexOf("s23455",8); //returns -1 for error.
        System.out.println(value12a);

        //...method 13...
        int value13 = name.lastIndexOf("a");
        System.out.println(value13);

        //...method 14...
        int value14 = name.lastIndexOf("a",4);
        System.out.println(value14);

        //...method 15...
        boolean value15 = name.equals("Sambhav is in class 12");
        boolean value15a = name.equals("sambhav is in class 12");
        System.out.println(value15);
        System.out.println(value15a); //case sensitive

        //...method 16...
        boolean value16 = name.equalsIgnoreCase("SAMBHAV IS in ClasS 12");
        System.out.println(value16); // it is not case sensitive

        //--------------------------------------------------------------------------------------------------------------

        // Escape sequence character
        System.out.println("I am sequence \" backslash \" ");
        System.out.println("hi, \n hello,");
        System.out.println("yo \\ dump \\");
        System.out.println("hi \' yo \'");
        System.out.println("hi \t yo");
    }
}
