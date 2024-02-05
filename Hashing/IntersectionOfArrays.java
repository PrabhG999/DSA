package Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        printIntersectionSize(array1, array2);
    }

    private static void printIntersectionSize(int[] array1, int[] array2) {
        //will make a set to add the element and the other one to count the intersections
       HashSet<Integer> merged = new HashSet<>();
       HashSet<Integer> intersection = new HashSet<>();

       for(int num:array1){
           merged.add(num);
       }
       for(int num:array2){
           if(merged.contains(num)){
               intersection.add(num);
           }
       }
        System.out.println(" New SET SiZE"+ merged.size());
       System.out.println(" New SET SiZE"+ merged);
        System.out.println(intersection);

    }
}
