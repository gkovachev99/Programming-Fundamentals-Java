package Labs;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//check
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0.0;
        int days = 0;
        int capsuleCount = 0;
        double sum = 0.0;
        double cost = 0.0;

        for (int i = 1; i <= orders; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsuleCount = Integer.parseInt(scanner.nextLine());
            cost=days*pricePerCapsule*capsuleCount;
            sum+=cost;
            System.out.printf("The price for the coffee is: $%.2f%n",cost);

        }
        System.out.printf("Total: $%.2f",sum);


    }
}
