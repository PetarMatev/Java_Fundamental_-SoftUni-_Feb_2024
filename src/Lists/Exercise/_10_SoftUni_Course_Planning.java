package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _10_SoftUni_Course_Planning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>(Arrays.asList(scan.nextLine().split(", ")));

        String command = scan.nextLine();
        while (!command.equals("course start")) {

            String[] Instructions = command.split(":");
            String action = Instructions[0];
            String lessonTitle = Instructions[1];

            if (action.equals("Add")) {

                if (!courses.contains(lessonTitle)) {
                    courses.add(lessonTitle);

                }
            } else if (action.equals("Remove")) {

                if (courses.contains(lessonTitle)) {
                    courses.remove(lessonTitle);
                }

                if (courses.contains(lessonTitle + "-Exercise")) {
                    courses.remove(lessonTitle + "-Exercise");
                }


            } else if (action.equals("Exercise")) {

                if (courses.contains(lessonTitle)) {
                    String reviewForExricse = lessonTitle + "-Exercise";
                    if (!courses.contains(reviewForExricse)) {

                        String newLessonTitle = lessonTitle + "-Exercise";
                        Integer replaceIndex = courses.indexOf(lessonTitle);
                        courses.add(replaceIndex + 1, newLessonTitle);

                    }
                } else {
                    String newLessonTitle = lessonTitle + "-Exercise";
                    courses.add(lessonTitle);
                    courses.add(newLessonTitle);
                }


            } else if (action.contains("Swap")) {

                String lessonTitleTwo = Instructions[2];

                if (courses.contains(lessonTitle) && courses.contains(lessonTitleTwo)) {

                    String placeholder = lessonTitle;
                    Integer placeHolderIndex = courses.indexOf(lessonTitle);
                    Integer placeHOlderIndexTwo = courses.indexOf(lessonTitleTwo);
                    courses.set(placeHolderIndex, lessonTitleTwo);
                    courses.set(placeHOlderIndexTwo, lessonTitle);

            }

                if (courses.contains(lessonTitle + "-Exercise")) {
                    Integer getItemToReplace = courses.indexOf(lessonTitle + "-Exercise");
                    courses.remove(lessonTitle + "-Exercise");
                    courses.add((courses.indexOf(lessonTitle) + 1), lessonTitle + "-Exercise");


                } else if (courses.contains(lessonTitleTwo + "-Exercise")) {
                    Integer getItemToReplace = courses.indexOf(lessonTitleTwo + "-Exercise");
                    courses.remove(lessonTitleTwo + "-Exercise");
                    courses.add((courses.indexOf(lessonTitleTwo) + 1), lessonTitleTwo + "-Exercise");

                }
            } else if (action.contains("Insert")) {
                Integer index = Integer.valueOf(Instructions[2]);

             if (!courses.contains(lessonTitle)) {

                 courses.add(index, lessonTitle);
             }

            }

            command = scan.nextLine();
        }

        int counter = 1;
        for(String lesson : courses) {
            System.out.printf("%d.%s\n", counter, lesson);
            counter++;
        }


    }
}