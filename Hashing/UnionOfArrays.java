package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        printUnionSize(array1, array2);
    }

    private static void printUnionSize(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int j=0;j<array2.length;j++){
            set.add(array2[j]);
        }
        System.out.println("New Set is "+ set);

        System.out.println("The Size of the set is = "+ set.size());
    }

}
