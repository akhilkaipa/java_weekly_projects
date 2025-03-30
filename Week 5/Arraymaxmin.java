import java.util.Random;

public class Arraymaxmin {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }


        int min = numbers[0];
        int max = numbers[0];


        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }


        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        System.out.println("\nSmallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
