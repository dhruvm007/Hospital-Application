package Code;

import java.util.*;

class BillingWorking{
    public static int tax;
    static int DoctorsFee = 599;
    static int MedicineAmount;
    static int TotalMedicineAmount=0;
    static int HospitalPrescriptionDiscount = 0;
    static int FinalBill;
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void BillingProcedureMedsBought(int amount){
        tax = amount + 20;
        int a;
        HospitalPrescriptionDiscount = HospitalPrescriptionDiscount+50;
        amount = amount + 20;
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Billing Counter "+Main.Name+".");
        System.out.println("............................YOUR BILL............................");
        System.out.println("You have bought "+DoctorTypes.MedicineNumber+" Medicines and your Bill is Displayed below");
        System.out.println();
        for(int i = 1; i <= DoctorTypes.MedicineNumber; i++){
            a = rand.nextInt(6)+20;
            MedicineAmount = amount * a;
            System.out.println("Medicine "+i+":"+"                      "+MedicineAmount);
            TotalMedicineAmount += MedicineAmount;

        }
        FinalBill = (TotalMedicineAmount+DoctorsFee+tax)-HospitalPrescriptionDiscount;
        System.out.println("Doctor's Appointment Fee:               ₹"+DoctorsFee);
        System.out.println("Tax (GST+ Sales + Local):               ₹"+tax);
        System.out.println("Hospital Prescription Discount:        -₹"+HospitalPrescriptionDiscount);
        System.out.println();
        System.out.println("Total Amount to be paid:                ₹"+FinalBill);
        BillingPayment();
    }
    public static void BillingProcedureMedsNotBought(){
        tax = tax + 20;
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Billing Counter "+Main.Name+".");
        System.out.println("............................YOUR BILL............................");
        System.out.println("Here's your BILL");
        System.out.println();
        System.out.println("Doctor's Appointment Fee:                ₹"+DoctorsFee);
        System.out.println("Tax (GST+ Sales + Local):                ₹"+tax);
        System.out.println();
        FinalBill = (DoctorsFee + tax) - HospitalPrescriptionDiscount;
        System.out.println("Total Amount to be paid:                 ₹"+FinalBill);
        BillingPayment();
    }
    public static void BillingPayment(){
        System.out.println();
        System.out.println("..........................PAYMENT GATEWAY..........................");
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
            BillingPayment();
        }
        System.out.println("..................................................................");
        AfterPayment();
    }
    static int AfterOption;
    public static void AfterPayment(){
        System.out.println();
        System.out.println("Now, where would you like to go");
        System.out.println("1 ->  Leave Hospital");
        System.out.println("2 ->  Canteen");
        System.out.println("3 ->  Reception");
        if(!PharmacyWorking.Pharmacy){
            System.out.println("4 ->  Pharmacy");
        }
        int AfterOption = scan.nextInt();
        if(AfterOption==1){
            System.out.println("..................................");
            Main.Exit(Main.Name);
        }
        else if(AfterOption==2){
            System.out.println("..................................");
            Canteen.main(Main.Name);
        }
        else if(AfterOption==3){
            System.out.println("..................................");
            ReceptionWorking.receptionist();
        }
        else if(AfterOption==4){
            System.out.println("..................................");
            Pharmacy.main();
        }
    }
    public static void AdmissionBill(){
        int AgeExtraDiscount=0;
        if(ReceptionWorking.AdmitPatient.PatientAge <13 || ReceptionWorking.AdmitPatient.PatientAge > 70){
            AgeExtraDiscount = AgeExtraDiscount + 50;
        }
        int AdmitAmount = rand.nextInt(6)+10;
        tax = AdmitAmount + 20;
        AdmitAmount = AdmitAmount * 1000;
        System.out.println();
        System.out.println("............................YOUR BILL............................");
        System.out.println("Here's your BILL");
        System.out.println();
        System.out.println("Patient Admission Fee          ₹"+AdmitAmount);
        System.out.println("Age Discount:                 -₹"+AgeExtraDiscount);
        System.out.println("Tax (LOCAL+GST):               ₹"+tax);
        System.out.println();
        int total = (AdmitAmount + tax) -AgeExtraDiscount;
        System.out.println("Total BILL                     ₹"+total);
        BillingPayment();
    }
}
public class Billing {
    public static int option;
    public static void main(int amount){
        if (option==1){
            BillingWorking.BillingProcedureMedsBought(amount);
        }
        if(option==2){
            BillingWorking.BillingProcedureMedsNotBought();
        }
    }
}
