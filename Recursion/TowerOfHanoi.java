package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        char source = 'A', helper = 'B', destination = 'C';

        solveTowerOfHanoi(numberOfDisks, source, helper, destination);
    }

    private static void solveTowerOfHanoi(int n, char source, char helper, char destination) {
        if(n==1){
            System.out.println(" the Source "+source +" will go straight to the destination "+ destination);
            return;
        }else{
            solveTowerOfHanoi(n-1,source,destination,helper);
            System.out.println(" the disk transfer "+ n +" the Source "+source +" will go straight to the destination "+ destination);
            solveTowerOfHanoi(n-1,helper,source,destination);
        }

    }
}
