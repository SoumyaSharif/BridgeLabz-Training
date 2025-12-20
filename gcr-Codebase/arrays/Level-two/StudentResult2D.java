import java.util.Scanner;

public class StudentResult2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // a–b. 2D array for marks
        double[][] studentMarks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            studentMarks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            studentMarks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            studentMarks[i][2] = sc.nextDouble();

            if (studentMarks[i][0] < 0 || studentMarks[i][1] < 0 || studentMarks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values.");
                i--;
            }
        }

        // b. Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            double total = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 40) {
                grade[i] = "D";
            } else {
                grade[i] = "Fail";
            }
        }

        // Display result
        System.out.println("\n----- STUDENT RESULT -----");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + studentMarks[i][0]);
            System.out.println("Chemistry: " + studentMarks[i][1]);
            System.out.println("Maths: " + studentMarks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
