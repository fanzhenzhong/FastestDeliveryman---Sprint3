package sprint_3;

//Author: Ng Li Poh
import java.util.*;

public class ViewDeliveryStatus {

    public static void main(String[] args) {
        ArrayList<DeliveryManInfo> deliInfo = new ArrayList<>();

        DeliveryManInfo worker1 = new DeliveryManInfo("W101", "Alex Chan", "970417-10-6124", "0123456789", "abc92@mail.com", "3,jalan aman,taman aman", "Break", "Resigned");
        DeliveryManInfo worker2 = new DeliveryManInfo("W102", "Benny Fan", "121221-33-1251", "0198765432", "fedc98@gmail.com", "22,prima setapak condo", "Available", "Retired");
        DeliveryManInfo worker3 = new DeliveryManInfo("W103", "Polly Ng", "980530-09-1234", "0158749632", "quada99@mailcom", "99,jalan bunga wangi,taman wangi", "Delivering", "Employed");
        DeliveryManInfo worker4 = new DeliveryManInfo("W104", "Kah Yee Fan", "971017-10-6121", "0123456789", "abc92@mail.com", "3,jalan aman,taman aman", "Delivering", "Employed");
        DeliveryManInfo worker5 = new DeliveryManInfo("W105", "Liaw Swee Tian", "120921-33-1224", "0198765432", "fedc98@gmail.com", "22,prima setapak condo", "Delivering", "Employed");
        DeliveryManInfo worker6 = new DeliveryManInfo("W106", "Jason Chong", "980430-09-1234", "0158749632", "quada99@mailcom", "99,jalan bunga wangi,taman wangi", "Break", "Resigned");
        DeliveryManInfo worker7 = new DeliveryManInfo("W107", "Ali Binti Shadin", "971217-10-5363", "0123456789", "abc92@mail.com", "3,jalan aman,taman aman", "Available", "Employed");
        DeliveryManInfo worker8 = new DeliveryManInfo("W108", "Muthu", "121221-33-3251", "0198765432", "fedc98@gmail.com", "22,prima setapak condo", "Available", "Employed");
        DeliveryManInfo worker9 = new DeliveryManInfo("W109", "Chaw Rong Weng", "980730-09-1234", "0158749632", "quada99@mailcom", "99,jalan bunga wangi,taman wangi", "Available", "Resigned");

        deliInfo.add(worker1);
        deliInfo.add(worker2);
        deliInfo.add(worker3);
        deliInfo.add(worker4);
        deliInfo.add(worker5);
        deliInfo.add(worker6);
        deliInfo.add(worker7);
        deliInfo.add(worker8);
        deliInfo.add(worker9);

        Scanner scan = new Scanner(System.in);
        title();

        do {
            System.out.println("---------------Menu--------------------");
            System.out.println("1. View Delivery Man's Working Status");
            System.out.println("2. Update Delivery Man's Status");
            System.out.println("3. Update Delivery Man Information");
            System.out.print("\nPlease select your option: ");
            Integer input = scan.nextInt();
            if (input == 1) {
                System.out.println("\nDo you want to view all delivery man's working status or search by ID?");
                System.out.println("1. View All");
                System.out.println("2. Search by ID");
                System.out.print("Please enter your selection: ");
                input = scan.nextInt();
                //if is 1 then show all,if 2 can search by ID
                switch (input) {
                    case 1:
                        viewStatus();
                        for (int i = 0; i < deliInfo.size(); ++i) {

                            System.out.println("" + deliInfo.get(i).getRegNo() + "        " + String.format("%-20s", deliInfo.get(i).getDeliveryManName()) + String.format("%-20s", deliInfo.get(i).getWorkingStatus()));

                        } //if input is 2,search by ID
                        break;
                    case 2:
                        System.out.print("Please enter the ID of the delivery man: ");
                        String regNo = scan.next();
                        int a=1;//to see whether want to show error message or not
                        for (int i = 0; i < deliInfo.size(); ++i) {
                            if (regNo.equals(deliInfo.get(i).getRegNo())) {
                                viewStatus();
                                System.out.println("" + deliInfo.get(i).getRegNo() + "        " + String.format("%-20s", deliInfo.get(i).getDeliveryManName()) + String.format("%-20s", deliInfo.get(i).getWorkingStatus()));
                                a=0;
                            }
                            
                        }
                         if(a==1)
                                   System.out.println("Sorry, the ID does not exist in the list. Please try again."); 
                        break;
                    default:
                        System.out.println("The number is out of range! Plese enter a valid number.");
                        break;
                }

            } else {
                System.out.println("The number is out of range! Plese enter a valid number.");
            }

        } while (confirmation()
                == 0);
        System.out.println(
                "Thanks for using the system. Have a Nice Day :)");

    }

    public static void title() {
        System.out.println("\n=============================================");
        System.out.println("         FASTEST DELIVERY SDN.BHD");
        System.out.println("=============================================\n");

    }
//viewStatus for option 1 and 2
    public static void viewStatus() {
        title();

        System.out.println("        Delivery Man's Working Status ");
        System.out.println("-------------------------------------------------");
        System.out.println("ID          Name                  Status");
        System.out.println("-------------------------------------------------");

    }

    public static int confirmation() {
        Scanner scan = new Scanner(System.in);
        int exit = 0;
        System.out.print("\nDo you want to continue(Y/N)? ");
        String con = scan.next();

        char con1 = con.charAt(0);

        if (con1 == 'Y' || con1 == 'y') {
            exit = 0;
        } else {
            exit = 1;
        }
        return exit;
    }

}
