package Recursion;

import java.util.Scanner;

public class Facorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you trying to find the facorial of - "  );
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if(num==1 || num==0){
            return num;
        }
        int fact_1 = factorial(num-1);
        int result = num * fact_1;
        return result;
    }
}
