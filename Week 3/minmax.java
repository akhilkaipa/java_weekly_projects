import java.util.Random;

public class minmax {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int min = 101, max = 0; // Setting initial values out of the range [1, 100]

        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1; // Random number from 1 to 100
            System.out.println("Random number: " + randomNumber);

            if (randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max) {
                max = randomNumber;
            }
            count++;
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
