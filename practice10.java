package com.company;

//----------------------------------------------------------------------------------------------------------------------
class circle{
    double r;
    circle(double r){
        this.r=r;
    }
    public double getArea(){
        double area = 3.14*(r*r);
        return area;
    }
}
class cylinder extends circle{
    double h;
    cylinder(double r, double h){
        super(r);
        this.h=h;
    }
    public double getVolume(){
        return Math.PI*r*r*h;
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class Practiceset10_52 {
    public static void main(String[] args) {
        //prob1
        circle obj1 = new circle(5);
        cylinder obj2 = new cylinder(5,6);
        System.out.println("Ares of circle is "+obj1.getArea()+" sq unit");
        System.out.println("Volume of cylinder is "+obj2.getVolume()+" sq unit");

    }
}
