package com.assingments.stackqueue;

import java.util.*;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     * 
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     * 
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     * 
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     * 
     * @param an
     *            int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class PartB {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();



    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {

        List<SiteStats> tempArray = new ArrayList<>();
        if(!sites.isEmpty()) {

            while (!sites.isEmpty()) {
                tempArray.add(sites.remove());
            }

            tempArray.sort((a, b) -> Integer.compare(b.getNumVisits(), a.getNumVisits()));

            if(n < tempArray.size()){
               for (int i=0;i<n;i++){
                   System.out.println(tempArray.get(i));
               }
            }
        }

    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        SiteStats temp = new SiteStats(url,1);
        ArrayList<SiteStats> tempArray = new ArrayList<>();

        if(!sites.isEmpty()) {

            while (!sites.isEmpty()) {
                tempArray.add(sites.remove());
            }
                boolean found = false;
            for (int i = 0; i < tempArray.size(); i++) {

                if(tempArray.get(i).getUrl() == url ){
                    found = true;
                    int visit = tempArray.get(i).getNumVisits();
                    visit += 1;
                    tempArray.get(i).setNumVisits(visit);
                }
            }

            if(found == false){
                tempArray.add(temp);
            }

            for (int i = 0; i < tempArray.size(); i++) {
                sites.add(tempArray.get(i));
            }

        } else {
            sites.add(temp);
        }

    }

    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);

    }

}
