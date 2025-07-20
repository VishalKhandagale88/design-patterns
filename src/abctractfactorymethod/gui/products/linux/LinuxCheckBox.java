package abctractfactorymethod.gui.products.linux;

import abctractfactorymethod.gui.model.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void toggle() {
        System.out.println("Linux Button");
    }
}
