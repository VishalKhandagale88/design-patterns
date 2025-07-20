package abctractfactorymethod.gui.products.mac;

import abctractfactorymethod.gui.model.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void toggle() {
        System.out.println("toggling mac check box");
    }
}
