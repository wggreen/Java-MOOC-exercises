
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        
        int end = Integer.valueOf(scanner.nextLine());
        
        int i = 1;
        
        int sum = 0;
        
        while (i < end + 1) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);

    }
}
