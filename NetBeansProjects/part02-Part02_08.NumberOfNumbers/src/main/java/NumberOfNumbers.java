
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        System.out.println("Give a number: ");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else {
                count = count + 1;
                System.out.println("Give a number: ");
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
