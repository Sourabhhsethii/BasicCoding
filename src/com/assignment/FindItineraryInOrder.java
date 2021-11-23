package com.assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given a list of tickets in pairs as source city and destination city, find the itinerary in order using the given list.
 *
 * Find Itinerary in Order
 * Description
 * Given a list of tickets in pairs as source city and destination city, find the itinerary in order using the given list.
 *
 * Note that the given list of tickets is non-cyclic and there is one ticket from each city except the destination city.
 *
 *
 *
 *
 *
 * Input Format:
 *
 * The first line contains an integer N representing the number of tickets.
 *
 * For the next N lines, each line contains a ticket representing the source city and the destination city.
 *
 *
 *
 * Output Format:
 *
 * Print ‘Invalid Input’ if the start city is null, else print city in an itinerary in order, a pair in each line as shown below:
 *
 * Bangalore->Ranchi
 *
 * Ranchi->Jamshedpur
 *
 *
 *
 *
 *
 * Sample Test Cases:
 *
 * Input:
 *
 * 4
 *
 * Bangalore Ranchi
 *
 * Jamshedpur Kolkata
 *
 * Ranchi Jamshedpur
 *
 * Kolkata Varanasi
 *
 *
 *
 * Output:
 *
 * Bangalore->Ranchi
 *
 * Ranchi->Jamshedpur
 *
 * Jamshedpur->Kolkata
 *
 * Kolkata->Varanasi
 *
 *
 *
 *
 *
 * Input:
 *
 * 4
 *
 * Chennai Bangalore
 *
 * Bombay Delhi
 *
 * Goa Chennai
 *
 * Delhi Goa
 *
 *
 *
 * Output:
 *
 * Bombay->Delhi
 *
 * Delhi->Goa
 *
 * Goa->Chennai
 *
 * Chennai->Bangalore
 */
public class FindItineraryInOrder {
    public static void findItinerary(Map<String, String> tickets) {
        // write your code here
        Map<String, String> reverseTickets = new HashMap<String, String>();
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();

        for (Map.Entry<String,String> entry : tickets.entrySet()){
            reverseTickets.put(entry.getValue(), entry.getKey());
        }

        String startKey = "";
        for (Map.Entry<String,String> entry : tickets.entrySet()){
            if(!reverseTickets.containsKey(entry.getKey())){
                startKey = entry.getKey();
            }
        }

        if(startKey == null || startKey == ""){
            System.out.println("Invalid");
        } else {

            String temp = startKey;
            for (int i = 0; i < tickets.size(); i++) {
                while (temp != null) {
                    if(tickets.get(temp)!= null){
                        result.put(temp,tickets.get(temp));
                    }
                    temp = tickets.get(temp);
                }
            }
        }

        for (Map.Entry<String,String> mp: result.entrySet()){
            System.out.println(mp.getKey()+ "->"+ mp.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
    }
}
