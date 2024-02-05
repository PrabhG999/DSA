package oops;
class Animal{                                                                                               //Example Of multilevel Inheritance
    public void eat(){
        System.out.println("The ANIMAL EATS" );
    }
}
class Mammal extends Animal{
    public void breathe(){
        System.out.println( "The MAMMAL BREATHES");
    }
}
class Dog extends Mammal{
    String name;
    String coatColor;
    int age;

    //constructor
    Dog(String name,String coatColor, int age){
        this.name = name;
        this.coatColor=coatColor;
        this.age=age;
    }

    void displayInfo(){
        System.out.println(name);
        System.out.println(coatColor);
    }
    void displayInfo(String name){
        System.out.println(name);
    }
    void displayInfo(int age){
        System.out.println(age);
    }
}
public class MultilevelinheriTance {
    public static void main(String[] args) {
        Dog pet1 = new Dog("Wilbur","Brown",10);

        pet1.displayInfo();
        pet1.eat();
        pet1.breathe();
    }
}
