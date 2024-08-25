import java.util.Scanner;
public class IT24101258Lab5Q3 {
     public static final double ROOM_CHARGE_PER_DAY = 48000.0;
     public static final int DISCOUNT_3_TO_4_DAYS = 10;
     public static final int DISCOUNT_5_OR_MORE_DAYS = 20;
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Start Date (1-31): ");
         int startDate = input.nextInt();
         System.out.print("Enter End Date (1-31): ");
         int endDate = input.nextInt();
         if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
         }
         if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
         }
         int daysReserved = endDate - startDate;
         double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
         double discount = 0.0;
         if (daysReserved >= 3 && daysReserved <= 4) {
            discount = (DISCOUNT_3_TO_4_DAYS / 100.0) * totalAmount;
         } else if (daysReserved >= 5) {
            discount = (DISCOUNT_5_OR_MORE_DAYS / 100.0) * totalAmount;
         }
         double amountToPay = totalAmount - discount;
         System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
         System.out.println("Number of Days Reserved: " + daysReserved);
         System.out.println("Total Amount to be Paid: " + amountToPay);
     }
}