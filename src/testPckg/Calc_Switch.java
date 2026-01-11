package testPckg;

import java.util.Scanner;

public class Calc_Switch {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an operation to perform from the below options");
        System.out.println("addition, subtraction, division, multiplication");
        String op = sc.next();
        switch (op){
            case "addition":
                System.out.println("addition of given 2 numbers is" +(a+b));
                break;
            case "subtraction":
                System.out.println("subtraction of given 2 numbers is" +(a-b));
                break;
            case "multiplication":
                System.out.println("multiplication of given 2 numbers is" +(a*b));
                break;
            case "division":
                System.out.println("division of given 2 numbers is" +(a/b));
                break;
            default:
                System.out.println("Please provide valid options from the above");

        }
    }
}
