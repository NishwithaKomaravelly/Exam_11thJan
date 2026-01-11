package testPckg;

import java.util.Scanner;

public class Postive_Negative {
    public static void main(String[] args) {
        System.out.println("Provide a number");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         String result = (a==0)?"Zero":((a>0)?"positive number": "Negative Number");
        System.out.println("given number is: " +result);
        sc.close();
    }
}
