package abctractfactorymethod.gui.products.windows;

import abctractfactorymethod.gui.model.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void toggle() {
        System.out.println("toggling check box");
    }
}
