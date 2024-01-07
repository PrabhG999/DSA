package Arrays.Bubble_sort_str;

import java.util.Arrays;

public class bubble_sort_str1 {
    public static void bubbleSort_str(String []strings){
        int size = strings.length;
        String temp;

        for(int i =0;i<size;i++){
            for(int j =0;j<size-1;j++){
                if(strings[j].compareTo(strings[j+1])>0){
                    //swap
                    temp = strings[j+1];
                    strings[j+1]=strings[j];
                    strings[j]=temp;
                }
            }
            System.out.println("Sorting now "+ Arrays.toString(strings));
        }

    }

    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "cherry", "date", "fig", "grape"};
        System.out.println("Unsorted Array"+ Arrays.toString(strings));
        bubbleSort_str(strings);

        System.out.println("Sorted array: " + Arrays.toString(strings));
    }
}
