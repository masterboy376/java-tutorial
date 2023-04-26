package com.company;

class base {
    int x;
    public int getx() {
        return x;
    }
    public void setx(int x) {
        this.x=x;
    }
    public void printMe() {
        System.out.println(x);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class derived{
    int y;
    public int gety() {
        return y;
    }
    public void sety(int y) {
        this.y = y;
    }
    public void printMe() {
        System.out.println(y);
    }

}
                                         //OR
class inheritance extends base {
   int y;
   public int gety() {
       return y;
   }
   public void sety(int y) {
       this.y = y;
   }
}
//----------------------------------------------------------------------------------------------------------------------
class animal{
    int leg;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}

class dog extends animal{
    public void special(){
        System.out.println("bark!");
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class Inheritance_45 {
    public static void main(String[] args) {
        System.out.println(" CLASS base ");
        base b = new base();
        b.setx(4);
        System.out.println(b.getx());
        System.out.println(" CLASS inheritance ");
        inheritance i = new inheritance();
        i.setx(5);
        i.sety(6);
        System.out.println(i.gety());
        System.out.println(i.getx());


//----------------------------------------------------------------------------------------------------------------------
        dog a = new dog();
        a.setLeg(4);
        System.out.println(a.getLeg());
        a.special();

    }
}
