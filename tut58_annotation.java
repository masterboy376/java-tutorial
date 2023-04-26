package com.company;

//--4--
@FunctionalInterface//--> This is oly valid if interface have only one funtion
interface Greet {
    public void hello();
}
class MorningGreet implements Greet{
    @Override
    public void hello(){
        System.out.println("Hello!");
    }
}

class newPhone extends phone{
    //--1--
    @Override
    public void time(){
    System.out.println("Time is 8 am");
}
   //--3--
    @Deprecated 
    public void sum(int a , int b){
        System.out.println(a+b);
    }
}

public class AnnotationsInJava_108 {
    //--2--
    @SuppressWarnings( "deprication" )
    public static void main(String[] args) {
   newPhone np = new newPhone();
   np.time();
   np.sum(1,5);

    }
}
