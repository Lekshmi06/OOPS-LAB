import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the job role (Manager/Developer/Intern): ");
        String role = scanner.nextLine().trim().toLowerCase();

       
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        double baseSalary = 0;
        double bonusPercentage = 0;

        
        switch (role) {
            case "manager":
                baseSalary = 50000;
                break;
            case "developer":
                baseSalary = 30000;
                break;
            case "intern":
                baseSalary = 15000;
                break;
            default:
                System.out.println("Invalid job role entered.");
                
        }

        
        if (experience >= 3 && experience <= 5) {
            bonusPercentage = 0.10;  
        } else if (experience > 5) {
            bonusPercentage = 0.20;  
        }

      
        double bonusAmount = baseSalary * bonusPercentage;
        double totalSalary = baseSalary + bonusAmount;

        
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + bonusAmount);
        System.out.println("Total Salary: ₹" + totalSalary);

        scanner.close();
    }
}

