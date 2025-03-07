

class MarsWeightCalculator {
    public static void main(String[] args) {
        float earthweight; // Variable to store weight on Earth
        float marsweightakhil; // Variable to store weight on Mars (float type)
        earthweight = 80.0f; // Assigning weight on Earth (in kg)
        marsweightakhil = earthweight * 0.38f; // Calculating weight on Mars (38% of Earth’s weight)
        double marsweightdouble = marsweightakhil;  // Converting float to double
        System.out.printf("Mars weight in double: %.4f\n", marsweightdouble); // Printing Mars weight in double with precision up to 4 decimal places
        int marsWeightInt = (int) marsweightdouble; // Casting double to int (decimal part is shortened)
        char marsWeightChar = (char) marsWeightInt; // Casting int to char (ASCII representation)
        int modifiedWeight = marsWeightChar + 1;
        // Displaying the results
        System.out.println("Earth Weight : " + earthweight);
        System.out.println("Mars Weight : " + marsweightakhil);
        System.out.printf("Mars Weight : %.4f\n", marsweightdouble);
        System.out.println("Mars Weight : " + marsWeightInt);
        System.out.println("Mars Weight (char - ASCII): " + marsWeightChar);
        System.out.println("Modified Char to Int: " + modifiedWeight);


    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello everyone");
        System.out.printf("Hello Vistula!%n");
        System.out.println("Program executed succesfully.");
    }
}
