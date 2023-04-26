package com.company;

//class 1
class employee{
    int salary;
    String name;

    public int getSalary(){
        return  salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n ){
        name = n;
    }
}
//----------------------------------------------------------------------------------------------------------------------

//class 2
class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vib(){
        System.out.println("Vibrating...");
    }
}
//----------------------------------------------------------------------------------------------------------------------

//class 3
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
//----------------------------------------------------------------------------------------------------------------------
//class 4
class tommy{
    public void hit(){
        System.out.println("hit..");
    }
    public void jump(){
        System.out.println("jump..");
    }
    public void run(){
        System.out.println("run..");
    }
}
//----------------------------------------------------------------------------------------------------------------------

public class PracticeSet8_39 {
    public static void main(String[] args) {
        // prob 1
        employee sambhav = new employee();
        sambhav.setname("Sambhav Kaushik");
        System.out.println(sambhav.getname());
        sambhav.salary=999999999;
        System.out.println(sambhav.getSalary());
        //--------------------------------------------------------------------------------------------------------------
        // prob 2
        cellphone nettle = new cellphone();
        nettle.ring();
        nettle.vib();
        //--------------------------------------------------------------------------------------------------------------
        //prob 3
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        //--------------------------------------------------------------------------------------------------------------
        //prob 4
        tommy game = new tommy();
        game.hit();
        game.run();
        game.jump();
        //--------------------------------------------------------------------------------------------------------------
    }
}
