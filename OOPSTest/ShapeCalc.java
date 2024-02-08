package OOPSTest;
//Encapuslation using getter setters
class Circle {
    private double radius;
    private static final double pi = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double areaOfCircle() {
        return pi * Math.pow(radius, 2);
    }

    public double circumferenceOfCircle() {
        return 2 * pi * radius;
    }
}

public class ShapeCalc {
    public static void main(String[] args) {
        Circle parem1 = new Circle();
        parem1.setRadius(10.11);

        System.out.println("The Radius of the Circle is =  " + parem1.getRadius() + "\nThe Area Calculated is " + parem1.areaOfCircle() + "\nThe Circumference is = " + parem1.circumferenceOfCircle());
    }
}
