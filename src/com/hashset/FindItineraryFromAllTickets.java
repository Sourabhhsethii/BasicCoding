package com.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Find Itinerary From All Tickets
 * You are supposed to visit different cities for business and are provided all the travel tickets with the source and destination. Now, you need to figure out the itinerary of your visit to different cities from all those tickets.
 *
 * Note:
 *
 * The path covered by the tickets is not circular.
 *
 * Other than the final destination, there is exactly one ticket from every city.
 *
 *
 *
 * Example:
 *
 * You will be given the source and destination of all the tickets in a map as follows:
 *
 * Source  - Destination
 *
 * Mumbai  - Indore
 *
 * Hyderabad  - Warangal
 *
 * Indore  - Hyderabad
 *
 * Delhi  - Mumbai
 * Now, you have to print the itinerary. The itinerary for the given tickets will be as follows:
 *
 * Itinerary:
 *
 * Delhi  -  Mumbai - Indore  - Hyderabad - Warangal

 4
 Mumbai Indore
 Hyderabad Warangal
 Indore Hyderabad
 Delhi Mumbai
 Delhi Mumbai Indore Hyderabad Warangal

 2
 abc def
 abc deg
 *
 *
 * Approach
 * You can print the itinerary from the given source and destination by following the instructions given below.
 *
 * Get the starting point of the itinerary.
 *
 * After that, print the itinerary by traversing through the map.
 */
public class FindItineraryFromAllTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        // write your code here
        Map<String, String> reverseTickets = new HashMap<String, String>();

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
                    System.out.print(temp + " ");
                    temp = tickets.get(temp);
                }
            }
        }

    }
}
