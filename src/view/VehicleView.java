package view;

public class VehicleView {
    public void print(String vehicleType, String vehicleName, String modelNumber,
                      String engineType, int enginePower,
                      int tireSize, String turbo, String weight){
        System.out.format("|%-14s|%-20s|%-15s|%-15s|%-18d|%-16d|%-10s|%-10s|\n", vehicleType, vehicleName,
                modelNumber, engineType, enginePower,
                tireSize, turbo, weight);
    }
}
