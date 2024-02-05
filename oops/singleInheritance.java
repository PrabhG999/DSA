package oops;

class Car {

    void honk() {
        System.out.println("Beep .... Beeeeeep");
    }
}

class Detail extends Car {
    String Make;
    String Model;

    String color;
    double mileage;

    //constructor
    public Detail(String Make, String Model, String color, double mileage) {
        this.Make = Make;
        this.Model = Model;
        this.color = color;
        this.mileage = mileage;
    }

    //method to display all
    public void detailInfo() {
        System.out.println("MAKE " + Make);
        System.out.println("MODEL " + Model);
        System.out.println("Color " + color);
        System.out.println("MileAge" + mileage);
    }

    public void detailInfo(String Make) {

        System.out.println("MAKE " + Make);
    }

    public void detailInfo(String Model, String color) {

        System.out.println("MODEL " + Model);
        System.out.println("Color " + color);
    }

    public void detailInfo(double mileage) {

        System.out.println("Mileage" + mileage);
    }

}

public class singleInheritance {
    public static void main(String[] args) {
        Detail car1 = new Detail("Toyota", "Camry", "Red", 32.2);


        car1.detailInfo();
        car1.honk();

    }
}
