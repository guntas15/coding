import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            if (input <= 0) break;

            nums[index++] = input;
        }

        for (int i = 0; i < index; i++) {
            total += nums[i];
            System.out.println("Number " + (i + 1) + ": " + nums[i]);
        }

        System.out.println("Sum = " + total);
    }
}
