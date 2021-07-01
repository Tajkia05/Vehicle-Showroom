import dataset.Dataset;
import dataset.StringSet;
import model.Vehicle;
import utilities.AddVehicle;
import utilities.RemoveVehicle;
import utilities.SeeVehicleDetails;
import utilities.ShowVisitorDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int option = 1;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public static void main(String[] args) {
        System.out.print(StringSet.welcome);
        initializeDemoObjects();

        while (option >= 1 && option < 5) {
            System.out.print("Enter Your Option: ");
            option = input.nextInt();

            switch (option) {
                case 1:// Add a Vehicle
                    AddVehicle addVehicle = new AddVehicle();
                    addVehicle.initials();
                    vehicleList.add(addVehicle.vehicleInformation());

                    System.out.println("Vehicle Added Successfully!!");
                    break;

                case 2: // Remove a vehicle
                    RemoveVehicle removeVehicle = new RemoveVehicle();
                    removeVehicle.initials();
                    removeVehicle.removeVehicle(vehicleList);
                    break;

                case 3: //SHow list of vehicle with details
                    System.out.println("List of vehicles currently available in showroom: ");
                    SeeVehicleDetails seeDetails = new SeeVehicleDetails();
                    seeDetails.printVehicleList(vehicleList);
                    break;

                case 4: // See list of vehicles with expected customer count
                    ShowVisitorDetails visitorDetails = new ShowVisitorDetails();
                    System.out.print("Total # Visitor: ");
                    System.out.println(visitorDetails.visitorCount(vehicleList));
                    SeeVehicleDetails showDetails = new SeeVehicleDetails();
                    System.out.println("List of vehicles currently available in showroom: ");
                    showDetails.printVehicleList(vehicleList);
                    break;

                case 5:
                    exitSystem();
            }

        }

    }

    private static void exitSystem() {
            System.out.print("Exiting from system....");
            input.close();
    }

    private static void initializeDemoObjects() {
        Dataset dataset = new Dataset();
        vehicleList = dataset.getVehicleObjects();
    }
}
