package utilities;

import controller.VehicleController;
import dataset.StringSet;
import model.Vehicle;
import view.VehicleView;

import java.util.ArrayList;

public class SeeVehicleDetails {
    public void printVehicleList(ArrayList<Vehicle> vehicleList){
        if(vehicleList.isEmpty()){
            System.out.println("No Vehicles have been listed yet");
            return;
        }
        else{
            displayVehiclesList(vehicleList);
            }
        }

    private void displayVehiclesList(ArrayList<Vehicle> vehicleList) {
        headerFormat();
        for(Vehicle vehicle : vehicleList){
            VehicleView view = new VehicleView();
            VehicleController controller = new VehicleController(vehicle, view);
            System.out.println(StringSet.rowLine);
            controller.showDetails();
        }
        System.out.println(StringSet.rowLine);
    }

    private void headerFormat() {
        System.out.println(StringSet.rowLine);
        System.out.format("|%-14s|%-20s|%-15s|%-15s|%-18s|%-16s|%-10s|%-10s|%n", "Vehicle Type", "Vehicle Name",
                "Model Number", "Engine Type", "Engine Power (HP)",
                "Tire Size (Inch)", "Turbo", "Weight(Kg)");
    }
}

