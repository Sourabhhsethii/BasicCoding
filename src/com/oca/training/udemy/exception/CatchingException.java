package com.oca.training.udemy.exception;

class MuseumClosed extends RuntimeException {

        }

        class MuseumClosedForLunch extends MuseumClosed {

        }

public class CatchingException {
    public static void main(String[] args) {

        try{
            visitMusem();
        } /*catch (RuntimeException e){
            System.out.println("Runtime");
        }*/
        catch (MuseumClosedForLunch mc){
            System.out.println("Closed for lunch coma back in 2 mins");
        } catch (MuseumClosed mc){
            System.out.println("closed");
        }

    }

    public static void visitMusem() {

        boolean b = Math.random() < 0.5;

        if(b){
            throw new MuseumClosed();
        }
        throw new MuseumClosedForLunch();
    }
}

