package lt.vcd;

public class Task1 {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        int intArea = calculateArea(5, 4);
        double doubleArea = calculateArea(5.5, 4.2);

        System.out.println("Area (int): " + intArea);
        System.out.println("Area (double): " + doubleArea);
    }
}