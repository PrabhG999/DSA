package Arrays.Insertion_sort;

public class insertion_sort_1 {
    public static void insertionSort(int []array,int size){

        for(int i =1;i<size;i++){
            int key = array[i];
            int j =i-1;    //mean on the 0 index


            while(j>=0 && array[j]>key){
                array[j+1] =array[j];
                j--;
            }
            array[j+1]=key;
        }

    }
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        insertionSort(array, array.length);

        System.out.println("\nSorted Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
