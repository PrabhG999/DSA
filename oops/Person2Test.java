package oops;
class Person1{  //copy constructor and plymorphism
    String name;
    int age;

    public Person1(String name,int age ){              // first constructor
        this.name = name;
        this.age = age;
    }

    public Person1(Person1 otherPerson){                // copy  constructor for obj2
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    //method overloading also called polymorphism
    public void display(){                                      //the one methdp that displays all dont add any parameters there
        System.out.println("NAME IS - "+ name);
        System.out.println("Age IS - "+ age);
    }
    public void display(String name){                       // method just to diplay name                                                                       // all there are part of polymorphism
        System.out.println("NAME IS - "+ name);
    }
    public void display(int age){                           //method to diplay age
        System.out.println("Age IS - "+ age);
    }
}
public class Person2Test {
    public static  void main(String []args){
        // create the object
        Person1 obj1 = new Person1("Prabh",25);
        Person1 obj2 = new Person1(obj1);

        obj2.display();
        obj2.display(11);
        obj2.display("Alice");


    }
}
