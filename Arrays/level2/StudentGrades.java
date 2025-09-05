import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];   
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            int p, c, m;
            while (true) {
                System.out.print("Physics: ");
                p = sc.nextInt();
                System.out.print("Chemistry: ");
                c = sc.nextInt();
                System.out.print("Maths: ");
                m = sc.nextInt();
                if (p >= 0 && c >= 0 && m >= 0) break;
                System.out.println("Invalid input. Enter positive marks again.");
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            int total = p + c + m;
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | Percentage: " + percentage[i] +
                    " | Grade: " + grade[i]);
        }
        sc.close();
    }
}