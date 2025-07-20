package abctractfactorymethod.gui.factory.windowsfactory;

import abctractfactorymethod.gui.factory.GUIFactory;
import abctractfactorymethod.gui.model.Button;
import abctractfactorymethod.gui.model.CheckBox;
import abctractfactorymethod.gui.products.windows.WindowsButton;
import abctractfactorymethod.gui.products.windows.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
