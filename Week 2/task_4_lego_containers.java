public class LegoContainers {
    public static void main(String[] args) {
        int amountOfBricks = 77;  // Number of Lego bricks (odd number)
        int containerCapacity = 8; // Each container can hold 6 bricks (even number)

        int fullContainers = amountOfBricks / containerCapacity;
        int totalContainers = (amountOfBricks % containerCapacity == 0) ? fullContainers : fullContainers + 1;
        int remainingBricks = amountOfBricks % containerCapacity;

        System.out.println("Total bricks: " + amountOfBricks);
        System.out.println("Each container can hold: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Total containers needed (including partial ones): " + totalContainers);
        System.out.println("Bricks in the last (partial) container: " + remainingBricks);
    }
}
