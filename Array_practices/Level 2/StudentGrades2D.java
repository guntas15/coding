import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextInt();  // Physics
            marks[i][1] = sc.nextInt();  // Chemistry
            marks[i][2] = sc.nextInt();  // Math

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] + ", %: " + percent[i] + ", Grade: " + grade[i]);
        }
    }
}
