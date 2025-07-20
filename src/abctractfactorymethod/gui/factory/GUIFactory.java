package abctractfactorymethod.gui.factory;

import abctractfactorymethod.gui.model.Button;
import abctractfactorymethod.gui.model.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
