package com.company;

public class PraciceSet5 {

    public static void main(String[] args) {
        /*//...question 1...
        int n =4;
        for(int i = n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        /*//...question2...
        int sum = 0;
        int n = 1000;
        for(int i = 0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.print("sum:-");
        System.out.println(sum);*/

        /*//...question3...
        int n = 798;
        for(int i = 0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }*/

        /*//...question4...
        int n = 8;
        for(int i = 10;i>=0;i--){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }*/

        /*//...question5...
        int factorial = 1;
        int n = 4;
        for(int i = 1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.print("factorial of given number:- ");
        System.out.println(factorial);*/

        /*//...question 6...
        int fact = 1;
        int n =5;
        int i =1;
        while(i<=n) {
            fact = fact * i;
            i++;
        }
        System.out.print("factorial:- ");
        System.out.println(fact);*/

        //...question 7...
        int n = 4;
        int i = n;
        int j = 1;
        while(i>0){
            System.out.print("*");
            while(j<i) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println("\n");
        }

        /*//...question 8...
        int sum = 0;
        int n = 8;
        for(int i = 0;i<=10;i++){
                sum = sum+n*i;
        }
        System.out.println("the desired sum is "+sum);*/
  }
}
