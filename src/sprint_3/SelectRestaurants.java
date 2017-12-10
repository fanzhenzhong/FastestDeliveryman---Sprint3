package sprint_3;

import java.util.ArrayList;
import java.util.Scanner;
import sprint_3.RestaurantInfo;

/**
 *
 * @author Chan Yong Hua
 */
public class SelectRestaurants {

    public static void main(String[] args) {
        ArrayList<RestaurantInfo> res1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        RestaurantInfo r1 = new RestaurantInfo("Choo Choo Chicken", "Korean Food", 3, 2, "Setapak");
        RestaurantInfo r2 = new RestaurantInfo("HomeTown", "Steamboat", 4, 3, "Genting Klang");
        RestaurantInfo r3 = new RestaurantInfo("MoonLight", "Dessert", 3, 1, "Setapak");

        res1.add(r1);
        res1.add(r2);
        res1.add(r3);

        int exit = 0;

        System.out.println("----------------------------------");
        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        do {
            System.out.println("Restaurants Collaborated");
            System.out.println("----------------------------------\n");

            for (int i = 0; i < res1.size(); i++) {
                System.out.println((i + 1) + ". " + res1.get(i).getResName());
            }

            System.out.print("Please select a restaurant: ");
            int getRes = scan.nextInt();

            --getRes;
            System.out.println("\n----------------------------------");
            System.out.println(res1.get(getRes).getResName());
            System.out.println("----------------------------------");
            System.out.println("Type : " + res1.get(getRes).getType());
            
            System.out.print("Rating : ");
            for (int j = 0; j < res1.get(getRes).getRating(); j++) {
                System.out.print("* ");
            }
            
            System.out.print("\nPrice : ");
            for (int j = 0; j < res1.get(getRes).getAverPrice(); j++) {
                System.out.print("* ");
            }
            
            System.out.println("\nLocation : " + res1.get(getRes).getLocation());

            System.out.println("\n\nMENU");
            System.out.println("=====================================");
            System.out.println("1.XXXXXXXXXXX");
            System.out.println("2.XXXXXXXXXXX");
            System.out.println("3.XXXXXXXXXXX");
            
            System.out.print("Do you want to continue? (Y/N) :");
            String cont=scan.next();
            char ch=cont.charAt(0);
            if(ch=='Y'||ch=='y'){
                exit=1;
            }
            else
                exit=0;
            
        } while (exit == 1);
    }

}
