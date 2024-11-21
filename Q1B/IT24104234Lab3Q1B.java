import java.util.Scanner;

public class IT24104234Lab3Q1B {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the total bill amount: ");
double totalBill = scanner.nextDouble();

        
double discount = totalBill * 0.1;  
double amountToPay = totalBill - discount;

        
System.out.printf("Discount: %.2f\n", discount);
System.out.printf("Amount to pay after discount: %.2f\n", amountToPay);
scanner.close();
    }
}