package com.upgrad.coupling.lososely.codeforInterfaces;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();

        GreetingService greetingService = greetingServiceFactory.getGreetingService("english");
        greetingService.greet("Sourabh");

    }
}
