package Arrays.Bubble_sort_str;

public class bubble_sort_2_str {

    public static int bubble_sort3(String []str){

        int size = str.length;
        String temp;
        for(int i =0;i<size;i++){
            for(int j =0;j<size-1;j++){
                if(str[j].compareTo(str[j+1])>0){
                    temp = str[j+1];
                    str[j+1]=str[j];
                    str[j]=temp;
                }
            }
        }


        return -1;
    }
    public static void main(String []args){
        String[] str = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "mango", "orange", "papaya"};

        System.out.println("unsorted string before bubble sort");
        int result = bubble_sort3(str);
        System.out.println("Sorted Array"+ result);
    }
}
