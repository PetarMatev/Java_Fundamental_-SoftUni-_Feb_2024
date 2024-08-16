package Objects_and_Classes._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Opinion_Poll {

    static class Person {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void printPeopleAbove30(List<Person> opinionPoll) {
        for (Person person : opinionPoll) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %d\n", person.getName(), person.getAge());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        List<Person> opinionPoll = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            String info = scan.nextLine();
            String[] infoBreakdown = info.split(" ");
            String personName = infoBreakdown[0];
            int personAge = Integer.parseInt(infoBreakdown[1]);

            Person person = new Person();
            person.setName(personName);
            person.setAge(personAge);
            opinionPoll.add(person);
        }
        printPeopleAbove30(opinionPoll);
    }
}


