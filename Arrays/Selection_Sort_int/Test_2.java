package Arrays.Selection_Sort_int;

import java.util.Arrays;

public class Test_2 {
    public static void selectionSort_1(int []numbers){
        int size = numbers.length;

        //using selection sort
        int minIndex ;

        for(int i =0;i<size;i++){
            minIndex=i;
            for(int j =i+1;j<size;j++){
                if(numbers[j]<numbers[minIndex]){
                    minIndex=j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex]=numbers[i];
            numbers[i]=temp;


        }
    }
    public static int binSearch(int []numbers,int target,int size){

        int left =0;
        int right = size-1;
        int middle ;
        //performing binary search
        while(left<=right){
            middle = (left+right)/2;
            if(numbers[middle]==target){
                return middle;
            } else if (numbers[middle]<target) {
                left = middle +1;
            }else {
                right = middle -1;
            }
        }
        return -1;
    }

    public static int[] twoPointer(int []numbers,int left,int right,int target){
        System.out.println(Arrays.toString(numbers));
        while (left <right){
            if((numbers[left]+numbers[right])==target){
                return new int[]{left,right};
            } else if ((numbers[left]+numbers[right])<target) {
                left ++;
            }else {
                right ++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Array before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        selectionSort_1(numbers);
        int search = binSearch(numbers,4, numbers.length);
        int twoPoint[] = twoPointer(numbers,0,numbers.length-1,10);

        System.out.println("\nArray after sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nTarget found at " + search);
        System.out.println("\nusing Two pointer finding index of 5 in numbers "+ twoPoint[0] +" "+ twoPoint[1]);
    }
}
