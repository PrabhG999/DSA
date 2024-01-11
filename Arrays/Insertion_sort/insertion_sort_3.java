package Arrays.Insertion_sort;

import java.util.Arrays;

public class insertion_sort_3 {

    public static void sorting(int[]array){
       //sorting using insertion sort

        int i;
        int j;
        int key;

        for(i =1;i<array.length;i++){
            key =array[i];
            j =i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    public static int remove_dupes(int[]array){
        if(array.length==0){
            return 0;
        }
        int i =0;
        for(int j =1;j< array.length;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
            }
        }
        return i+1;
    }
    public static void main(String []args){
        int[] array = {33, 18, 33, 5, 22, 18, 22, 30, 5, 11, 11, 27, 16, 2, 2, 2, 9, 14, 27, 35, 35, 17, 8, 8, 19};

        int size = array.length;
        System.out.println("Old size of the array"+ size);
        System.out.println("Before removing duplicates"+Arrays.toString(array));

        sorting(array); //will use Two pointer for that

        System.out.println("\nThe new sorted array " );
        for(int k=0;k<size;k++){
            System.out.println(array[k]+ " ");
        }

        int  newSize = remove_dupes(array); //will use Two pointer for that

        System.out.println("\nThe new size of the array " );
        for(int k=0;k<newSize;k++){
            System.out.println(array[k]+ " ");
        }



    }
}
