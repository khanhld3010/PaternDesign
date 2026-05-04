import Helper.Factory.CircleFactory;
import Helper.Factory.RectangleFactory;
import Helper.Factory.SquareFactory;
import Helper.Factory.TriangleFactory;
import Shape.Interface.Shape;

public class App {
    static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        RectangleFactory rectangleFactory = new RectangleFactory();
        SquareFactory squareFactory = new SquareFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
        Shape square = squareFactory.createShape();
        square.draw();
        TriangleFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape();
        triangle.draw();
    }
}
