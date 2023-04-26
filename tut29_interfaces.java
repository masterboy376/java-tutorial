package com.company;

interface bicycle{
    final int a = 7;
    void applybreak(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    void pee();
    void poo();
}
// Two interfaces can be implemented in one class.
class avon implements bicycle, hornbicycle{
    int speed = 7;
    @Override
    public void applybreak(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);
    }
    @Override
    public void speedup(int increment) {
        speed = speed + increment;
        System.out.println(speed);
    }
//---------------------------------------------
    @Override
    public void pee() {
        System.out.println("pee...");
    }

    @Override
    public void poo() {
        System.out.println("poo...");
    }
}
public class Interfaces_54 {
    public static void main(String[] args) {
        //bicycle o = new bicycle();// not allowed
        avon obj = new avon();
        obj.applybreak(2);
        obj.speedup(3);

        // you can create properties in interface.
        System.out.println(obj.a);//note
        //you cannot modify the properties in interface.
        //obj.a= 45;
        obj.speed = 8;// avon

        obj.pee();
        obj.poo();
    }
}
