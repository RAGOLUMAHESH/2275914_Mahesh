package com.assignment.mahesh;

class Employee {
    double salary;
    int workHoursPerDay;

    public void getInfo(double salary, int workHoursPerDay) {
        this.salary = salary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void addSal() {
        if (salary < 1500.3) {
            salary += 1000;
        }
    }

    public void addWork() {
        if (workHoursPerDay > 6) {
            salary += 500;
        }
    }

    public void printFinalSalary() {
        System.out.println("Final Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getInfo(1200, 8); // Example salary and work hours
        emp.addSal();
        emp.addWork();
        emp.printFinalSalary();
    }
}
