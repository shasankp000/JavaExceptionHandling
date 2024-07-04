/*
* 1. try and catch Blocks
* The try block contains the code that might throw an exception, and the catch block handles the exception if one is thrown.
* */

public class TryCatch {

    public static void main(String[] args) {

        try {

            int div = 10/0; // will raise an exception

        }
        catch (ArithmeticException exception) {

            System.out.println("Arithmetic exception caught: " + exception.getMessage());

        }

    }

}
