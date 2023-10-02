/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder.builders;

import builder.cars.CarType;
import builder.cars.Manual;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;

/**
 * Unlike other creational patterns, Buuilder can construct unrelated products,
 * which don't have the common interface.
 * 
 * In this case we build a user manual for a car, using the same steps as we
 * build a car. This allows to produce manuals for specific car models,
 * configured with different feactures.
 * @author eduar
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    
    @Override
    public void setCarType(CarType type){
        this.type = type;
    }
    
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    
    @Override
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }
    
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }
    
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
    
    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
    
}
