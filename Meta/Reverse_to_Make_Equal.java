package Meta;

public class Reverse_to_Make_Equal {
    // Add any helper functions you may need here


    boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here
        if(array_a.length!=array_b.length){
            return false;    //check to make sure that th elength of the array's is equal.
        }
        //sort them manually
        int size_a=array_a.length;
        //using selection sort for array_a

        int minIndex;
        for(int i =0;i<size_a;i++){
            minIndex=i;
            for(int j =i+1;j<size_a-1;j++){
                if(array_a[j]<array_a[minIndex]){
                minIndex=j;
                }
                int temp = array_a[minIndex];
                array_a[minIndex]=array_a[i];
                array_a[i]=temp;
            }
        }

        //using insertion sort to sort array_b
        int key;
        for(int i=1;i<array_b.length;i++){
            key = array_b[i];
            int j =i-1;
            while(j>=0 && array_b[j]>key){
                array_b[j+1]=array_b[j];
                j--;
            }
            array_b[j+1]=key;
        }
        for(int i =0;i<size_a;i++){
            if(array_a[i]!=array_b[i]){
                return false;
            }
        }
        return true;
    }

    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;
    void check(boolean expected, boolean output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        }
        else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            System.out.print(expected);
            System.out.print(" Your output: ");
            System.out.print(output);
            System.out.println();
        }
        test_case_number++;
    }

    public void run() {  //test cases
        int[] array_a_1 = {1, 2, 3, 4};
        int[] array_b_1 = {1, 4, 3, 2};
        boolean expected_1 = true;
        boolean output_1 = areTheyEqual(array_a_1, array_b_1);
        check(expected_1, output_1);

        int[] array_a_2 = {1, 2, 3, 4};
        int[] array_b_2 = {1, 4, 3, 3};
        boolean expected_2 = false;
        boolean output_2 = areTheyEqual(array_a_2, array_b_2);
        check(expected_2, output_2);
        // Add your own test cases here

    }

    public static void main(String[] args) {
        new Reverse_to_Make_Equal().run();
    }
}
