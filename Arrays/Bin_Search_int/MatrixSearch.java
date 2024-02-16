package Arrays.Bin_Search_int;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 3;
        int target2 = 13;

        System.out.println("Searching for target " + target1 + ": " + searchMatrix(matrix, target1)); //true
        System.out.println("Searching for target " + target2 + ": " + searchMatrix(matrix, target2)); //false
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = forRows(matrix,target);
        if(rowIdx!=-1){
            return forColumns(rowIdx,matrix,target);
        }else{
            return false;
        }
    }

    private static boolean forColumns(int rowIdx, int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length-1;
        while(left<=right){
            int middle = left+(right -left)/2;
            if(matrix[rowIdx][middle]==target){
                return true;
            } else if (matrix[rowIdx][middle]>target) {
                right =middle-1;
            }else {
                left = middle+1;
            }
        }
        return false;
    }

    private static int forRows(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length-1;
        while(left<=right){
            int middle = left+(right -left)/2;
            if(matrix[middle][0]<=target && target <=matrix[middle][matrix.length-1]){
                return middle;
            } else if (matrix[middle][0]<target) {
                left = middle+1;
            }else {
                right = middle-1;
            }
        }
        return -1;
    }
}
