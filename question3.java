import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double op = read.nextDouble();

        System.out.print("Enter discount percentage: ");
        double dp = read.nextDouble();
         
         double discountedPrice = op - (op * dp / 100);

       System.out.println("Discounted Price: " + discountedPrice );
     
	}
}