/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory.factories;

import pkgabstract.factory.buttons.Button;
import pkgabstract.factory.buttons.MacOSButton;
import pkgabstract.factory.checkboxes.Checkbox;
import pkgabstract.factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety
 *
 * @author eduar
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacOSCheckbox();
    }

}
