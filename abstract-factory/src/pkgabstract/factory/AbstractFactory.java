/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract.factory;

import pkgabstract.factory.app.Application;
import pkgabstract.factory.factories.GUIFactory;
import pkgabstract.factory.factories.MacOSFactory;
import pkgabstract.factory.factories.WindowsFactory;

/**
 *
 * @author eduar
 */
public class AbstractFactory {
    /**
     * Application picks the factory type and creates it in ru time ( usually at
     * initialization stage), depending on the configuration or environment 
     * variables
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
    
}
