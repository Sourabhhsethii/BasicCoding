package com.oca.training.udemy.classes.encapsulation;

public class DataEncapsulation {

    public static void main(String[] args) {
        Company company = new Company();

        company.setName("MyCompany");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);



    /*  company.name = "MYCompany";
        company.employees.add("John");
        company.employees.add("Anthony");*/

        company.printSorted();

        /*  company.name = null;
        company.printSorted();*/

    /*    company.employees = null;*/

       // company.employees.add("Jimmy");
        company.printSorted();
    }
}
