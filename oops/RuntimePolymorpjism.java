package oops;
class Parent{
    void Inheritance (){
        System.out.println("Inherited to children");
    }
}
class Child extends Parent{

    String name;
    public Child(String name){
        this.name = name;
    }

    @Override                                                   //example of runtime polymorphism
    void Inheritance() {                                        //same method in super class
        //super.Inheritance();
        System.out.println(name+" is the child inherited to");
    }
}
class YoungerChild extends Parent{
    String name;
    //constructor
    public YoungerChild(String name){
        this.name=name;
    }

    @Override                                  //method overriding in polymorphism
    void Inheritance() {
        //super.Inheritance();                 //use of super keyword to inherit super class properties
        System.out.println(name + " is also going to inherit the half of the wealth");
    }
}
public class RuntimePolymorpjism {
    public static void main(String[] args) {
        Child c1 = new Child("Prabh");
        YoungerChild ys1 = new YoungerChild("Japjee");
        c1.Inheritance();
        ys1.Inheritance();
    }
}
