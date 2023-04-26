package com.company;

//prob1
class cylinder2{
    private int r;
    private int h;
    public cylinder2(int r, int h){
        this.r=r;
        this.h=h;
    }
    /*public int getR() {return r;}
    public void setR(int r) {this.r = r;}
    public int getH() {return h;}
    public void setH(int h) {this.h = h;}*/
 //prob2
    public double SA (){
        return (2*3.14*r*r)+(2*3.14*r*h);
    }
    public  double vol(){
        return 3.14*r*r*h;
    }
}
class rect{
    private int l;
    private int b;
    public rect(){
        l=5;
        b=9;
    }
    public rect(int l, int b) {
        this.l = l;
        this.b=b;
    }
    public int getL() {
        return l;
    }
    public int getB() {
        return b;
    }
}

public class practiceset9_44 {
    public static void main(String[] args) {
        cylinder2 c = new cylinder2(4,8);
        /*c.setH(4);
        System.out.println(c.getH());
        c.setR(6);
        System.out.println(c.getR());*/
        System.out.println(c.SA());
        System.out.println(c.vol());
        //rect r =new rect();
        rect r = new rect (7,8);
        System.out.println(r.getB());
        System.out.println(r.getL());
    }
}
