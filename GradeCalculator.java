import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // take user input 
        
        System.out.print(" Enter No. of Subjects : "); // No. of Subject
        int numbersubject = sc.nextInt();

        
        int totalmarks = 0;
        System.out.println("Enter the marks for each subject out of 100 ");
        for(int i = 1 ;i <= numbersubject ; i++) {
            System.out.print("Subject " + i + " : ");
            int marks = sc.nextInt(); // marks from the user
            totalmarks += marks;
        }
        System.out.println("Totalmarks : " + totalmarks);
        
        // Calculate Average Percentage
        double averagepercentage = (double) totalmarks/numbersubject;

        // Grade According to their Percentage
        char Grade;
        if (averagepercentage >= 90 ) {
            Grade = 'A';
        }
        else if (averagepercentage >= 80) {
            Grade = 'B';
        }
        else if (averagepercentage >= 70) {
            Grade = 'C';
        }
        else if (averagepercentage >= 60) {
            Grade = 'D';
        }
        else if (averagepercentage > 50) {
            Grade = 'E';
        }
        else {
            Grade = 'F';
        }
         
        // Display the Result
        System.out.println("Percentage : " + averagepercentage);
        System.out.println("Grade : " + Grade);
        sc.close();
    }
}