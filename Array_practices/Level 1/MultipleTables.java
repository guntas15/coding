import java.util.Scanner;

public class MultipleTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[4];

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            result[i - 6] = num * i;
            System.out.println(num + " * " + i + " = " + result[i - 6]);
        }
    }
}
