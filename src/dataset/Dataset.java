package dataset;

import model.Vehicle;

import java.util.ArrayList;

public class Dataset {
    public ArrayList<Vehicle> getVehicleObjects() {
        return createVehicleObject();
    }
   //Adding some dummy value to the list
    private ArrayList<Vehicle> createVehicleObject() {
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

        // inserting normal type vehicles
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle("Normal", "Maybach", "62", "oil", 181,45,"N/A","N/A");
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicle("Normal", "Chevrolet", "2021", "gas", 181,60,"N/A","N/A");

        // inserting sports vehicle
        Vehicle vehicle3 = new Vehicle();
        vehicle3.setVehicle("Sports", "Mazda", "MX-5 Miata", "oil", 181,44,"Yes","N/A");
        Vehicle vehicle4 = new Vehicle();
        vehicle4.setVehicle("Sports", "Porche", "911", "oil", 379,34,"Yes","N/A");

        // inserting heavy vehicle
        Vehicle vehicle5 = new Vehicle();
        vehicle5.setVehicle("Heavy", "Mercedes-Benz", "770", "diesel", 181,17,"N/A","2634");
        Vehicle vehicle6 = new Vehicle();
        vehicle6.setVehicle("Heavy", "Audi", "Q7 V12", "diesel", 227,25,"N/A","4800" );


        // adding them into array list
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);
        vehicleList.add(vehicle6);

        return vehicleList;
    }


}
