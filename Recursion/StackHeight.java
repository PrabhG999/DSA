package Recursion;

public class StackHeight {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }

    private static int calcPower(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powm1 = calcPower(x,n-1);
        int power = x*powm1;
        return power;
    }


}
