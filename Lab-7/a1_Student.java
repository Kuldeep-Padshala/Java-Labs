import java.util.Scanner;


class Student {
    
    private String id_no;
    private int no_of_subjects_registered;
    private String[] subject_code;
    private int[] subject_credits;
    private String[] grade_obtained;
    private double spi;

    // Constructor to initialize student details
    public Student() {
        this.id_no = "";
        this.no_of_subjects_registered = 0;
        this.subject_code = new String[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new String[no_of_subjects_registered];
        this.spi = 0.0;
    }

    public void inputDetails() {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID No: ");
        this.id_no = sc.nextLine();

        System.out.print("Enter number of subjects registered: ");
        this.no_of_subjects_registered = sc.nextInt();
        sc.nextLine(); // Consume the newline

        this.subject_code = new String[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new String[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            // System.out.println("");
            System.out.println("Enter details for Subject " + (i + 1) + ":");
            System.out.print("Subject Code: ");
            this.subject_code[i] = sc.nextLine();

            System.out.print("Credits: ");
            this.subject_credits[i] = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.print("Grade Obtained (A/B/C/D/E/F): ");
            this.grade_obtained[i] = sc.nextLine();
        }

        calculate_spi();
        // sc.close();
    }

    // Method to calculate SPI
    public void calculate_spi() {
        int totalCredits = 0;
        int totalPoints = 0;
        
        for (int i = 0; i < no_of_subjects_registered; i++) {
            int gradePoints = getGradePoints(grade_obtained[i]);
            totalPoints += gradePoints * subject_credits[i];
            totalCredits += subject_credits[i];
        }
        
        if (totalCredits != 0) {
            this.spi = (double) totalPoints / totalCredits;
        } else {
            this.spi = 0.0;
        }
    }

    // Method to get grade points based on grade obtained
    public int getGradePoints(String grade) {

        return switch (grade.toUpperCase()) {
            case "A" -> 10;
            case "B" -> 8;
            case "C" -> 6;
            case "D" -> 4;
            case "E" -> 2;
            //case "F": return 0;
            default -> 0;
        };

    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID No: " + id_no);
        System.out.println("No of Subjects Registered: " + no_of_subjects_registered);
        System.out.println("Subjects Details:");
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Subject Code: " + subject_code[i] + 
                               ", Credits: " + subject_credits[i] + 
                               ", Grade: " + grade_obtained[i]);
        }
        //To print spi with only 2 decimal digits,
        System.out.println("SPI: " + spi);
        System.out.println("-----------------------------------");
    }

}

public class a1_Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();

        }
        
        
        // Display details for each student
        System.out.println("\n\n----------Student Details---------");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent "+(i+1)+":");
            students[i].displayDetails();
        }
        // fix and remove all the warnings


        sc.close();
    }
}
