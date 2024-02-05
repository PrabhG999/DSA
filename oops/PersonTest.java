package oops;

class Person {       //parameterized constructor
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("NAME " + name);
        System.out.println("AGE " + age);
    }
}
public class PersonTest {
    public static void main(String []args){
        Person p1 = new Person("Prabhjee ",25);
        p1.display();
    }

}
