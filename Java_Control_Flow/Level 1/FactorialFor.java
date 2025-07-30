import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}
