package com.oca.training.udemy.test.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}

public class Test13 {
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));

        process(list, e -> e.getAge() > 20);

        Short var = 10;

        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }


        {
            System.out.println(args[1]);
        }

        String [] arr = new String[7];
        System.out.println(arr);

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(27);
        list2.add(27);

        list2.add(new Integer(27));
        list2.add(new Integer(27));

        System.out.println(list2.get(0) == list2.get(2));
        System.out.println(list2.get(1) == list2.get(3));

        System.out.println(args.length);

        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("false");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);

    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            Employee e = iterator.next();
            if(predicate.test(e))
                System.out.print(e + " ");
        }
    }
}