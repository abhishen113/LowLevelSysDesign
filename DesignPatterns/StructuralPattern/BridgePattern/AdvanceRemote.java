package DesignPatterns.StructuralPattern.BridgePattern;

public class AdvanceRemote extends  BasicRemote{

    public AdvanceRemote(Device device){
        super.device = device;
    }
    public void mute(){
        System.out.println("Remote: Mute");
        device.setVolume(0);
    }
}
