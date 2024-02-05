package oops;

//parent class
class Mother {

    void teacher() {
        System.out.println("Mother's are always right , they dont want nothing bad for you");
    }

    void values() {
        System.out.println("Mother's Values help their children Grow");
    }
}

class ElderSon extends MotherDear {
    String Name;
    int Age;

    String address;
    String profession;

    ElderSon(String Name, int Age, String address, String profession) {
        this.Name = Name;
        this.Age = Age;
        this.address = address;
        this.profession = profession;
    }

    void info() {
        System.out.println("NAME " + Name);
        System.out.println("AGE " + Age);
        System.out.println("Address " + address);
        System.out.println("Profession " + profession);
    }
}

class YoungerSon extends MotherDear {
    String Name;
    int Age;

    String address;
    String profession;

    YoungerSon(String Name, int Age, String address, String profession) {
        this.Name = Name;
        this.Age = Age;
        this.address = address;
        this.profession = profession;
    }

    void info() {
        System.out.println("NAME " + Name);
        System.out.println("AGE " + Age);
        System.out.println("Address " + address);
        System.out.println("Profession " + profession);
    }
}

public class HierchicalInheritance {
    public static void main(String[] args) {
        Elderson son1 = new Elderson("Prahjee",25,"9307 Yoland Ave , Northridge, CA 91324","Software Engineer");
        Youngerson son2 = new Youngerson("Japjee",23,"1905/143 Ganesh Pura Tri Nagar","BusinessMan");

        son1.teacher();
        son2.teacher();
        son1.info();
        son2.info();
    }
}
