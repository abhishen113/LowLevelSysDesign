package parkinglot;

import java.util.Date;

public class ParkingTicket {


    private String ticketid;
    private Date issuesAt;
    private Date paidAt;

    private double fee;


    public ParkingTicket(String ticketid){
        this.ticketid = ticketid;
        this.issuesAt = new Date();
    }


    public void markPaid(double fee) {

    }
}
