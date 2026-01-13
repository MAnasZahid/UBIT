import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = read.nextDouble();
         double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area: " + area + " m^2");
        System.out.println("Circumference: " + circumference + " m");
       
     
	}
}