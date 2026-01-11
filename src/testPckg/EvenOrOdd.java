package testPckg;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number");
         int a = sc.nextInt();
         isEven(a);
         sc.close();
    }

    public static void isEven(int a){
        if(a%2 == 0){
            System.out.println("Given number ("+a+") is Even");
        }
        else System.out.println("Given number ("+a+") is odd");
    }
}
