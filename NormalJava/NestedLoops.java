package NormalJava;
//sqaure pattern
public class NestedLoops {
    public static void main(String []args){
        int Area = 0;
        for(int i=1;i<=4;i++){
            for(int j =1;j<=5;j++){
                System.out.print("*");
                Area++;
            }
            System.out.println();
        }
        System.out.println(Area);
    }
}
