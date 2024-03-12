package parkinglot;

public class ParkingSpot {

    private  String id;
    private VehicleType type;

    private boolean isOccupied;


    public ParkingSpot(String id , VehicleType type){
        this.id = id;
        this.type = type;
    };

    public void occupySpot(){
        isOccupied = true;
    };

    public void freeSpot(){
        isOccupied = false;
    };


    // Getters and Setters
}
