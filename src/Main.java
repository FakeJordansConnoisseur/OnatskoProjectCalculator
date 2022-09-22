import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Welcome to the tip calculator!");
        double totalCost = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group?: ");
        int peopleCount = scan.nextInt();
        System.out.println("");

        System.out.print("What is the tip percentage?(0-100): ");
        double tip = scan.nextDouble();

        System.out.print("Enter the cost of an item in dollars and cents, entering -1 will end the list: ");
        double number = scan.nextDouble();

        while (number != -1) {
            totalCost += number;
            System.out.print("Enter the cost of an item in dollars and cents, entering -1 will end the list: ");
            number = scan.nextDouble();
        }
        System.out.println("The total bill before tips is:"+totalCost);
        System.out.println("The tip percentage is:"+tip+"%.");

        String tipAmount = formatter.format(((((tip/100)+1)*totalCost)-totalCost));
        System.out.println("The tip you will pay is:"+tipAmount);

        String actualCost = formatter.format((((tip/100)+1)*totalCost));
        System.out.println("The total you will pay is:"+actualCost);

        System.out.println("The bill before tips per person is:"+(totalCost/peopleCount));

        String tipAmountPer = formatter.format((((((tip/100)+1)*totalCost)-totalCost))/peopleCount);
        System.out.println("The tip each person will pay is:"+tipAmountPer);

        String actualCostPer = formatter.format((((tip/100)+1)*totalCost)/peopleCount);
        System.out.println("The total each person will pay is:"+actualCostPer);


    }
}
