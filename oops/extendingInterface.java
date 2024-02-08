package oops;

interface Client1{
    void add();                                                 // 2 contacts as interfaces handleled by one dev to make a program OOPS concept using extends keyword in interface

}
interface Client2 extends Client1{
    void subtract();
}
class Dev implements Client2{
    int num1;
    int num2;

    public Dev(int num1, int num2){
        this.num1=num1;
        this.num2 = num2;
    }
    @Override
    public void add() {
        int result = num1+ num2;
        System.out.println( "the Sum is " + result);
    }

    @Override
    public void subtract() {
        int result = num1- num2;
        System.out.println( "the Difference  is " + result);
    }
}
public class extendingInterface {
    public static void main(String[] args) {
        Dev calc = new Dev(20,10);
        calc.add();
        calc.subtract();
    }
}
