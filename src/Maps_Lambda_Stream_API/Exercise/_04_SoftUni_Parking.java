package Maps_Lambda_Stream_API.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _04_SoftUni_Parking {

    public static void registerCar(LinkedHashMap<String, String> parkingSystem, String name, String numberPlate) {
        if (!parkingSystem.containsKey(name)) {
            parkingSystem.put(name, numberPlate);
            System.out.println(name + " registered " + numberPlate + " successfully");
        } else {
            System.out.println("ERROR: already registered with plate number " + parkingSystem.get(name));
        }
    }

    public static void unregisterCar(LinkedHashMap<String, String> parkingSystem, String name) {

        if (!parkingSystem.containsKey(name)) {
            System.out.println("ERROR: user " + name + " not found");
        } else {
            System.out.println(name + " unregistered successfully");
            parkingSystem.remove(name);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, String> parkingSystem = new LinkedHashMap<>();
        for (int i = 1; i <= num; i++) {
            String[] command = scan.nextLine().split(" ");
            String instruction = command[0];
            String name = command[1];
            String plateNumber = "";
            if (command.length == 3) {
                plateNumber = command[2];
            }

            if (instruction.equals("register")) {
                registerCar(parkingSystem, name, plateNumber);
            } else {
                unregisterCar(parkingSystem, name);
            }
        }
        parkingSystem.forEach((key, value) -> System.out.printf("%s => %s\n", key, value));
    }
}
