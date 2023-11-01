package Code;

import java.util.Scanner;

class ReceptionWorking {
    static Scanner scan = new Scanner(System.in);
    static int BookOption;

    public static void DoctorsBySpeciality() {
        System.out.println();
        System.out.println("Which one of the doctors are you looking for?");
        System.out.println("1 ->  Cardiologist (Heart)");
        System.out.println("2 ->  Dermatologist (Skin)");
        System.out.println("3 ->  Gynecologist (Females)");
        System.out.println("4 ->  Neurologist (Brain)");
        System.out.println("5 ->  Ophthalmologist (Eye)");
        System.out.println("6 ->  Dentist (Teeth)");
        System.out.println("7 ->  Psychiatrist (Mental Illness");
        System.out.println("8 ->  Return Back to Reception");
    }
    public static void Book() {
        DoctorsBySpeciality();
        System.out.println();
        System.out.println("Please Enter your option: ");
        BookOption = scan.nextInt();
        if (BookOption == 1) {
            DoctorTypes.Appointment();
        } else if (BookOption == 2) {
            DoctorTypes.Appointment();
        } else if (BookOption == 3) {
            DoctorTypes.Appointment();
        } else if (BookOption == 4) {
            DoctorTypes.Appointment();
        } else if (BookOption == 5) {
            DoctorTypes.Appointment();
        } else if (BookOption == 6) {
            DoctorTypes.Appointment();
        } else if (BookOption == 7) {
            DoctorTypes.Appointment();
        } else if (BookOption == 8) {
            receptionist();
        } else {
            System.out.println("WRONG INPUT");
            System.out.println();
            Book();
        }
    }
    public static void receptionist() {
        System.out.println();
        System.out.println("Dear " + Main.Name + " How may I help You ");
        System.out.println("1 ->  Book an appointment");
        System.out.println("2 ->  I would like to admit a patient");
        System.out.println("3 ->  Meet my Family Doctor");
        System.out.println("4 ->  Visit the Laboratory");
        System.out.println("5 ->  Back to Main");
//        System.out.println("6 ->  Apply for a job");
        System.out.println();
        System.out.println("Please Enter your option");
        int ReceptionOption = scan.nextInt();
        if (ReceptionOption == 1) {
            ReceptionWorking.Book();
        } else if (ReceptionOption == 2) {
            AdmitPatient.AdmitProcedure();
        }
        else if (ReceptionOption == 3){
            lift();
        }
        else if (ReceptionOption == 4){
            lift();
        }
        else if (ReceptionOption == 5) {
            HospitalEntrance.EntranceOptions(Main.Name);
        }
        else {
            System.out.println("INVALID INPUT");
            receptionist();
        }
    }
    public static void lift(){
        System.out.println();
        System.out.println("Welcome to the Hospital LIFT service, Where would you like to go");
        System.out.println("1 -> Floor 1      (Laboratory)");
        System.out.println("2 -> Floor 2      (Doctors Cabins)");
        int FloorNumber = scan.nextInt();
        if(FloorNumber==1){
            System.out.println("Please wait for "+(FloorNumber+3)+" seconds");
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e) {
                System.out.println();
            }
            Laboratory.main();
        }
        else if(FloorNumber==2){
            System.out.println("Please wait for "+(FloorNumber+3)+" seconds");
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e) {
                System.out.println();
            }
            MyDoctor.MyDoctorChoose();
        }
        else{
            System.out.println("INVALID INPUT");
            lift();
        }
    }
    static class AdmitPatient {
        static int PatientAge;
        static String PatientName;
        static String PatientProblem;
        static String PatientGender;
        static int PatientNumber;
        public static void AdmitProcedure() {
            System.out.println();
            System.out.println("Kindly Fill this form to proceed");
            System.out.println();
            System.out.println("Enter Patient's Name:");
            PatientName = scan.next();
            System.out.println("Enter Patient's Age : ");
            PatientAge = scan.nextInt();
            System.out.println("Enter Patient's Gender (M/F): ");
            PatientGender = scan.next();
            System.out.println("Enter Patient's Phone Number: ");
            PatientNumber = scan.nextInt();
            System.out.println("Describe the problem faced by the patient:");
            scan.nextLine();
            PatientProblem = scan.nextLine();
            System.out.println();
            System.out.println("Do want to");
            System.out.println("1 -> Submit Form");
            System.out.println("2 -> Make Changes");
            int a = scan.nextInt();
            if (a == 1) {
                System.out.println("Alright,The patient is ready to be admitted, please pay the Bills for admission");
                try{
                    System.out.println("Please wait for a few seconds");
                    Thread.sleep(6000);
                }
                catch(InterruptedException e){
                    System.out.println();
                }
                patientDetails();
            }
            else if (a == 2) {
                AdmitProcedure();
            }
            else{
                System.out.println("INVALID INPUT");
                AdmitProcedure();
            }
        }
        public static void patientDetails(){
            System.out.println();
            System.out.println("..............................................");
            System.out.println("                  PATIENT DETAILS");
            System.out.println("Patient's Name:           "+PatientName);
            System.out.println("Patient's Age:            "+PatientAge);
            System.out.println("Patient's Gender:         "+PatientGender.toUpperCase());
            System.out.println("Patient's Number:         "+PatientNumber);
            System.out.println("Patient's Problem:        "+PatientProblem);
            System.out.println("..............................................");

            System.out.println("Please type yes to proceed with the Billing procedure");
            String response;
            for(int i = 0; i < 2; i++){
                response = scan.next();
                response = response.toLowerCase();
                if(response.equals("yes")){
                    BillingWorking.AdmissionBill();
                    break;
                }
                else{
                    System.out.println("TRY AGAIN (type 'yes')");
                }
            }
        }
    }
}

public class Reception {
    public static void main() {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Reception Dear " + Main.Name);
        System.out.println();
        System.out.println();
        ReceptionWorking.receptionist();
    }
}
