
public class Main {

    public static void main(String[] args) {

        Course java = new Course("Java Programming", 40);
        Course networking = new Course("Networking", 30);
        Course database = new Course("Database Systems", 50);

        java.displayStatistics();
        networking.displayStatistics();
        database.displayStatistics();

        System.out.println("\nPass percentages:");

        java.calculatePassPercentage(35);
        networking.calculatePassPercentage(24);
        database.calculatePassPercentage(45);

        System.out.println("\nUniversity-wide statistics:");

        System.out.println("Total registered students: "
                + Course.totalStudents);
    }
}
