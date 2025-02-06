 class Students {
    String registrationNumber;
    String name;
    int age;

    public Students(String registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
 class UGStudent extends Students {
     int semester;
     double fees;
    static int ugCount = 0;

    public UGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        ugCount++;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: Rs" + fees);
        System.out.println();
    }

    public static int getUGCount() {
        return ugCount;
    }
}
 class PGStudent extends Students {
    int semester;
    double fees;
    static int pgCount = 0;

    public PGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        pgCount++;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: Rs" + fees);
        System.out.println();
    }

    public static int getPGCount() {
        return pgCount;
    }
}
 public class Student {
    public static void main(String[] args) {
        // Create UG Students
        UGStudent ug1 = new UGStudent("UG123", "Alice Smith", 19, 2, 50000);
        UGStudent ug2 = new UGStudent("UG124", "Bob Brown", 20, 3, 55000);

        // Create PG Students
        PGStudent pg1 = new PGStudent("PG123", "Charlie Davis", 22, 1, 70000);
        PGStudent pg2 = new PGStudent("PG124", "Diana Evans", 23, 2, 75000);

        // Display details of UG students
        System.out.println("UG Students:");
        ug1.displayDetails();
        ug2.displayDetails();

        // Display details of PG students
        System.out.println("PG Students:");
        pg1.displayDetails();
        pg2.displayDetails();

        // Display total number of UG and PG admissions
        System.out.println("Total number of UG admissions: " + UGStudent.getUGCount());
        System.out.println("Total number of PG admissions: " + PGStudent.getPGCount());
    }
}
