package com.skypro;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"Dawson",1000,"Frank","Bob",1);
        Employee emp2 = new Employee(2,"James",600,"David","Rob",1);
        Employee emp3 = new Employee(3,"Faint",1500,"Henry","Michael",1);
        Employee emp4 = new Employee(4,"Straiter",1200,"Steven","Matt",1);
        Employee emp5 = new Employee(8,"Stowns",900,"Wesley","Robert",2);
        Employee emp6 = new Employee(7,"Grafe",700,"Nicky","Ron",2);
        Employee emp7 = new Employee(6,"Vallison",1000,"John","Ricky",2);
        Employee emp8 = new Employee(5,"Maistreem",1800,"Jack","Trevor",2);

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printEmployees();

        employeeBook.addEmployee(emp1);
        employeeBook.addEmployee(emp2);
        employeeBook.addEmployee(emp3);
        employeeBook.addEmployee(emp4);
        employeeBook.addEmployee(emp5);
        employeeBook.addEmployee(emp6);
        employeeBook.addEmployee(emp7);
        employeeBook.addEmployee(emp8);

       // employeeBook.printEmployees();

        System.out.println("employeeBook.totalSalariesForDepartment(1) = " + employeeBook.totalSalariesForDepartment(1));

    }
}

