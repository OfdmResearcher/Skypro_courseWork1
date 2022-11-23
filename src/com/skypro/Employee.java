package com.skypro;

import java.util.Objects;

public class Employee {

    private final int id;
    private final String name;
    private final String surname;
    private final String patronymicName;
    private double salary;
    private int department;

    public Employee(int id, String surname, double salary, String patronymicName, String name, int department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    //    private int unit; // from 1 to 5
//    private int salary;
//    private static int counter;
//    private int id = counter;
//
//    public Employee(String fullName, int unit, int salary) {
//        this.fullName = fullName;
//        this.unit = unit;
//        this.salary = salary;
//        counter++;
//    }
//
//
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public int getUnit() {
//        return unit;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setUnit(int unit) {
//        this.unit = unit;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "fullName='" + fullName + '\'' +
//                ", unit=" + unit +
//                ", salary=" + salary +
//                ", id=" + id +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymicName, employee.patronymicName) && Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymicName, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                '}';
    }
}
