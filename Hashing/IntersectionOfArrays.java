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
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> interSection = new HashSet<>();

        //add the elemets to set 1 from arra1
        for(int i =0;i< array1.length;i++){
            set1.add(array1[i]);
        }
        for(int num:array2){
            if(set1.contains(num)){
                interSection.add(num);
            }
        }
        System.out.println(" The new Set"+ set1);
        System.out.println("The Intersection set size "+ interSection.size());
        System.out.println("The intersections in them"+ interSection);
    }
}
