package ClassExercise;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;
    private String shape;

    public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.shape = "Triangle";
    }

    public String getShapeName(){
        return shape;
    }

    public double area(){
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double perimeter(){
        return a+b+c;
    }
}
