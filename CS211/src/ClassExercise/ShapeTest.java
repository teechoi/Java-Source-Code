package ClassExercise;

public class ShapeTest {

    public static void main (String args[]){

        Circle circ = new Circle (12.0);
        Rectangle rect = new Rectangle(4,7);
        Triangle tri = new Triangle (5,12,13);
        printInfo(circ);
        printInfo(tri);
        printInfo(rect);


    }

    public static void printInfo(Shape s){
        System.out.println("The shape: " + s.getShapeName());
        System.out.println("area: " + s.area());
        System.out.println("perim: " + s.perimeter());
    }
}
