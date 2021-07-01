package controller;

import model.Vehicle;
import view.VehicleView;

public class VehicleController {
    private Vehicle vehicle;
    private VehicleView vehicleView;

    public VehicleController(Vehicle vehicle,VehicleView vehicleView ){
        this.vehicle = vehicle;
        this.vehicleView = vehicleView;
    }
    public String getVehicleType(){
        return vehicle.getVehicleType();
    }

    public String getVehicleName(){
        return vehicle.getVehicleName();
    }

    public String getmodelNumber(){
        return vehicle.getModelNumber();
    }
    public String getEngineType(){
        return vehicle.getEngineType();
    }
    public int getEnginePower(){
        return vehicle.getEnginePower();
    }
    public int getTireSize(){
        return vehicle.getTireSize();
    }
    public String getTurboInfo(){
        return vehicle.getTurbo();
    }
    public String getWeight(){
        return vehicle.getWeight();
    }

    //show all vehicle information
    public void showDetails(){
        vehicleView.print(getVehicleType(), getVehicleName(), getmodelNumber(), getEngineType(), getEnginePower(), getTireSize(), getTurboInfo(), getWeight());
    }

    //show specific type vehicle information
    public void showSpecificVehicleInformation(String type){
        if(type.equals(getVehicleType())){
            vehicleView.print(getVehicleType(), getVehicleName(), getmodelNumber(), getEngineType(), getEnginePower(), getTireSize(), getTurboInfo(), getWeight());
        }
        else return;
    }





}
