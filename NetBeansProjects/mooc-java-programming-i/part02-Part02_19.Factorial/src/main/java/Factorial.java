
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int i = 1;
        int sum = 1;
        
        while(i < number + 1) {
            sum *= i;
            i++;
        }
        
        System.out.println("Factorial: " + sum);

    }
}
