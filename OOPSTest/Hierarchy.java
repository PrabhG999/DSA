package OOPSTest;

class Vehicle {
    String make;
    String Model;
    int Year;
    int Fuel;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setFuel(int Fuel) {
        this.Fuel = Fuel;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public int getFuel() {
        return Fuel;
    }

    public void displayInfo() {

    }

    public void displayInfo(String make, String Model) {
    }


    public void displayInfo(int Year, int Fuel) {
    }

}

class Car extends Vehicle {
    public Car() {
        this.make = make;
        this.Model = Model;
        this.Year = Year;
        this.Fuel = Fuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Info for a CAR");
        System.out.println(make);
        System.out.println(Model);
        System.out.println(Year);
        System.out.println(Fuel);
    }

    @Override
    public void displayInfo(String make, String Model) {
        System.out.println(make);
        System.out.println(Model);

    }

    @Override
    public void displayInfo(int Year, int Fuel) {
        System.out.println(Year);
        System.out.println(Fuel);
    }

}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        this.make = make;
        this.Model = Model;
        this.Year = Year;
        this.Fuel = Fuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Info for a Motorcycle");
        System.out.println(make);
        System.out.println(Model);
        System.out.println(Year);
        System.out.println(Fuel);
    }

    @Override
    public void displayInfo(String make, String Model) {
        System.out.println(make);
        System.out.println(Model);
    }

    @Override
    public void displayInfo(int Year, int Fuel) {
        System.out.println(Year);
        System.out.println(Fuel);
    }
}

class Truck extends Vehicle {
    public Truck() {
        this.make = make;
        this.Model = Model;
        this.Year = Year;
        this.Fuel = Fuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Info for a Truck");
        System.out.println(make);
        System.out.println(Model);
        System.out.println(Year);
        System.out.println(Fuel);
    }

    @Override
    public void displayInfo(String make, String Model) {
        System.out.println(make);
        System.out.println(Model);
    }

    @Override
    public void displayInfo(int Year, int Fuel) {
        System.out.println(Year);
        System.out.println(Fuel);
    }

}

public class Hierarchy {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("camry");
        car1.setYear(2022);
        car1.setFuel(89);
        car1.displayInfo();

        System.out.println();

        Motorcycle bike1 = new Motorcycle();
        bike1.setMake("BMW");
        bike1.setModel("RR");
        bike1.setYear(2023);
        bike1.setFuel(91);
        bike1.displayInfo();
        System.out.println("Just The Make and Model" + bike1.getMake() + " "+ bike1.getModel());

        System.out.println("Just the Year and Fuel" + bike1.getYear()+" "+bike1.getFuel());


        System.out.println();
        Truck t1 = new Truck();
        t1.setMake("RAM");
        t1.setModel("RHINO");
        t1.setYear(2021);
        t1.setFuel(91);
        t1.displayInfo();

    }
}
