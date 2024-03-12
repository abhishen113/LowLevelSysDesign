package parkinglot;

abstract class Vehicle {


    private String licenseNumber;
    protected VehicleType type;

    public Vehicle(String licensePlate , VehicleType type){
        this.licenseNumber = licensePlate;
        this.type = type;
    }


    // other attributes and methods



}




enum VehicleType {
    COMPACT , LARGE , HANDICAPPED

}