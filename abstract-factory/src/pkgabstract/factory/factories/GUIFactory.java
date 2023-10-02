/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkgabstract.factory.factories;

import pkgabstract.factory.buttons.Button;
import pkgabstract.factory.checkboxes.Checkbox;

/**
 *
 * @author eduar
 */
public interface GUIFactory {
    Button createButton();
    Checkbox creatCheckbox();
    
}
