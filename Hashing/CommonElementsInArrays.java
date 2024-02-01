package Hashing;

import java.util.HashSet;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        printCommonElements(arr1, arr2, arr3);
    }

    private static void printCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //add arra1 values to set 1
        for(int i:arr1){
            //no check here as we are adding all the values to set 1
            set1.add(i);
        }
        for(int j :arr2){
            if(set1.contains(j)){
                set2.add(j);
            }
        }
        for(int num:arr3){
            if(set2.contains(num)){
                System.out.println(num+ " ");
            }
        }

    }
}
