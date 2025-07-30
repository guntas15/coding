import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double input;
        do {
            input = sc.nextDouble();
            total += input;
        } while (input != 0);
        System.out.println("Total sum: " + total);
    }
}
