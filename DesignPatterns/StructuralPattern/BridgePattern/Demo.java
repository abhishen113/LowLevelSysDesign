package DesignPatterns.StructuralPattern.BridgePattern;

import VendingMachine.SoldOutException;

public class Demo {

    public static void main(String[] args){
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic Remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();


        System.out.println("Tests with advance Remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.mute();
        device.printStatus();

    }
}
