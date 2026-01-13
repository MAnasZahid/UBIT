import java.util.Scanner;

public class question7{
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = read.nextInt();

if (n % 2  == 0)
            System.out.print("Entered Number is Even");
        else
            System.out.print("Entered Number is Odd");
	}
}