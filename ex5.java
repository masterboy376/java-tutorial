package com.max.shape.one;


class square{
     int a;
    square ( int a ){
        this.a = a;
    }
    public void SA1(){
        System.out.println("Surface area(square) = "+ (a*a));
    }
}
class rectangle extends square{
      int b;
    rectangle(int a, int b){
        super(a);
        this.b=b;
    }  
    public void SA2() {
        System.out.println("Surface area(rectangle) = "+ (a*b));
    }
}

public class one {
    public static void main(String[] args) {
        /*
        * you have to create a package named com.max.shape.
        * This package should contain individual classes for rectangle, square, circle, sphere, cylinder, cone.
        * These classes should use the inheritance to properly manage the code.
        * include methods like volume, surface area, and getter & setters for dimensions.
         */
        square s = new square(2);
        s.SA1();
        rectangle r =new rectangle(5,8);
        r.SA2();

    }
}

//====================================================================================

package com.max.shape.two;
import java.util.Scanner;
class circle{
    Scanner sc = new Scanner(System.in);
     int r;
    circle() {
        System.out.print("radius = ");
        r = sc.nextInt();
    }
    public void SA3(){
        System.out.println("Surface area(circle) = "+ Math.PI*(r*r));
    }
}
class sphere extends circle{
    public void SA4() {
        System.out.println("Surface area(sphere) = "+ 4*Math.PI*(r*r));
    }
    public void vol4(){
        System.out.println("Volume(sphere) = "+ (4*Math.PI*(r*r*r))/3);
    }
}

public class two {
    public static void main(String[] args) {
        /*
         * you have to create a package named com.max.shape.
         * This package should contain individual classes for rectangle, square, circle, sphere, cylinder, cone.
         * These classes should use the inheritance to properly manage the code.
         * include methods like volume, surface area, and getter & setters for dimensions.
         */
        //Scanner sc = new Scanner(System.in);
         System.out.println("calculator for circle.");
        circle c = new circle();
        c.SA3();
        System.out.println("calculator for shpere.");
        sphere s = new sphere();
        s.SA4();
        s.vol4();
        
    }
}
//====================================================================================

package com.max.shape.three;
import java.util.Scanner;
class cylinder{
    Scanner sc = new Scanner(System.in);
     double r;
     double h;
     double SA5;
     double vol5;
    cylinder( ) {
        System.out.print("radius = ");
        r = sc.nextDouble();
        System.out.print("height = ");
        h = sc.nextDouble();
    }
    public void SA5(){
        SA5 = (2*Math.PI*(r*h)) +(2*Math.PI*(r*r));
        System.out.println("Surface area(cylinder) = "+ SA5);
    }
    public void vol5(){
        vol5 = Math.PI*(r*r*h);
        System.out.println("volume(cylinder) = "+vol5);
    }
}
class cone extends cylinder{
    double SA6;
    double vol6;
    public void SA6() {
        SA6 =0;
        System.out.println("Surface area(cone) = "+ SA6);
    }
    public void vol6(){
        vol6 = (Math.PI*(r*r*h))/3;
        System.out.println("Volume(cone) = "+ vol6);
    }
}

public class three {
    public static void main(String[] args) {
        /*
         * you have to create a package named com.max.shape.
         * This package should contain individual classes for rectangle, square, circle, sphere, cylinder, cone.
         * These classes should use the inheritance to properly manage the code.
         * include methods like volume, surface area, and getter & setters for dimensions.
         */
        //Scanner sc = new Scanner(System.in);
        System.out.println("Cylinder");
        cylinder c = new cylinder();
        c.SA5();
        c.vol5();
        System.out.println("Cone");
        cone cn = new cone();
        cn.SA6();
        cn.vol6();

    }
}
