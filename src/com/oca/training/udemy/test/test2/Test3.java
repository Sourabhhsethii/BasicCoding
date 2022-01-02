package com.oca.training.udemy.test.test2;

class A{}
class B extends A{}

public class Test3 {
    public String name;
    public void Test() { // This not a constructor
        this.name = "James";
    }

    private static void m1() throws Exception {

        Test3 obj = new Test3();
        System.out.println(obj.name);

        B a = (B) new A();
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {

        } finally {
            System.out.println("A");
        }
    }
}
