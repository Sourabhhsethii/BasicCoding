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

        System.out.println(calculate());

    }

    public static String calculate(){
        String result = "";
        String str = null;

        try{
            try{
                result += "start ";
                str.length();
            } catch (NullPointerException e){
                result += " npe";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        }catch (Exception e){
            result += " finished";
        }

        return result;
    }

    public static void visitMusem() {

        boolean b = Math.random() < 0.5;

        if(b){
            throw new MuseumClosed();
        }
        throw new MuseumClosedForLunch();
    }
}

