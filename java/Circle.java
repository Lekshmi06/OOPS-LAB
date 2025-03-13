import java.util.Scanner;

public class Circle {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
      
        double pi = Math.PI;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        
        
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
        
        scanner.close();
    }
}


