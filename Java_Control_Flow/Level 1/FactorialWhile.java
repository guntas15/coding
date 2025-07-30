import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}
