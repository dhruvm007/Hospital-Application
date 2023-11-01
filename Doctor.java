package Code;
import java.util.*;

class MyDoctor{
    static Scanner scan = new Scanner(System.in);
    public static void MyDoctorChoose(){
        ReceptionWorking.DoctorsBySpeciality();
        System.out.println();
        System.out.println("Please Enter your Doctor's Speciality:");
        int SpecialityOption = scan.nextInt();
        int FamilyDoc;
        if (SpecialityOption == 1) {
            System.out.println("We have got two Cardiologists, which one is your family doctor");
            System.out.println("1 -> Dr. Smith");
            System.out.println("2 -> Dr. Johnson");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Cardiologist.DrSmith();
            }
            else if (FamilyDoc==2){
                DoctorTypes.Cardiologist.DrJohnson();
            }
        } else if (SpecialityOption == 2) {
            System.out.println("We have got two Dermatologists, which one is your family doctor");
            System.out.println("1 -> Dr. Lee");
            System.out.println("2 -> Dr. Williams");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Dermatologist.DrLee();
            }
            else if (FamilyDoc==2){
                DoctorTypes.Dermatologist.DrWilliams();
            }
        } else if (SpecialityOption == 3) {
            System.out.println("We have got two Gynecologists, which one is your family doctor");
            System.out.println("1 -> Dr. Garcia");
            System.out.println("2 -> Dr. Brown");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Gynecologist.DrGarcia();
            }
            if (FamilyDoc==2){
                DoctorTypes.Gynecologist.DrBrown();
            }
        } else if (SpecialityOption == 4) {
            System.out.println("We have got two Neurologists, which one is your family doctor");
            System.out.println("1 -> Dr. Jones");
            System.out.println("2 -> Dr. Fernandez");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
            DoctorTypes.Neurologist.DrJones();
            }
            if (FamilyDoc==2){
                DoctorTypes.Neurologist.DrFernandez();
            }
        } else if (SpecialityOption == 5) {
            System.out.println("We have got two Ophthalmologists, which one is your family doctor");
            System.out.println("1 -> Dr. Chris");
            System.out.println("2 -> Dr. Clark");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Ophthalmologist.DrChris();
            }
            if (FamilyDoc==2){
                DoctorTypes.Ophthalmologist.DrClark();
            }
        } else if (SpecialityOption == 6) {
            System.out.println("We have got two Dentists, which one is your family doctor");
            System.out.println("1 -> Dr. Wilson");
            System.out.println("2 -> Dr. Taylor");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Dentist.DrWilson();
            }
            if (FamilyDoc==2){
                DoctorTypes.Dentist.DrTaylor();
            }
        } else if (SpecialityOption == 7) {
            System.out.println("We have got two Psychiatrists, which one is your family doctor");
            System.out.println("1 -> Dr. Davis");
            System.out.println("2 -> Dr. Evans");
            FamilyDoc = scan.nextInt();
            if (FamilyDoc==1){
                DoctorTypes.Psychiatrist.DrDavis();
            }
            if (FamilyDoc==2){
                DoctorTypes.Psychiatrist.DrEvans();
            }
        } else if (SpecialityOption == 8) {
            ReceptionWorking.receptionist();
        } else {
            System.out.println("WRONG INPUT");
            System.out.println();
        }
    }
}
class DoctorTypes{
    static Scanner scan = new Scanner(System.in);
    static Random randomNumber = new Random();
    static int MedicineNumber;
    public static void PostDoctor(){
        System.out.println();
        System.out.println("What do you want to do now?");
        System.out.println("1 ->  Buy medicines and go to the billing counter");
        System.out.println("2 ->  Don't buy medicines and go to the billing");
        System.out.println("3 ->  To the Reception");
        int PharmacyResponse = scan.nextInt();
        if(PharmacyResponse==1){
            Billing.option = 1;
            Billing.main(MedicineNumber);
        }
        else if(PharmacyResponse==2){
            Billing.option = 2;
            Billing.main(MedicineNumber);
        }
        else if(PharmacyResponse==3){
            ReceptionWorking.receptionist();
        }
        else{
            System.out.println("INVALID INPUT");
            PostDoctor();
        }
    }
    public static void DoctorsResponseIfGood(){
        System.out.println("Cheers! That's good to hear from you. I'm also good");
        System.out.println("I want to tell you that you have successfully completed your medicine course and now you are absolutely fine");
        System.out.println("Just avoid oily food and I have written you some medicines please purchase them from the Pharmacy");
        PostDoctor();
    }
    public static void DoctorsResponseIfBad(){
        System.out.println("Well, that's nothing to worry about my Dear friend");
        System.out.println("I want to tell that your medicine course is going very well and you are going to be absolutely fine");
        System.out.println("I have written you some more medicines for the next week please purchase them from the Pharmacy");
        PostDoctor();
    }
    public static void FamilyDoctorGreeting(){
        System.out.println("Hello "+Main.Name+". I feel good to meet you again, how are you feeling (good or bad). Tell me");
        String PatientsAnswer = scan.next();
        if( PatientsAnswer.equals("good")){
            MedicineNumber = randomNumber.nextInt(5)+4;
            DoctorsResponseIfGood();
        }
        else if( PatientsAnswer.equals("bad")){
            MedicineNumber = randomNumber.nextInt(7)+6;
            DoctorsResponseIfBad();
        }
    }
    public static void Appointment(){
        String organ=null;
        if(ReceptionWorking.BookOption==1){
            organ = "Heart";
        }
        else if(ReceptionWorking.BookOption==2){
            organ = "Skin";
        }
        else if(ReceptionWorking.BookOption==3){
            organ = "Private Parts";
        }
        else if(ReceptionWorking.BookOption==4){
            organ = "Brain";
        }
        else if(ReceptionWorking.BookOption==5){
            organ = "Eye";
        }
        else if(ReceptionWorking.BookOption==6){
            organ = "Teeth";
        }
        else if(ReceptionWorking.BookOption==7){
            organ = "Mental Health";
        }
        System.out.println("Welcome "+Main.Name+". I heard you have some problems related to your "+organ);
        PatientProblem();
    }
    public static void PatientProblem(){
        System.out.println("Please Describe the particular issue faced by you");
        String issue = scan.nextLine();
    }
    static class Cardiologist{
        public static void DrSmith(){
            FamilyDoctorGreeting();
        }
        public static void DrJohnson(){
            FamilyDoctorGreeting();
        }
    }
    static class Dermatologist{
        public static void DrLee(){
            FamilyDoctorGreeting();
        }
        public static void DrWilliams(){
            FamilyDoctorGreeting();
        }
    }
    static class Gynecologist{
        public static void DrGarcia(){
            FamilyDoctorGreeting();
        }
        public static void DrBrown(){
            FamilyDoctorGreeting();
        }
    }
    static class Neurologist{
        public static void DrJones(){
            FamilyDoctorGreeting();
        }
        public static void DrFernandez(){
            FamilyDoctorGreeting();
        }
    }
    static class Ophthalmologist{
        public static void DrChris(){
            FamilyDoctorGreeting();
        }
        public static void DrClark(){
            FamilyDoctorGreeting();
        }
    }
    static class Dentist{
        public static void DrWilson(){
            FamilyDoctorGreeting();
        }
        public static void DrTaylor(){
            FamilyDoctorGreeting();
        }
    }
    static class Psychiatrist{
        public static void DrDavis(){
            FamilyDoctorGreeting();
        }
        public static void DrEvans(){
            FamilyDoctorGreeting();
        }
    }
}

public class Doctor{
    static Scanner scan = new Scanner(System.in);
    public static void welcome(){
        System.out.println("Welcome Dear "+Main.Name+". I heard you have some problems related to your Heart");
        System.out.println("Please Describe the problem faced by you");
        String HeartProblem = scan.nextLine();
    }
}
