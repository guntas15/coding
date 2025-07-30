import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Calculate average and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage + "%");

        // Determine grade and remarks
        if (percentage >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Very Good");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
            System.out.println("Remarks: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Fair");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Average");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Needs Improvement");
        }
    }
}
