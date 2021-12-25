package com.upgrad.coupling.lososely.codeforInterfaces;

public class GreetingServiceFactory {

    public GreetingService getGreetingService(String language){
        if(language.equals("english")){
            return new EnglishGreetingService();
        } else if(language.equals("french")){
            return new EnglishGreetingService();
        } else {
            throw new RuntimeException("No greeting service exist for" + language + "launguage." );
        }
    }
}
