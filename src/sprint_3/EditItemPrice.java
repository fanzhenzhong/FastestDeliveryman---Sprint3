/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint_3;

import java.util.ArrayList;
import java.util.Scanner;
import sprint_3.Service;

public class EditItemPrice {

    public static void main(String[] args) {
        int count = 0;
        ArrayList<Service> ResMenu = new ArrayList<Service>();

        Service food1 = new Service("F001", "Dave's Roasted Chicken", "Roasted with garlic", "Chicken", "Available", "15.65", "0");
        Service food2 = new Service("F002", "Dave's Smoked Duck", "Smoked with rosemary", "Duck", "Limited", "17.50", "0");
        Service food3 = new Service("F003", "Chicken Parmigiana", "Baked with cherry tomato", "Chicken", "Premium", "21.30", "0");
        ResMenu.add(food1);
        ResMenu.add(food2);
        ResMenu.add(food3);

        Scanner scan = new Scanner(System.in);
        boolean ans = false;

        System.out.println("----------------------------------");
        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        System.out.println("MENU MAINTENANCE - EDIT ITEM");
        System.out.println("-----------------------------------\n");

        System.out.print("Please enter food ID: ");
        String foodid = scan.nextLine();

        for (int i = 0; i < ResMenu.size(); i++) {
            if (foodid.equals(ResMenu.get(i).getFoodID())) {
                ans = true;
                System.out.println("------------FOOD DETAILS-------------");
                System.out.println("-------------------------------------\n");
                System.out.println("Food ID: " + ResMenu.get(i).getFoodID());
                System.out.println("Food Name: " + ResMenu.get(i).getFoodName());
                System.out.println("Food Description: " + ResMenu.get(i).getDesc());
                System.out.println("Food Category: " + ResMenu.get(i).getFoodCat());
                System.out.println("Food Status: " + ResMenu.get(i).getStatus());
                System.out.println("Food Price(RM): " + ResMenu.get(i).getPrice());
                System.out.println("Food Promotional Rate(%): " + ResMenu.get(i).getPromoRate());

                System.out.println("\nPlease enter the detail you want to update?");
                System.out.println("1. Food Name");
                System.out.println("2. Food Description");
                System.out.println("3. Food Category");
                System.out.println("4. Food Status");
                System.out.println("5. Food Price(RM)");
                System.out.println("6. Food Promotional Rate");
                System.out.print("Please select one option to edit(1-6) :");
                int input = Integer.parseInt(scan.nextLine());
                
                
                
                
                if (input < 1 || input > 6) {
                    System.out.println("\nOps! Option entered out of range. Please enter between 1-6");
                }
                else {
                    switch (input) {
                        case 1: {
                            System.out.print("Food Name: ");
                            ResMenu.get(i).setFoodName(scan.nextLine());
                        }
                        break;
                        case 2: {
                            System.out.print("Food Description: ");
                            ResMenu.get(i).setDesc(scan.nextLine());
                        }
                        break;
                        case 3: {
                            System.out.print("Food Category: ");
                            ResMenu.get(i).setFoodCat(scan.nextLine());
                        }
                        break;
                        case 4: {
                            System.out.print("Food Status: ");
                            ResMenu.get(i).setStatus(scan.nextLine());
                        }
                        break;
                        case 5: {
                            System.out.print("Food Price(RM): ");
                            ResMenu.get(i).setPrice(scan.nextLine());
                        }
                        break;
                        case 6: {
                            System.out.print("Food Promotional Rate(%): ");
                            ResMenu.get(i).setPromoRate(scan.nextLine());
                        }
                        break;
                    }
                    System.out.println("\n\nFood Detail Updated Successfully!!!");
                    System.out.println("\n****** UPDATED FOOD DETAILS ******");

                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Food ID  Food Name                  Description              Food Category     Status     "
                            + "Price(RM)    Promotional Rate(%)");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                    for (int j = 0; j < ResMenu.size(); j++) {

                        Service service = ResMenu.get(j);
                        String str = String.format("%-100s\n", service);
                        System.out.print(str);
                    }
                }

            }
        }

    }

}

