import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
	
        Scanner  read = new Scanner(System.in);
        System.out.print("Enter Voltage: ");
        double Voltage = read.nextDouble();

        System.out.print("Enter current (ampere): ");
        double current = read.nextDouble();
         
          double p = Voltage * current;

       System.out.println("Power (watt) : " + p );
     
	}
}