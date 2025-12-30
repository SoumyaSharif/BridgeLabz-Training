import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {
            "Aman", "Riya", "Rahul", "Sneha", "Karan",
            "Pooja", "Arjun", "Neha", "Vikas", "Anjali"
        };

        int presentCount = 0;
        int absentCount = 0;

        // for-each loop for attendance
        for (String name : students) {
            System.out.print(name + " (Present/Absent): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        System.out.println("\nTotal Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);
    }
}
