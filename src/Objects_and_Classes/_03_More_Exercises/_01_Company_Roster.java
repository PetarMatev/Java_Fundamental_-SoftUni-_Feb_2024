package Objects_and_Classes._03_More_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Company_Roster {

    public static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        @Override
        public String toString() {
            return String.format("%s" + " " + "%.2f" + " " + "%s" + " " + "%d", name, salary, email, age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Department {
        String department;
        double total;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return department + " " + total;
        }
    }

    public static void printHighestAvrgDepartment(String department) {
        System.out.printf("Highest Average Salary: %s\n", department);
    }

    public static void printEmployeesDepartHighestSalary(List<Employee> sortedEmployeeBySalary, String department) {
        StringBuilder employeeString = new StringBuilder();
        for (Employee employee : sortedEmployeeBySalary) {
            if (employee.getDepartment().equals(department)) {
                employeeString.append(employee).append("\n");
            }
        }
        System.out.println(employeeString.toString());
    }

    public static void addDepartmentIfEmpty(List<Department> departments, String departmentName, double salary) {
        if (departments.isEmpty()) {
            Department newDepartment = new Department();
            newDepartment.setDepartment(departmentName);
            newDepartment.setTotal(salary);
            departments.add(newDepartment);
        }
    }

    public static void addNewDepartment(List<Department> departments, String department, double Salary) {
        Department newDepartment = new Department();
        newDepartment.setDepartment(department);
        newDepartment.setTotal(Salary);
        departments.add(newDepartment);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        List<Employee> employees = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] command = scan.nextLine().split(" ");
            String name = command[0];
            double salary = Double.parseDouble(command[1]);
            String position = command[2];
            String department = command[3];
            String email = "n/a";
            int age = -1;

            if (command.length == 5) {
                if (command[4].contains("@")) {
                    email = command[4];
                } else {
                    age = Integer.parseInt(command[4]);
                }
            }

            if (command.length == 6) {
                email = command[4];
                age = Integer.parseInt(command[5]);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);
            employees.add(employee);
            Department depart = new Department();

            int departmentsSize = departments.size();
            addDepartmentIfEmpty(departments, department, salary);

            boolean departmentDoesNotExist = true;
            if (departmentsSize >= 1) {
                for (Department departs : departments) {
                    if (departs.getDepartment().equals(department)) {
                        departs.setTotal(departs.getTotal() + salary);
                        departmentDoesNotExist = false;
                        break;
                    }
                }
            }

            if (departmentDoesNotExist && departmentsSize >= 1) {
                addNewDepartment(departments, department, salary);
            }
        }

        List<Department> sortedDepartments = departments.stream()
                .sorted(Comparator.comparingDouble(Department::getTotal)
                        .reversed())
                .collect(Collectors.toList());


        List<Employee> sortedEmployeeBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .collect(Collectors.toList());


        String HighestAvrgPaidDepartment = sortedDepartments.get(0).getDepartment();
        printHighestAvrgDepartment(HighestAvrgPaidDepartment);
        printEmployeesDepartHighestSalary(sortedEmployeeBySalary, HighestAvrgPaidDepartment);
    }
}

