package Code;
import java.util.*;

class PharmacyWorking{
    static boolean Pharmacy=false;
    static int MedicineBill = 0;
    static Scanner scan = new Scanner(System.in);
    public static void PharmacyWorkingProcedure(){
        System.out.println();
        System.out.println("Please choose among the following");
        System.out.println("1 ->  Buy Medicines");
        System.out.println("2 ->  Buy Accessories");
        int BuyOption = scan.nextInt();
        if (BuyOption==1){
            BuyMedicines();
        }
        else if(BuyOption==2){
            BuyAccessories();
        }
        else{
            System.out.println("INVALID INPUT");
            PharmacyWorkingProcedure();
        }
    }
    public static void BuyMedicines(){
        System.out.println();
        System.out.println("......................MEDICINES......................");
        System.out.println("1 -> Antibiotics                        ₹199.0");
        System.out.println("2 -> Antidepressants                    ₹299.0");
        System.out.println("3 -> Antacids                           ₹159.0");
        System.out.println("4 -> Anti-diabetic                      ₹399.0");
        System.out.println("5 -> Syrups                             ₹199.0");
        System.out.println("6 -> Anaesthesia                        ₹499.0");
        System.out.println("......................................................");
        int MedicineType = scan.nextInt();
        if(MedicineType==1 || MedicineType==5){
            MedicineBill = MedicineBill + 199;
        }
        else if(MedicineType==2){
            MedicineBill = MedicineBill + 299;
        }
        else if(MedicineType==3){
            MedicineBill = MedicineBill + 159;
        }
        else if(MedicineType==4){
            MedicineBill = MedicineBill + 399;
        }
        else if(MedicineType==6){
            MedicineBill = MedicineBill + 499;
        }
        else{
            System.out.println("INVALID INPUT");
            BuyMedicines();
        }
        PharmacyBilling();
    }
    public static void BuyAccessories(){
        System.out.println();
        System.out.println("......................ACCESSORIES......................");
        System.out.println("1 -> Syringe                            ₹49.0");
        System.out.println("2 -> Inhaler                            ₹49.0");
        System.out.println("3 -> Gloves                             ₹59.0");
        System.out.println("4 -> Test Tube                          ₹69.0");
        System.out.println("5 -> PPE Kit                            ₹899.0");
        System.out.println("6 -> Mask                               ₹19.0");
        System.out.println("7 -> Diapers                            ₹49.0");
        System.out.println("8 -> Bandages                           ₹19.0");
        System.out.println("........................................................");
        int MedicineType = scan.nextInt();
        if(MedicineType==1 || MedicineType==2 || MedicineType==7){
            MedicineBill = MedicineBill + 49;
        }
        else if(MedicineType==3){
            MedicineBill = MedicineBill + 59;
        }
        else if(MedicineType==4){
            MedicineBill = MedicineBill + 69;
        }
        else if(MedicineType==5){
            MedicineBill = MedicineBill + 899;
        }
        else if(MedicineType==6 || MedicineType==8){
            MedicineBill = MedicineBill + 19;
        }
        else{
            System.out.println("INVALID INPUT");
            BuyAccessories();
        }
        PharmacyBilling();
    }
    public static void PharmacyBilling(){
        int HospitalPrescriptionDiscount = 0;
        int tax = 20;
        System.out.println();
        System.out.println("Thanks for purchasing an item from our Hospital Pharmacy");
        System.out.println("................................YOUR BILL................................");
        System.out.println("Here's your BILL");
        System.out.println();
        System.out.println("ITEM Price:                               ₹"+MedicineBill);
        System.out.println("Tax (GST+SERVICE):                        ₹"+tax);
        System.out.println("Hospital Prescription Discount:          -₹"+HospitalPrescriptionDiscount);
        System.out.println();
        int TotalBill = (MedicineBill+ tax) - HospitalPrescriptionDiscount;
        System.out.println("Total BILL                                ₹"+TotalBill+".00");
        System.out.println(".........................................................................");
        PharmacyBillingOptions();
    }
    public static void PharmacyBillingOptions(){

        System.out.println();
        System.out.println("How Would you like to pay");
        System.out.println("1 ->  CASH");
        System.out.println("2 ->  CARD");
        int PayMethod= scan.nextInt();
        if(PayMethod==1){
            System.out.println("PAID! Thanks for the payment");
        }
        else if(PayMethod==2){
            System.out.println("Please Enter your Pin");
            Main.CardPin = scan.nextInt();
            System.out.println("PAID! Thanks for the payment");
        }
        else{
            System.out.println();
            System.out.println("INVALID INPUT");
            PharmacyBillingOptions();
        }
        System.out.println(".........................................................................");
        Pharmacy = true;
        BillingWorking.AfterPayment();
    }
}
public class Pharmacy {
    public static void main(){
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Hospital Pharmacy "+Main.Name);
        PharmacyWorking.PharmacyWorkingProcedure();
    }
}
