package ClassExercise;

public class Circle implements Shape {

    private double radius;
    private String shape;

    public Circle (double radius){
        this.radius = radius;
        this.shape = "circle";
    }

    public String getShapeName(){
        return shape;
    }

    public double area() {
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2.0*Math.PI*radius;
    }
}
