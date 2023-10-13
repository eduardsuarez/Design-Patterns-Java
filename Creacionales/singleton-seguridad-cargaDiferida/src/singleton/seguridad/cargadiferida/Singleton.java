/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.seguridad.cargadiferida;

/**
 *
 * @author eduar
 */
public final class Singleton {

    // The field must be declared volatile so that double check lock would
    // work correctly
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getIntance(String value) {
//    The approach taken here is called double-checked locking (DLC). iT
//    exits to  prevent race condition between mutiple threads that may 
//    attemp to get singleton instance at the same time, creating separat
//    instances as a result.
//    
//    It may seem that having the `result`  variable here is completely
//    pointless. There is however, a very important caveat when
//    implementing ddouble-checked locking in Java, which is solved by 
//    introducing this local variable.

        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }

    }

}
