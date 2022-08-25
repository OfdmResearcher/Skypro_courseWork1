package com.skypro;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Johnson", 2, 20000);
        Employee employee2 = new Employee("Frank Lampard", 1, 10000);
        Employee employee3 = new Employee("David Beckham", 5, 30000);
        Employee employee4 = new Employee("Ben Lawson", 2, 20000);
        Employee employee5 = new Employee("Nick Randsom", 3, 30000);
        Employee employee6 = new Employee("Bob Willow", 4, 10000);
        Employee employee7 = new Employee("Mickael Oliver", 5, 5000);
        Employee employee8 = new Employee("David Kasinsky", 2, 40000);
        Employee employee9 = new Employee("Billy Norton", 4, 20000);
        Employee employee10 = new Employee("Steven Spielberg", 1, 45000);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        printAllEmployees();

        System.out.println("The total salary will be: " + calculateAllSalariesPerMonth());
        System.out.println("findEmployeeWithMinSalary() = " + findEmployeeWithMinSalary());
        System.out.println("findEmployeeWithMaxSalary() = " + findEmployeeWithMaxSalary());
        System.out.println("findAverageSalary() = " + findAverageSalary());
        printFullNamesOfEmployees();

        increaseSalary(10);

        printAllEmployees();

        int totalAmountOfHours = 640;
        int hoursPerOneEmployee = 8;
        int numberOfEmployees = totalAmountOfHours / hoursPerOneEmployee;
        System.out.println(numberOfEmployees);

    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateAllSalariesPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static int findAverageSalary() {
        return calculateAllSalariesPerMonth() / employees.length;
    }

    public static void printFullNamesOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + percent / 10);
        }
    }
}

