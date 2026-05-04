package Helper.Factory;

import Helper.Factory.Interface.ShapeFactory;
import Shape.*;
import Shape.Interface.Shape;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
