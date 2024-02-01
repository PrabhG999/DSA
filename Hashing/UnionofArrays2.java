package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionofArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        printUnionSize2(arr1,arr2,arr3);
    }

    private static void printUnionSize2(int[] arr1, int[] arr2, int[] arr3) {
        Set<Integer> set = new HashSet<>();
       for(int num :arr1){
           set.add(num);
       }
       for(int num :arr2){
           set.add(num);
       }
       for(int num :arr3){
           set.add(num);
       }
        System.out.println(set + " Is the new SET");
        System.out.println(set.size());

    }


}
