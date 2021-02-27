
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0) {
                sum += number;
                numbers++;
            } else if (number == 0) {
                if (numbers == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    double average = sum / numbers;
                    System.out.println(average);
                    break;
                }
            }
        }

    }
}
