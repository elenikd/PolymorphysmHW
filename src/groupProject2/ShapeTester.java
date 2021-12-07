package groupProject2;

public class ShapeTester {

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimiter();
        }
    }
}
