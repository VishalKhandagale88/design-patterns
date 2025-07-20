package abctractfactorymethod.gui.app;

import abctractfactorymethod.gui.factory.GUIFactory;
import abctractfactorymethod.gui.factory.macfactory.MacFactory;
import abctractfactorymethod.gui.factory.windowsfactory.WindowsFactory;
import abctractfactorymethod.gui.products.windows.WindowsCheckBox;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = "mac";
        if (os.equalsIgnoreCase("windows")){
            factory = new WindowsFactory();
        }else {
            factory = new MacFactory();
        }
        Application guApplication = new Application(factory);
        guApplication.renderUI();


    }
}
