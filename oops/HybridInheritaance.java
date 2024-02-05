package oops;

class MotherDear {

    void teacher() {
        System.out.println("Mother's are always right , they dont want nothing bad for you");
    }

    void values() {
        System.out.println("Mother's Values help their children Grow");
    }
}

class Elderson extends MotherDear {
    String Name;
    int Age;

    String address;
    String profession;

    Elderson(String Name, int Age, String address, String profession) {
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

class EldersonInfo extends Elderson {
    String message;

    public EldersonInfo(String Name, int Age, String address, String profession, String message) {
        super(Name, Age, address, profession);                                        // Super keyword - refer to objects of super class , our case ElderSon , when you make sub class object then we need to use super keyword
        this.message = message;
    }

    void printMessage() {
        System.out.println("to the days we laugh while we used to cry , and the to the days we cry when we used to laugh");
    }
}

class Youngerson extends MotherDear {
    String Name;
    int Age;

    String address;
    String profession;

    public Youngerson(String Name, int Age, String address, String profession) {
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

public class HybridInheritaance {
    public static void main(String[] args) {
        Elderson son1 = new Elderson("Prahjee", 25, "9307 Yoland Ave , Northridge, CA 91324", "Software Engineer");
        Youngerson son2 = new Youngerson("Japjee", 23, "1905/143 Ganesh Pura Tri Nagar", "BusinessMan");
        EldersonInfo info = new EldersonInfo("Prahjee", 25, "9307 Yoland Ave , Northridge, CA 91324", "Software Engineer", "Some Message - ");
        son1.info();
        son2.info();
        info.printMessage();
    }
}
