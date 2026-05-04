package Shape;

import Shape.Interface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
