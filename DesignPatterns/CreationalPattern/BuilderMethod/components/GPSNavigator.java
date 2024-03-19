package DesignPatterns.CreationalPattern.BuilderMethod.components;

public class GPSNavigator {

    private String route;


    public GPSNavigator() {
        this.route = "221b, Baker Street , london to scotland yard , 8-10 boradway , london ";

    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
