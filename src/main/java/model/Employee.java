package model;
//Query:CREATE TABLE Employee (ID INT PRIMARY KEY,Name VARCHAR(100) NOT NULL,Position VARCHAR(50),Salary DECIMAL(10, 2),Address VARCHAR(255),JoiningDate DATE,Level VARCHAR(20),Association VARCHAR(100));


public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private String address;
    private String joiningDate;
    private String level;
    private String association;


    public Employee(int id, String name, String position, double salary, String address, String joiningDate, String level, String association) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.address = address;
        this.joiningDate = joiningDate;
        this.level = level;
        this.association = association;
    }
    public Employee() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getAssociation() {
        return association;
    }
    public void setAssociation(String association) {
        this.association = association;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Position=" + position +
                ", Salary=" + salary + ", Address=" + address + ", Joining Date=" + joiningDate +
                ", Level=" + level + ", Association=" + association + "]";
    }
}

