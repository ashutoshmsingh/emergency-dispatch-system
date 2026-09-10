package main.java.capabilities;

public class BatteryPowered {
    void recharge(double amount){}

    double getBatteryLevel(){
        return 0.0;
    }

    double getBatteryCapacity(){
        return 0.0;
    }

    double consumeBattery(double amount){
        return 0.0;
    }

    boolean hasBatteryFor(double amount){
        return true;
    }

}
