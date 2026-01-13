import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter Discounted Price: ");
        double discountedPrice = read.nextDouble();

        System.out.print("Enter discount percentage: ");
        double dp = read.nextDouble();
         
          double originalPrice = discountedPrice / (1 - dp / 100);

       System.out.println("Original Price: " + originalPrice );
     
	}
}