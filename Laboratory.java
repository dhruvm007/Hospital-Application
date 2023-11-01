package Code;
import java.util.*;

class LaboratoryWorking{
    static Scanner scan = new Scanner(System.in);
    static int LabOption;
    static Random rand = new Random();
    public static void procedure(){
        System.out.println();
        System.out.println("How may I help you ?");
        System.out.println("1 -> Take a TEST");
        System.out.println("2 -> Submit a SAMPLE");
        System.out.println("3 -> Collect My TEST REPORT");
        LabOption = scan.nextInt();
        if(LabOption==1){
            TakeTest();
        }
        else if(LabOption==2){
            SubmitSample();
        }
        else if(LabOption==3){
            TakeReport();
        }
        else{
            procedure();
        }
    }
    public static void TakeTest(){
        System.out.println();
        System.out.println("1 -> Blood Test");
        System.out.println("2 -> X-RAY");
        System.out.println("3 -> Ultrasound");
        LabOption = scan.nextInt();
        if (LabOption==1 || LabOption==2 || LabOption==3){
            TestCompleted();
        }
    }
    public static void TestCompleted(){
        int num1 = rand.nextInt(2)+1;
        int num2 = rand.nextInt(3)+2;
        System.out.println();
        if(num1==1){
            System.out.println();
            System.out.println("............................................................................................");
            System.out.println("Very sorry to inform you that your test procedure doesn't conclude a good result, we hope for the best.");
            System.out.println("Please collect your report after "+num2+" days.");
            AfterTest();
        }
        if(num1==2){
            System.out.println();
            System.out.println("Very happy to inform you that your test procedure seems to be in a positive direction, Let's see what the results say.");
            System.out.println("Please collect your report after "+num2+" days. Tests are free in our hospital");
            AfterTest();
        }
    }
    public static void AfterTest(){
        System.out.println();
        System.out.println(".................................................................................................");
        System.out.println("Now, where would you like to go");
        System.out.println("1 ->  Leave Hospital");
        System.out.println("2 ->  Canteen");
        System.out.println("3 ->  Reception");
        System.out.println("4 ->  Pharmacy");
        BillingWorking.AfterOption = scan.nextInt();
        if(BillingWorking.AfterOption==1){
            Main.Exit(Main.Name);
        }
        else if(BillingWorking.AfterOption==2){
            Canteen.main(Main.Name);
        }
        else if(BillingWorking.AfterOption==3){
            ReceptionWorking.receptionist();
        }
        else if(BillingWorking.AfterOption==4){
            Pharmacy.main();
        }
    }
    public static void SubmitSample(){
        System.out.println();
        System.out.println("Which Type of sample do you want to submit.");
        System.out.println("1 -> Urine");
        System.out.println("2 -> Blood");
        System.out.println("3 -> Stool");
        LabOption = scan.nextInt();
        if (LabOption==1 || LabOption==2 || LabOption==3){
            SampleSubmitted();
        }
        else{
            System.out.println("INVALID INPUT");
            SubmitSample();
        }
    }
    public static void SampleSubmitted(){
        int num = rand.nextInt(3)+2;
        System.out.println();
        System.out.println("Thanks for submitting your sample. You can collect the report after "+num+" days.");
        AfterTest();
    }
    public static void TakeReport(){
        System.out.println();
        System.out.println("Congratulations on your remarkable progress in your health, thanks for choosing our Hospital Laboratory, here's your report.");
        AfterTest();
    }
}
public class Laboratory {
    public static void main(){
        System.out.println();
        System.out.println();
        System.out.println("........................................................................");
        System.out.println("WELCOME TO THE HOSPITAL LABORATORY "+Main.Name);
        LaboratoryWorking.procedure();
    }
}
