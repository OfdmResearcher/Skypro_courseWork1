package com.skypro;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeBook {

    private final Map<String, Employee> employees;

    public EmployeeBook() {
        this.employees = new HashMap<>();
    }

    private String getKey(Employee employee) {
        return employee.getName() + " "
                + employee.getSurname() + " "
                + employee.getPatronymicName();
    }

    public void addEmployee(Employee employee) {
        employees.put(getKey(employee), employee);
//        for (int i = 0; i < employees.length; i++) {
//            if (Objects.isNull(employees[i])) {
//                employees[i] = employee;
//                break;
//            }
//        }
    }

    public void addEmployee(int id,
                            String name,
                            String surname,
                            String patronymicName,
                            double salary,
                            int department) {
        addEmployee(new Employee(id, surname, salary, patronymicName, name, department));

    }

    public void removeEmployee(Employee employee) {
        employees.remove(getKey(employee));
//        for (int i = 0; i < employees.length; i++) {
//            if (Objects.equals(employees[i],employee)) {
//                employees[i] = null;
//            }
//        }
    }

    public void removeEmployee(int id) {
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getId() == id) {
                employees.remove(entry.getKey());
                break;
            }
        }
        //        for (int i = 0; i < employees.length; i++) {
//            if (Objects.nonNull(employees[i]) && employees[i].getId() == id) {
//                employees[i] = null;
//            }
//        }

    }

    public void changeSalary(Employee employee, double newSalary) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newSalary);
        }
//        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
//            if (entry.getValue().equals(employee)) {
//                entry.getValue().setSalary(newSalary);
//                break;
//            }
//        }
//        for (Employee emp : employees) {
//            if (emp.equals(employee)) {
//                emp.setSalary(newSalary);
//            }
//        }
    }

    public void changeDepartment(Employee employee, int newDepartment) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setDepartment(newDepartment);
        }
    }

    public void printEmployeesByDepartment() {
        for (int department = 1; department <= 5; department++) {
            System.out.println("Department " + department + ":");
            for (Map.Entry<String,Employee> entry: employees.entrySet()) {
                if (entry.getValue().getDepartment() == department) {
                    System.out.println(entry.getValue().toString());
                }
            }
        }
//        for (int department = 1; department <= 5; department++) {
//            System.out.println("Department " + department + ":");
//            for (Employee emp : employees) {
//                if (Objects.nonNull(emp) && emp.getDepartment() == department) {
//                    emp.toString();
//                }
//            }
//        }
    }

    public void printEmployeesWithSalaryLessThan(double bound) {
        System.out.println("The employees with the salary less than " + bound + ": ");
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(emp) && emp.getSalary() < bound) {
                System.out.println(emp);
            }
        }
    }

    public void printEmployeesWithSalaryGreaterOrEqualThan(double bound) {
        System.out.println("The employees with the salary less than " + bound + ": ");
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(emp) && emp.getSalary() >= bound) {
                System.out.println(emp);
            }
        }
    }

    public void indexSalary(double index) {
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee)) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
            }
        }
    }

    public void indexSalariesForDepartment(double index, int department) {
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
            }
        }
    }

    public double averageSalary() {
        return totalSalaries() / employees.size();
    }

    public double totalSalariesForDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double totalSalaries() {
        double sum = 0;
        for (Employee employee : employees.values()) {
                sum += employee.getSalary();
        }
        return sum;
    }

    public double averageSalaryForDepartment(int department) {
        double totalSum = 0;
        int count = 0;
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                totalSum += employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : totalSum / count;
    }

    public Employee findEmployeeWithMinSalaryFromDepartment(int department) {
        double minSalary = Double.MAX_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == department && entry.getValue().getSalary() < minSalary) {
                minSalary = entry.getValue().getSalary();
                key = entry.getKey();
            }
        }
        if (key != null) {
            return employees.get(key);
        } else {
            throw new RuntimeException("There is no any employees at this department");
        }
    }

    public Employee findEmployeeWithMinSalary() {
        double minSalary = Double.MAX_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() < minSalary) {
                minSalary = entry.getValue().getSalary();
                key = entry.getKey();
            }
        }
        if (key != null) {
            return employees.get(key);
        } else {
            throw new RuntimeException("There is no any employees at this department");
        }
    }

    public Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        double maxSalary = Double.MIN_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == department && entry.getValue().getSalary() > maxSalary) {
                maxSalary = entry.getValue().getSalary();
                key = entry.getKey();
            }
        }
        if (key != null) {
            return employees.get(key);
        } else {
            throw new RuntimeException("There is no any employees at this department");
        }
    }

    public Employee findEmployeeWithMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() > maxSalary) {
                maxSalary = entry.getValue().getSalary();
                key = entry.getKey();
            }
        }
        if (key != null) {
            return employees.get(key);
        } else {
            throw new RuntimeException("There is no any employees at this department");
        }
    }

    public void printFullNameEmployees() {
        for (String fullName : employees.keySet()) {
            System.out.println(fullName);
        }
    }

    public void printEmployees() {
        for (Employee employee: employees.values()) {
            System.out.println(employee);
        }
    }

}

