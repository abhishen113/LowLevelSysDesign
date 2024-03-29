package DesignPatterns.CreationalPattern.BuilderMethod.builders;

import DesignPatterns.CreationalPattern.BuilderMethod.cars.CarType;
import DesignPatterns.CreationalPattern.BuilderMethod.cars.Manual;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Engine;
import DesignPatterns.CreationalPattern.BuilderMethod.components.GPSNavigator;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Transmission;
import DesignPatterns.CreationalPattern.BuilderMethod.components.TripComputer;

public class CarManualBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type) {
        this.type = type;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTranmission(Transmission tranmission) {
        this.transmission = tranmission;
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
        return new Manual( type, seats, engine, transmission, tripComputer ,gpsNavigator);
    }
}
