package Recursion;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int i=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n");
        int n = sc.nextInt(); //stop
        printNaturalNumsSum(i,n,sum);

    }

    private static void printNaturalNumsSum(int i,int n,int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        else{
            sum+=i;
            printNaturalNumsSum(i+1,n,sum);
            System.out.println(i);
        }
    }
}
