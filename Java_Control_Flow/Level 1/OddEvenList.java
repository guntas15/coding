import java.util.Scanner;

public class OddEvenList {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
    }
}
