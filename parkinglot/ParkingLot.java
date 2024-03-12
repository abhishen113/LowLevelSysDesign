package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {



    private List<ParkingSpot> parkingSpots;
    private List<ParkingTicket> issuedTickets;


    public ParkingLot(){
        this.parkingSpots = new ArrayList<>();
        this.issuedTickets = new ArrayList<>();

    }

    public ParkingSpot findAvailableSpot(VehicleType type){
        return null;
    }

    public ParkingTicket issueTicket(Vehicle vehicle){
        ParkingSpot spot = findAvailableSpot(vehicle.type);

        if (spot  != null) {
            spot.occupySpot();
            ParkingTicket ticket = new ParkingTicket(generateTicket());
            issuedTickets.add(ticket);
            return ticket;
        }
        return null;
    }

    public void processPayment(ParkingTicket ticket, double fee){
        ticket.markPaid(fee);
    }

    private String generateTicket(){
        return "TICKET_" + System.currentTimeMillis();
    }

}
