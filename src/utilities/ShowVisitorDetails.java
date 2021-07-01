package utilities;

import model.Vehicle;

import java.util.ArrayList;

public class ShowVisitorDetails {
    private int count = 30;

    public int visitorCount(ArrayList<Vehicle> vehicleArrayList){
        //Vehicle vehicle = new Vehicle();
        for (Vehicle vehicle : vehicleArrayList){
            if(vehicle.getVehicleType().equals("Sports")){
                count+=20;
            }
        }
        return  count;
    }
}
