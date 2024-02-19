package Recursion;

import java.util.Scanner;

public class PrintingNumbersII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n");
            int n = sc.nextInt();
            printNums(n);

    }
    private static void printNums(int n){
        if(n ==0 || n>=6){
            return;
        }else{
            System.out.println(n);
            printNums(n+1);
        }
    }
}
