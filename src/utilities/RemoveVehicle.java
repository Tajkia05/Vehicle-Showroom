package utilities;

import controller.VehicleController;
import model.Vehicle;
import view.VehicleView;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveVehicle {
    private String vehicleName;
    private String modelNumber;
    private Scanner input = new Scanner(System.in);

    public void initials() {
        System.out.print("Enter vehicle name: ");
        vehicleName = input.nextLine();
        System.out.print("Enter model number: ");
        modelNumber = input.nextLine();
    }

    public boolean removeVehicle(ArrayList<Vehicle> vehicleArrayList){
        Vehicle vehicle = new Vehicle();
        vehicle = findVehicle(vehicleArrayList);
        if(vehicle != null){
            vehicleArrayList.remove(vehicle);
            System.out.println("Vehicle Removed Successfully!!");
            return true;

        }
        return false;
    }

    private Vehicle findVehicle(ArrayList<Vehicle> vehicleArrayList) {
        for(Vehicle vehicle : vehicleArrayList){
            VehicleView view = new VehicleView();
            VehicleController controller = new VehicleController(vehicle, view);
            if(controller.getVehicleName().equals(vehicleName) && controller.getmodelNumber().equals(modelNumber)){
                return vehicle;
            }
        }
        System.out.println("The vehicle name or model is incorrect");
        return null;
    }


}
