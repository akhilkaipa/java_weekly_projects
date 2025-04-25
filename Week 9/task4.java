class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class ValueTooHighException extends Exception {
    public ValueTooHighException(String message) {
        super(message);
    }
}

class ValueTooLowException extends Exception {
    public ValueTooLowException(String message) {
        super(message);
    }
}

class ExceptionThrower {
    public void checkValue(int value) throws InvalidInputException, ValueTooHighException, ValueTooLowException {
        if (value < 0) {
            throw new InvalidInputException("Negative value is not allowed.");
        } else if (value > 100) {
            throw new ValueTooHighException("Value is too high.");
        } else if (value < 10) {
            throw new ValueTooLowException("Value is too low.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();
        int testValue = 150;

        try {
            thrower.checkValue(testValue);
        } catch (InvalidInputException | ValueTooHighException | ValueTooLowException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
