package abctractfactorymethod.gui.factory.macfactory;

import abctractfactorymethod.gui.factory.GUIFactory;
import abctractfactorymethod.gui.model.Button;
import abctractfactorymethod.gui.model.CheckBox;
import abctractfactorymethod.gui.products.mac.MacButton;
import abctractfactorymethod.gui.products.mac.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
