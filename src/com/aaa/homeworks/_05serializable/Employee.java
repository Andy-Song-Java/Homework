package com.aaa.homeworks._05serializable;
import java.io.Serializable;
//Problems: Define a “Employee” POJO class and make it serializable
public class Employee implements Serializable {
    private String name;
    private double salary;

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


}

