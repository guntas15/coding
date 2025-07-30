import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Invalid number.");
            return;
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }

        sc.close();
    }
}
