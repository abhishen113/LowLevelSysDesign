package DesignPatterns.CreationalPattern.BuilderMethod.builders;

import DesignPatterns.CreationalPattern.BuilderMethod.cars.CarType;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Engine;
import DesignPatterns.CreationalPattern.BuilderMethod.components.GPSNavigator;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Transmission;
import DesignPatterns.CreationalPattern.BuilderMethod.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);

    void setEngine(Engine engine);
    void setTranmission(Transmission tranmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
