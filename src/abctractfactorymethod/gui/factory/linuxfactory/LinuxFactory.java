package abctractfactorymethod.gui.factory.linuxfactory;

import abctractfactorymethod.gui.factory.GUIFactory;
import abctractfactorymethod.gui.model.Button;
import abctractfactorymethod.gui.model.CheckBox;
import abctractfactorymethod.gui.products.linux.LinuxButton;
import abctractfactorymethod.gui.products.linux.LinuxCheckBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
