import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {

      Scanner  read = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = read.nextInt();

    while (n < 0) {
       System.out.print("Please enter a positive number: ");
            n = read.nextInt();}

       for(int i=n;i>=0;i=i-1){
            System.out.println(i);
       }
 
  
    }
}
