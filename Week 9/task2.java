public class Main {

    static class ExceptionHandler {
        public void checkValue(int value) {
            int[] numbers = {10, 20, 30};

            if (value == 0) {
                int result = 10 / value;
            } else if (value > numbers.length - 1) {
                System.out.println(numbers[value]);
            } else {
                System.out.println("Valid access: " + numbers[value]);
            }
        }
    }

    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();

        int testValue = 0;

        try {
            handler.checkValue(testValue);
        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + aioobe.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
