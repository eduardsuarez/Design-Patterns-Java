/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton.seguridad.cargadiferida;

/**
 *
 * @author eduar
 */
public class DemoMultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("If you are see the same value, then singleton was reused (yay!)" + "\n"
                + "If you see different values, then 2 singletons were created (boo0!)" + "\n\n"
                + "Result:" + "\n");
        
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    
    static class ThreadFoo implements Runnable {
        @Override
        public void run(){
            Singleton singleton = Singleton.getIntance("FOO");
            System.out.println(singleton.value);
        }
    }
    
    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getIntance("BAR");
            System.out.println(singleton.value);
        }
    }

}
