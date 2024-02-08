package oops;
interface Client{

    String name1 = "ABC";                   ////Public + static + final
    String name2 = "BCA";

    void method1();                         // //public + abstract
    void method2();

}
class Vendor implements Client{

    @Override
    public void method1() {
        System.out.println("MEtHOD 1"+ name1);
    }

    @Override
    public void method2() {
        System.out.println("Method 2"+ name2);
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Vendor order1 = new Vendor();

        order1.method1();
        order1.method2();
        System.out.println(Client.name1);
        System.out.println(Client.name2);
    }
}
/*
* In Java, an interface is a reference type that defines a contract of methods that a class must implement.   (Contract BW a client and a developer )
*  It allows you to define a set of method signatures without providing the method implementations.
*  Classes that implement an interface must provide concrete implementations for all the methods declared in that interface.
*  Interfaces are used to achieve abstraction, multiple inheritance (through interface inheritance), and to define a common set of methods that related classes can adhere to.
* Variables in Interface are static they can be accessed from anywhere - System.out.println(Client.name1);    client is interface name
*  Variables can be called with class name and interface name
* Variables are final in interfaces

 */