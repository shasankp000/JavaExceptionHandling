/*
* 3. throw Statement
* The throw statement is used to explicitly throw an exception.
* */

public class Throw {

    public static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        else {
            System.out.println("Age is valid");
        }

    }

    public static void main(String[] args) {

        try {
            checkAge(15);
            checkAge(18); // this line won't be executed as execution stops when an exception is raised.
        }
        catch (Exception e) {

            // We use Exception keyword to catch any unknown exceptions which may arise.

            System.out.println("Caught exception: " + e.getMessage());
        }

    }

}
