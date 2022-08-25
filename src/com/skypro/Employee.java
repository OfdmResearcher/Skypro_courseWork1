package com.skypro;

public class Employee {

    private final String fullName;
    private int unit; // from 1 to 5
    private int salary;
    private static int counter;
    private int id = counter;

    public Employee(String fullName, int unit, int salary) {
        this.fullName = fullName;
        this.unit = unit;
        this.salary = salary;
        counter++;
    }



    public String getFullName() {
        return fullName;
    }

    public int getUnit() {
        return unit;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", unit=" + unit +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
