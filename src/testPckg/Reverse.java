package testPckg;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Provide a number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int temp=0;
        do{
            int lastNum = i%10;
            temp = temp *10+ lastNum;
            i=i/10;

        }while(i >0);

        System.out.println("Reverse of the given input value is: "+temp);
        sc.close();
    }
}
