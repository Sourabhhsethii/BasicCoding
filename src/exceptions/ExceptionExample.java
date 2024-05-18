package exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        int number = 0;
        try{
            number  = 1/0;
        } catch (Exception e){
            throw new RuntimeException("Test");
        } finally {
        }
        System.out.println(number);
    }
}
