import java.util.Scanner;

public class question8{
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter Side A:");
        double a = read.nextDouble();

       System.out.print("Enter Side B: ");
        double b = read.nextDouble();
         
         System.out.print("Enter Side C: ");
        double c= read.nextDouble();

         double s = (a + b + c) / 2;
         double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

         System.out.println("Area of Triangle: " + area );
     
	}
}