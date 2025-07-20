package abctractfactorymethod.gui.app;

import abctractfactorymethod.gui.factory.GUIFactory;
import abctractfactorymethod.gui.model.Button;
import abctractfactorymethod.gui.model.CheckBox;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkBox.toggle();
    }
}
