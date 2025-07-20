package abctractfactorymethod.gui.products.linux;

import abctractfactorymethod.gui.model.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }
}
