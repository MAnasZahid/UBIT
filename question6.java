import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter First Parallel Side: ");
        double a = read.nextDouble();

        System.out.print("Enter Second Parallel Side: ");
        double b = read.nextDouble();
         
         System.out.print("Enter Height: ");
        double height = read.nextDouble();

     double area = height * (a + b) / 2;
         System.out.println("Area of Trapezium: " + area );

	}
}