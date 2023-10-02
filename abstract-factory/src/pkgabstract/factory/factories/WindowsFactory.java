/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory.factories;

import pkgabstract.factory.buttons.Button;
import pkgabstract.factory.buttons.WindowsButton;
import pkgabstract.factory.checkboxes.Checkbox;
import pkgabstract.factory.checkboxes.WindowsCheckbox;

/**
 * 
 * @author eduar
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }
    
    
}
