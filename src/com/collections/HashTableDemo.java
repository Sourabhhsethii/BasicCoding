package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) {
        show();
        var c1  = new Customer("a", "e1");
        var c2  = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);
        var unknown  = new Customer("unknown", "e12");
        System.out.println(map.getOrDefault("e10",unknown));
        System.out.println(map.containsKey("e12"));
        map.replace("e1", unknown);
        System.out.println(map);

        // Cant Iterate Over Map
        // To Iterate Over Map we need to use 3 Methods -> keyset, entryset or values.

    }


public static void show(){
    List<Customer> customers = new ArrayList<>();
    // O(n) -> n is number of items in the list.
    for(var customer: customers){
        if(customer.getEmail() == "e1"){
            System.out.println("Found!");
        }
    }

    // HashTable O(1)
}

}
