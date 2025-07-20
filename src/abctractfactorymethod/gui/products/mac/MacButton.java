package abctractfactorymethod.gui.products.mac;

import abctractfactorymethod.gui.model.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
