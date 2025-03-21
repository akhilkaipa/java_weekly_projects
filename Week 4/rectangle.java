import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}
