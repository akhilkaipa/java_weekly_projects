public class reversearray {
    public static void main(String[] args) {

        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }


        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
