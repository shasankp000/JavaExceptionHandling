/*
* 5. Custom Exceptions
* You can create your own exception classes by extending the Exception class.
* */
public class CustomException {

    public static class InvalidAgeException extends Exception {

        public InvalidAgeException(String message) {

            super(message);

        }

    }

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException("Age must be equal to 18 or older");
        }

        else {

            System.out.println("Age is valid");
        }

    }


    public static void main(String[] args) {

        try {

            checkAge(15);
        }
        catch (InvalidAgeException exception) {

            System.out.println("Caught InvalidAgeException: " + exception.getMessage());
        }
        finally {
            System.out.println("Try to input an age which is equal to 18 or older.");
        }
    }

}
