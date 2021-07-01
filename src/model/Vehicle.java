package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String vehicleType = "";
    private String vehicleName = "";
    private String modelNumber = "";
    private String engineType = "";
    private int enginePower = 0;
    private int tireSize = 0;
    private String turbo;
    private String weight = "";

    public void setVehicle(String vehicleType, String vehicleName, String modelNumber, String engineType, int enginePower, int tireSize, String turbo, String weight) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
        this.turbo = turbo;
        this.weight = weight;
    }
}
