package Objects_and_Classes._03_More_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_Raw_Data {

    public static class Engine {
        private int engineSpeed;
        private int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getEngineSpeed() {
            return engineSpeed;
        }

        public void setEngineSpeed(int engineSpeed) {
            this.engineSpeed = engineSpeed;
        }

        public int getEnginePower() {
            return enginePower;
        }

        public void setEnginePower(int enginePower) {
            this.enginePower = enginePower;
        }
    }

    public static class Model {
        private String model;

        public String getModel() {
            return model;
        }

        public Model(String model) {
            this.model = model;
        }


        public void setModel(String model) {
            this.model = model;
        }
    }

    public static class Car {
        private Model model;
        private Engine engine;


        public Model getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = new Model(model);
        }

        public Engine getEngine() {
            return engine;
        }


        public void setEngine(int engineSpeed, int enginePower) {
            this.engine = new Engine(engineSpeed, enginePower);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String[] command = scan.nextLine().split(" ");
            String model = command[0];
            int engineSpeed = Integer.parseInt(command[1]);
            int enginePower = Integer.parseInt(command[2]);
            Car car = new Car();
            car.setModel(model);
            car.setEngine(engineSpeed, enginePower);
            cars.add(car);
        }
    }
}