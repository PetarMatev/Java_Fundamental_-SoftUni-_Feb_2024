package Objects_and_Classes._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Vehicle_Catalogue {

    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        @Override
        public String toString() {
            return "Type: " + type + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n" +
                    "Horsepower: " + horsepower;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }
    }

    public static void produceAverageNumber(double averageInput, String typeCar) {
        if (Double.isNaN(averageInput)) {
            averageInput = 0.00;
        }
        if (typeCar.equals("Cars")) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageInput);
        } else if (typeCar.equals("Trucks")) {
            System.out.printf("Trucks have average horsepower of: %.2f.", averageInput);
        }
    }

    public static double calcAverage(int totalHorsePower, int totalCounter) {
        return (double) totalHorsePower / totalCounter;
    }

    public static int[] getCounterAndHorsepowerInputs(List<Vehicle> vehicles, String typeCar) {
        int counter = 0;
        int horsePower = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(typeCar)) {
                counter++;
                horsePower += vehicle.getHorsepower();
            }
        }
        return new int[]{counter, horsePower};
    }


    public static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] instructions = command.split(" ");
            String type = capitalizeFirstLetter(instructions[0]);
            String model = instructions[1];
            String color = instructions[2];
            int horsepower = Integer.parseInt(instructions[3]);
            Vehicle vehicle = new Vehicle();
            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsepower(horsepower);
            vehicles.add(vehicle);

            command = scan.nextLine();
        }

        String furtherCommand = scan.nextLine();
        while (!furtherCommand.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(furtherCommand)) {
                    System.out.println(vehicle);
                }
            }
            furtherCommand = scan.nextLine();
        }

        int[] carParam = getCounterAndHorsepowerInputs(vehicles, "Car");
        int carCounter = carParam[0];
        int carHorsePower = carParam[1];

        int[] truckParam = getCounterAndHorsepowerInputs(vehicles, "Truck");
        int truckCounter = truckParam[0];
        int truckHorsePower = truckParam[1];

        double carAverageHorsePower = calcAverage(carHorsePower, carCounter);
        double truckAverageHorsePower = calcAverage(truckHorsePower, truckCounter);

        produceAverageNumber(carAverageHorsePower, "Cars");
        produceAverageNumber(truckAverageHorsePower, "Trucks");
    }
}

