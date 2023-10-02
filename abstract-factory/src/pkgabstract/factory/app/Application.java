/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory.app;

import pkgabstract.factory.buttons.Button;
import pkgabstract.factory.checkboxes.Checkbox;
import pkgabstract.factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces
 * @author eduar
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.creatCheckbox();
    }
    
    public void paint() {
        button.paint();
        checkbox.paint();
    }
    
}
