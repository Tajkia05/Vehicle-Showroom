package utilities;

import dataset.StringSet;
import model.Vehicle;

import java.util.Scanner;

public class AddVehicle {
    Scanner input;
    Vehicle vehicle;
    private String vehicleType, vehicleName, modelNumber, engineType, turbo = "N/A", weight = "N/A";
    private int enginePower, tireSize;

    public void initials(){
        System.out.println(StringSet.vehicleType);

    }
    public Vehicle vehicleInformation(){
        input = new Scanner(System.in);

        System.out.print("Enter Choice: ");
        vehicleType = isChoiceValid(input.nextInt());

        switch (vehicleType){
            case "Normal":
                System.out.print("\nEnter Vehicle Name: ");
                input.nextLine();
                vehicleName = input.nextLine();

                System.out.print("\nEnter Model Number: ");
                modelNumber = input.nextLine();
                System.out.println();

                System.out.print(StringSet.engineInfo);
                int choiceEngine = input.nextInt();
                if(choiceEngine == 1) engineType = "Oil";
                else if(choiceEngine == 2) engineType = "Gas";
                else engineType = "Diesel";

                System.out.print("\nEnter Engine Power (Horse Power): ");
                input.nextLine();
                enginePower = input.nextInt();

                System.out.print("\nEnter Tire Size (Inch): ");
                input.nextLine();
                tireSize = input.nextInt();
                break;
            case "Sports":
                System.out.print("\nEnter Vehicle Name: ");
                input.nextLine();
                vehicleName = input.nextLine();

                System.out.print("\nEnter Model Number: ");
                modelNumber = input.nextLine();

                engineType = "Oil";

                System.out.print("\nEnter Engine Power (Horse Power): ");
                enginePower = input.nextInt();
                System.out.println();

                System.out.print("\nEnter Tire Size (Inch): ");
                tireSize = input.nextInt();
                System.out.println();

                System.out.print(StringSet.turboInfo);
                //input.nextInt();
                int choice = input.nextInt();
                if(choice == 1) turbo = "Yes";
                else turbo = "No";

                break;
            case "Heavy":
                System.out.print("\nEnter Vehicle Name: ");
                input.nextLine();
                vehicleName = input.nextLine();

                System.out.print("\nEnter Model Number: ");
                modelNumber = input.nextLine();
                System.out.println();

                engineType = "Diesel";

                System.out.print("\nEnter Engine Power (Horse Power): ");
                enginePower = input.nextInt();
                System.out.println();

                System.out.print("\nEnter Tire Size (Inch): ");
                tireSize = input.nextInt();
                System.out.println();

                System.out.print("\nEnter Vehicle Weight (Kg): ");
                weight = input.next();
                System.out.println();

                break;
        }

        vehicle = new Vehicle();
        vehicle.setVehicle(vehicleType, vehicleName, modelNumber, engineType, enginePower, tireSize, turbo, weight);
        return vehicle;
    }

    private String isChoiceValid(int choice) {
        if(choice == 1)
            return "Normal";
        else if(choice == 2)
            return "Sports";
        else if(choice == 3)
            return "Heavy";
        else {
            System.out.println("You didn't enter a valid option, it is set 1 by default");
            return "Normal";
        }
    }


}
