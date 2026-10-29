
public class Course {

    // Instance variables
    String courseName;
    int studentsRegistered;

    // Static variable
    static int totalStudents = 0;

    public Course(String courseName, int studentsRegistered) {
        this.courseName = courseName;
        this.studentsRegistered = studentsRegistered;

        totalStudents += studentsRegistered;
    }

    public void displayStatistics() {

        // Local variable
        double averageAttendance = studentsRegistered / 2.0;

        System.out.println("Course: " + courseName);
        System.out.println("Registered: " + studentsRegistered);
        System.out.println("Average attendance: " + averageAttendance);
    }

    public void calculatePassPercentage(int passed) {

        // Local variable
        double percentage = (passed * 100.0) / studentsRegistered;

        System.out.println("Pass percentage: " + percentage + "%");
    }

    public static void displayUniversityTotal() {
        System.out.println("Total university enrolment: "
                + totalStudents);
    }
}
