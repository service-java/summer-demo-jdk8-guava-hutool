package _ch1_lab.lab2;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类的构?器
    public Employee(String name) {
        this.name = name;
    }

    // 设置age的??
    public void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的??*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的??*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* 打印信息 */
    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}
