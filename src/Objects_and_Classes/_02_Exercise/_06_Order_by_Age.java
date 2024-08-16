package Objects_and_Classes._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Order_by_Age {
    public static class Person {
        String name;
        String id;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format(
                    "%s with ID: %s is %d years old.",
                    this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while (true) {
            String instruction = scan.nextLine();
            if (instruction.equals("End")) {
                break;
            }

            String[] command = instruction.split(" ");
            String name = command[0];
            String id = command[1];
            int age = Integer.parseInt(command[2]);
            Person person = new Person(name, id, age);
            people.add(person);
        }

        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        for (Person person : sortedByAge) {
            System.out.println(person);
        }

    }
}
