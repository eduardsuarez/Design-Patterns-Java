/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton.hilo.unico;

/**
 *
 * @author eduar
 */
public class SingletonHiloUnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           If you see the same value, the singleton was reuse (yay!)
                           If you see diferent values, then 2 singletons were created (booo!!)
                           
                           RESULT:
                           """);
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        System.out.println(singleton.value);
        
    }

}
