package org.example.demo.model;

public class Employee implements Comparable{

    private int employeeId;
    private String employeeName;
    private int salary;

    public Employee() {
        super();
    }

    public Employee(int employeeId, String employeeName, int salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if(this.getSalary() > employee.getSalary()) {
            return -1;
        }
        else if(this.getSalary() < employee.getSalary()) {
            return 1;
        }
        else
            return 0;
    }
}
