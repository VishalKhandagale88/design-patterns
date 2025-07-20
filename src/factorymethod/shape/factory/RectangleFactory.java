package factorymethod.shape.factory;

import factorymethod.shape.model.Rectangle;
import factorymethod.shape.model.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();

    }
}
