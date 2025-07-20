package factorymethod.shape.factory;

import factorymethod.shape.model.Shape;
import factorymethod.shape.model.Square;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
