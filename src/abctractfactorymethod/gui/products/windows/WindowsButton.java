package abctractfactorymethod.gui.products.windows;

import abctractfactorymethod.gui.model.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
