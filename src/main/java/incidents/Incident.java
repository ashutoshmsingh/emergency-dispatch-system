package main.java.incidents;

public class Incident {
    private String id;
    private String description;
    private double distanceFromBase;
    private int severity;
    private String status;
    private String assignedUnitId; 
    String getRequiredCapability(){
        return "GENERAL";
    }
    double getPriorityWeight(){
        return severity*5;
    }
    double getWorkload(){
        return severity;
    }
    
}
