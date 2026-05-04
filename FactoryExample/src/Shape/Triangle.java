package Shape;

import Shape.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}
