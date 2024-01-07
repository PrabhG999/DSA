package Arrays.Sleection_sort_str;

import java.util.Arrays;

public class Selection_Sort_str1 {
    public static void selectionSort_2(String[] strings){
        int size = strings.length;
        if(size==1){
            System.out.println("Already Sorted");
        }
        int index;
        String temp;
        int count =0;
        for(int i=0;i<size-1;i++){
            index=i;
            for(int j=i+1;j<size;j++){
                if(strings[j].compareTo(strings[index])<0){
                    index=j;
                }
            }
            temp =strings[index];
            strings[index]=strings[i];
            strings[i]=temp;
            System.out.println("Sorting"+ " "+ count++ + Arrays.toString(strings));
        }
    }
    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "cherry", "date", "fig", "grape"};
        System.out.println("Unsorted Array " + Arrays.toString(strings));
        selectionSort_2(strings);

        System.out.println("Sorted array: " + Arrays.toString(strings));
    }
}
