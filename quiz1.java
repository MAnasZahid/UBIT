import java.util.Scanner;
public class quiz1 {
    public static void main(String[] args) {
	
         Scanner  read = new Scanner(System.in);
        System.out.print("enter the population ");
        int population = read.nextInt();
       int total = 0;   
        int a = 0;  
        
        while(population>=0) {
            total = total + population;
         System.out.print("enter the population ");
        population = read.nextInt();	
        a=a+1;

        }
        int average= total / a;
        System.out.println("Average population: " + average);
	}
}
