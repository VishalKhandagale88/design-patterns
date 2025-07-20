package factorymethod.shape.app;

import factorymethod.shape.factory.CircleFactory;
import factorymethod.shape.factory.RectangleFactory;
import factorymethod.shape.factory.ShapeFactory;
import factorymethod.shape.factory.SquareFactory;
import factorymethod.shape.model.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape shape = circleFactory.createShape();
        shape.shapeName();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();;
        rectangle.shapeName();

        ShapeFactory squareFactory = new SquareFactory();
        Shape squareShape = squareFactory.createShape();
        squareShape.shapeName();
    }
}
