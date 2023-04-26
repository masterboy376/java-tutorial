package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class PracticeSet6 {
    public static void main(String[] args) {
        /*//...problem1...
        float[]CGPA={8.4f,7.5f,9.0f,8.5f,9.7f};
        //float sum = CGPA[0]+CGPA[1]+CGPA[2]+CGPA[3]+CGPA[4];
        float sum= 0;
        for(float element:CGPA){
            sum=sum+element;
        }
        System.out.println(sum);*/
        //--------------------------------------------------------------------------------------------------------------

        /*//...problem2...
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[]test={1,2,3,4,5,6,7,8,9,0};
        boolean flag = false;
        for(int i= 0;i<10;i++){// OR for(int element:test){sout()}
            if(test[i]==n){
                flag =  true;
                break;
            }
        }
        if(flag==true){
            System.out.println("yes, the number is in array.");
        }
        else{
            System.out.println("no,the number is not in array");
        }*/
        //--------------------------------------------------------------------------------------------------------------

        /*//..problem3...
        int[]marks={100,82,73,84,95,96,67,78,99,90};
        int sum1=0;
        for (int element:marks) {
            sum1=sum1+element;
        }
        System.out.println(sum1/10);*/
        //--------------------------------------------------------------------------------------------------------------

        //...problem4...
        int[][]mat1 = {{1,2,3},
                       {4,5,6}};
        int[][]mat2 = {{11,22,34},
                {45,65,26}};
        int[][]matsum = {{0,0,0},
                {0,0,0}};
        for(int i=0;i<mat1.length;i++){//row =2; mat1.length=2
            for(int j=0;j<mat1[i].length;j++){//column =3; mat1[i].length=3
                System.out.format(" setting value for i=%d and j=%d\n ", i , j );
                matsum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int a = 0;a<2;a++){
            for(int b = 0;b<3;b++){
                System.out.print(matsum[a][b]+" ");
            }
            System.out.println(" ");
        }
        //--------------------------------------------------------------------------------------------------------------

        //...problem5...
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12};
        int l = arr.length;
        int n = Math.floorDiv(l,2);// greatest integer funtion
        //System.out.println(n);
        int temp;
        for(int i =0;i<n;i++){
            // swap arr[i] and arr[l-i-1]
            // |4| |3| | | empty box logic for swaping
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element+" ");
        }
        //--------------------------------------------------------------------------------------------------------------

        //...problem6...
        int[]a1={1,2,3,4,5,6};
        int max = Integer.MIN_VALUE;
        for( int e : a1){
            if(e>max){
                max = e;
            }
        }
        System.out.println(max);
        //--------------------------------------------------------------------------------------------------------------

        //...problem7...
        int[]a2={17879,87982,3789,49,500,61};// assuming no negative number
        int min = Integer.MAX_VALUE;
        for( int e : a2){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);
        //--------------------------------------------------------------------------------------------------------------

        //...problem8...
        boolean flag = true;
        int[]a3={56,96,35,68,36,7};
        for(int i = 0;i<a3.length;i++){
            if (a3[i] >= a3[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag==false){
            System.out.println("not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }
}
