package Maps_Lambda_Stream_API.Exercise;

import java.util.*;

public class _05_Courses {

    public static class Course {
        private String course;
        private List<String> students;

        public Course(String course) {
            this.course = course;
            this.students = new ArrayList<>();
        }

        public String getCourse() {
            return course;
        }

        public List<String> getStudents() {
            return students;
        }

        public void addStudent(String student) {
            students.add(student);
        }

        public int getCourseSize() {
            return getStudents().size();
        }
    }

    public static void addCourseIfCourseDoesNotExist(LinkedHashMap<String, Course> courses, String courseName) {
        courses.putIfAbsent(courseName, new Course(courseName));
    }

    public static void addNewStudentToExistingCourse(LinkedHashMap<String, Course> courses, String courseName, String student) {
        Course course = courses.get(courseName);
        course.addStudent(student);
    }

    public static void printFinalResult(LinkedHashMap<String, Course> courses) {
        for (Course course : courses.values()) {
            System.out.printf("%s: %d\n", course.getCourse(), course.getCourseSize());
            for (String student : course.getStudents()) {
                System.out.printf("-- %s\n", student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Course> courses = new LinkedHashMap<>();
        String command = scan.nextLine();
        while (!command.equals("end")) {
            String course = command.split(" : ")[0];
            String student = command.split(" : ")[1];
            addCourseIfCourseDoesNotExist(courses, course);
            addNewStudentToExistingCourse(courses, course, student);
            command = scan.nextLine();
        }

        printFinalResult(courses);
    }
}
