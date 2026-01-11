package testPckg;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide an integer value for a");
        int a = sc.nextInt();
        System.out.println("Provide an integer value for b");
        int b = sc.nextInt();
        System.out.println("Addition of given numbers: " +sum(a,b));
        System.out.println("Difference of given number: " +diff(a,b));
        System.out.println("Multiplication of given numbers: "+mul(a,b));
        System.out.println("Division of given number: " +div(a,b));
        System.out.println("Remainder of given numbers: "+rem(a,b));
    }
    public static int sum(int a , int b){
        return a+b;
    }

    public static int diff(int a , int b){
        return a-b;
    }

    public static int mul(int a , int b){
        return a*b;
    }

    public static int div(int a , int b){
        return a/b;
    }

    public static int rem(int a , int b){
        return a%b;
    }
}
