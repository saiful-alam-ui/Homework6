package lt.vcd;

public class Task3 {

    public static int sumOfDigits(int x) {
        // Base case: when x is reduced to 0, stop recursion
        if (x == 0) {
            return 0;
        }
        // Recursive step: last digit + sum of remaining digits
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main(String[] args) {
        int result = sumOfDigits(1342);
        System.out.println("Sum of digits: " + result); // Output: 10
    }
}