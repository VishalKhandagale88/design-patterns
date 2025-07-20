package factorymethod.shape.factory;

import factorymethod.shape.model.Circle;
import factorymethod.shape.model.Shape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();

    }
}
