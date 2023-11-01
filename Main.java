package Code;

import java.util.Scanner;

import static Code.HospitalEntrance.EntranceOptions;

class HospitalEntrance{
    static Scanner scan = new Scanner(System.in);
    public static void EntranceOptions(String VisitorsName){
        System.out.println("Dear "+VisitorsName+" Please tell where would you like to go: ");
        System.out.println("1 -> RECEPTION");
        System.out.println("2 -> HOSPITAL CANTEEN");
        System.out.println("3 -> HOSPITAL PHARMACY");
        System.out.println("4 -> Exit Hospital");
        System.out.println("Enter your option ");
        int EntranceOption = scan.nextInt();
        if(EntranceOption==1){
            System.out.println("..............................................");
            Reception.main();
        }
        else if(EntranceOption==2){
            System.out.println("..............................................");
            Canteen.main(Main.Name);
        }
        else if(EntranceOption==3){
            System.out.println("..............................................");
            Pharmacy.main();
        }
        else if(EntranceOption==4){
            System.out.println("..............................................");
            Main.Exit(VisitorsName);
        }

        else{
            System.out.println("WRONG INPUT");
            System.out.println();
            System.out.println("..............................................");
            EntranceOptions(VisitorsName);
        }

    }
}
public class Main {
    public static String Name;
    static int CardPin;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("                          WELCOME TO THE HOSPITAL");
        System.out.println();
        System.out.println();
        System.out.println("Please Enter your name Sir/Madam ");
        Name = scan.next();

//        HospitalEntrance v = new HospitalEntrance(Name);
        EntranceOptions(Name);
    }
    public static void Exit(String Visitorsname){
        System.out.println();
        System.out.println();
        System.out.println("Thankyou for visiting in our Hospital "+Visitorsname+ ". Have a nice day ahead :)");
    }
}