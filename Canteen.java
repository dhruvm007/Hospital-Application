package Code;
import java.util.*;
class CanteenWorking{
    static Scanner scan = new Scanner(System.in);
    public static void CanteenProcedure(String VisitorsName){
        int CanteenItemNumber;
        int ItemAmount=0;
        int NumberOfItems;
        int count = 1;
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Hospital Canteen "+VisitorsName);
        System.out.println("Here's Our MENU!");
        System.out.println();
        System.out.println("................................OUR MENU................................");
        System.out.println("                  BREAKFAST");
        System.out.println("1 ->  Sandwich                     ₹79.00");
        System.out.println("2 ->  Boiled Eggs(2)               ₹39.00");
        System.out.println("3 ->  Fresh Fruits                 ₹69.00");
        System.out.println("4 ->  Oat Meal                     ₹59.00");
        System.out.println("                  SNACKS");
        System.out.println("5 ->  Soups                        ₹19.00");
        System.out.println("6 ->  Salads                       ₹69.00");
        System.out.println("7 ->  Burger                       ₹79.00");
        System.out.println("8 ->  Chips                        ₹39.00");
        System.out.println("                  BEVERAGES");
        System.out.println("9 ->  Bottled Water                ₹39.00");
        System.out.println("10 ->  Fruit Juices                ₹59.00");
        System.out.println("11 ->  Tea/Coffee                  ₹29.00");
        System.out.println("12 ->  Lassi                       ₹39.00");
        System.out.println("                  DESSERTS");
        System.out.println("13 ->  Ice Cream                   ₹39.00");
        System.out.println("14 ->  Chocolate Mousse            ₹59.00");
        System.out.println("15 ->  Pastries                    ₹59.00");
        System.out.println("16 ->  Milkshakes                  ₹59.00");
        System.out.println("........................................................................");
        System.out.println();
        System.out.println("How many items do you want to order? (1,2,3)");
        NumberOfItems = scan.nextInt();
        for(int i=1;i<=NumberOfItems;i++){
            System.out.println("Please enter the number digit of your Item from the MENU");
            CanteenItemNumber = scan.nextInt();
            count++;
            if (CanteenItemNumber==1 || CanteenItemNumber==7){
                ItemAmount = ItemAmount + 79;
            }
            else if (CanteenItemNumber == 2 || CanteenItemNumber==8 || CanteenItemNumber==9 || CanteenItemNumber==12 || CanteenItemNumber==13){
                ItemAmount = ItemAmount + 39;
            }
            else if (CanteenItemNumber == 3 || CanteenItemNumber==6){
                ItemAmount = ItemAmount + 69;
            }
            else if (CanteenItemNumber == 4 || CanteenItemNumber == 10 || CanteenItemNumber == 14 || CanteenItemNumber == 15 || CanteenItemNumber == 16){
                ItemAmount = ItemAmount + 59;
            }
            else if (CanteenItemNumber == 5){
                ItemAmount = ItemAmount + 199;
            }
            else if (CanteenItemNumber == 11){
                ItemAmount = ItemAmount + 29;
            }
        }
        System.out.println("Do you want to donate some amount for the needy?");
        System.out.println("1 -> YES");
        System.out.println("2 -> NO");
        int donation = scan.nextInt();
        int donationAmount = 0;
        if(donation==1){
            System.out.println("Please Enter the amount you want to donate: ");
            donationAmount = scan.nextInt();
        }
        System.out.println("Thanks for buying from our Canteen");
        CanteenBilling(VisitorsName, ItemAmount, donationAmount, count);
    }
    public static void CanteenBilling(String VisitorsName, int BillingAmount, int donationAdded, int itemsBought){
        int tax = 20;
        System.out.println();
        System.out.println("Welcome to the Canteen Billing "+VisitorsName+". Kindly Proceed with the Billing until your food gets ready");
        System.out.println();
        System.out.println("................................YOUR BILL................................");
        System.out.println("Here's Your Bill");
        System.out.println("Number of Items Bought:             "+itemsBought);
        System.out.println();
        System.out.println("Total Amount:                       ₹"+BillingAmount+".00");
        System.out.println("Tax (GST+SALES):                    ₹"+tax+".00");
        System.out.println("Donation for the needy:             ₹"+donationAdded+".00");
        System.out.println();
        int TotalBill = BillingAmount + tax + donationAdded;
        System.out.println("Total Bill:                         ₹"+TotalBill+".00");
        System.out.println(".........................................................................");
        BillingPayment(VisitorsName);
    }
    public static void BillingPayment(String VisitorsName){
        System.out.println();
        System.out.println("...........................PAYMENT GATEWAY...........................");
        System.out.println("How Would you like to pay");
        System.out.println("1 ->  CASH");
        System.out.println("2 ->  CARD");
        int PayCanteenMethod= scan.nextInt();
        if(PayCanteenMethod==1){
            System.out.println("PAID! Thanks for the payment, Enjoy your Meal");
            System.out.println(".............................................................");
            HospitalEntrance.EntranceOptions(VisitorsName);
        }
        else if(PayCanteenMethod==2){
            System.out.println("Please Enter your Pin");
            Main.CardPin = scan.nextInt();
            System.out.println("PAID! Thanks for the payment, Enjoy your Meal");
            System.out.println("................................................");
            HospitalEntrance.EntranceOptions(VisitorsName);
        }
        else{
            System.out.println();
            System.out.println("Please Enter a valid option");
            BillingPayment(VisitorsName);
        }
    }
}
public class Canteen {
    public static void main(String VisitorsName){
        CanteenWorking.CanteenProcedure(VisitorsName);
    }
}
