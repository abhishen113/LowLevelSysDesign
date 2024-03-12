package parkinglot;

import java.util.List;

public class ParkingFloor {


    private List<ParkingSpot> spots;
}

class CarSpot extends ParkingSpot{
    public CarSpot(String id, VehicleType type) {
        super(id, type);
    }
    // car specific attributes
}
