import java.util.Random;
public class Main
{
            public static void main(String[] args) {
                Random random = new Random(); // Creates an instance of Random class
                int number = random.nextInt(100) + 1; // Generates a random number between 1 and 100
                System.out.println("Generated number: " + number); // Prints the generated number

                if (number % 2 == 0) { // Checks if the number is divisible by 2
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            }
        }
        