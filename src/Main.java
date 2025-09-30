//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner to intake information provided by customer

        // Get user input
        System.out.println("Do not enter any symbols such as $ or % when entering info!!");
        System.out.print("Enter total bill amount ($):");
        double totalBill = input.nextDouble(); //asks for totalBill, stores in variable

        System.out.print("Enter tip percentage: ");
        int tipPercentage = input.nextInt(); //asks for tip percentage, stores in a variable

        System.out.print("Enter number of people in your group: ");
        int numberOfPeople = input.nextInt(); //asks for number of people, stores into a variable

        double tipAmount = totalBill * (tipPercentage / 100.0);   //calculating tip amount
        double totalWithTip = totalBill + tipAmount;                //total with tip
        double tipPerPerson = tipAmount / numberOfPeople;           //tip each person has to pay
        double totalPerPerson = totalWithTip / numberOfPeople;      //total amount each person has to equally pay


        //prints out all information in a clean format
        System.out.println();
        System.out.println("----------Bill----------");
        System.out.println("Total Tip: " +  tipAmount);
        System.out.println("Total Bill (with Tip): " + totalWithTip);
        System.out.println("Tip Per Person: " + tipPerPerson);
        System.out.println("Total Per Person: " + totalPerPerson);
    }
}

