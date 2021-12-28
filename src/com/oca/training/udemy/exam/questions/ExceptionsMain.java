package com.oca.training.udemy.exam.questions;

public class ExceptionsMain {
    public static void main(String[] args) throws Exception {
        if (args.length>1)
        throw new Exception("Failed to Start args:" + args.length);
        int a=0;
        int b=0;
    }

    void test(String[] args) throws Exception{
        if (args.length>1)
            throw new Exception("Failed to Start args:" + args.length);
        else
            System.out.println(5/0);
    }

    int Q4(){
        int a=0;
        int b=0;
        try {
            return a/b;
        } catch (ArithmeticException e){
           return 1;
        } catch (RuntimeException e){
            return -1;
        } catch (Exception e){
            return 0;
        }
         finally {
            System.out.println("done");
        }
    }
}
