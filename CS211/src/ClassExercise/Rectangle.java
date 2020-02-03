package ClassExercise;

public class Rectangle implements Shape {

    private double width;
    private double height;
    private String shape;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
        this.shape = "Rectangle";
    }

    public String getShapeName(){
        return shape;
    }

    public double area(){
        return width*height;
    }

    public double perimeter(){
        return 2.0*(width + height);
    }
}
