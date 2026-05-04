package Helper.Factory;

import Helper.Factory.Interface.ShapeFactory;
import Shape.Interface.Shape;
import Shape.*;

public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
