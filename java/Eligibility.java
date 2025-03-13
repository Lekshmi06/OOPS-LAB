import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter marks in Mathematics: ");
        int math = scanner.nextInt();
        
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        
        
        int totalMarks = math + physics + chemistry;
        int totalMathPhysics = math + physics;

        
        if (totalMarks > 150 && totalMathPhysics > 100) {
            System.out.println("The student is ELIGIBLE.");
        } else {
            System.out.println("The student is NOT ELIGIBLE.");
        }
        
        scanner.close();
    }

}
