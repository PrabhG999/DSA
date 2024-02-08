package oops;
class A{
    private int data;

    public void setData(int data) {
        this.data=data;
    }

    public int getData(){
        return data;
    }
}

public class Encapsulated {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.setData(100);
        System.out.println(obj1.getData());
    }
}
