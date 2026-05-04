package Shape;

import Shape.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
