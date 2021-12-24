package com.oca.training.udemy.classes.encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO = Plain Old Java Object
public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted(){
        System.out.println("company name= " +  name);
        Collections.sort(employees);
        System.out.println("sorted= " + employees);
    }

    public void  setName(String name){

        if(name == null ){
            System.out.println("name cann not be null");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void addEmployee(String name){
        if(name == null){
            System.out.println("cant add null employee");
        } else
        {
            employees.add(name);
        }
    }
}
