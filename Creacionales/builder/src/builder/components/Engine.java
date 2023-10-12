/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder.components;

/**
 * Just another feacture of a car
 * @author eduar
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
    
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage; 
    }
    
    public void on() {
        started = true;
    }
    
    public void off() {
        started = false;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }
    public double getVolume(){
        return volume;
    }
    public double getMileage() {
        return mileage;
    }
}
