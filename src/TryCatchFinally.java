/*
* 2. finally Block
* The "finally" block contains code that will always be executed, whether an exception is thrown or not.
*
* */


public class TryCatchFinally {

    public static void main(String[] args) {

        try {

            // define an array

            int[] numbers = {1, 2, 3};

            System.out.println(numbers[3]); // this will raise an ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Caught exception: " + exception.getMessage());

        }
        finally {

            System.out.println("This block will always be executed.");
        }

    }

}
