/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method.factory;

import factory.method.buttons.Button;

/**
 *
 * @author eduar
 */
public abstract class Dialog {
    public void renderWindow() {
            Button okButton = createButton();
            okButton.render();
    }
    /**
     * Subclasses will obverride this method inn order to create specific button
     * objects.
     */
    public abstract Button createButton();
    
}
