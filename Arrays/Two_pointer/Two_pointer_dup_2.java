package Arrays.Two_pointer;

public class Two_pointer_dup_2 {
    public static int sortDups(int []arrayWithDuplicates,int size) {
        //check if array empty or not
        if(size==0){
            return 0;
        }
        int unique=0;
        int duplicate;
        int count_operations=0;
        for(duplicate=1;duplicate<size;duplicate++){
            if(arrayWithDuplicates[unique]!=arrayWithDuplicates[duplicate]){
                unique++;
                arrayWithDuplicates[unique]=arrayWithDuplicates[duplicate];
                count_operations++;
            }
            System.out.println("count of operations "+ " "+ count_operations);
        }
        return unique+1;
    }




    public static void main(String[] args) {
        // Define an array full of duplicate numbers
        int[] arrayWithDuplicates = {7, 7, 15, 15, 15, 23, 23, 23, 23, 42, 42, 42, 42, 42};
        int result = sortDups(arrayWithDuplicates, arrayWithDuplicates.length);

        System.out.println("Array with duplicates:");
        for (int num : arrayWithDuplicates) {
            System.out.print(num + " ");
        }

        // Any processing or method calls can go here
    }
}
