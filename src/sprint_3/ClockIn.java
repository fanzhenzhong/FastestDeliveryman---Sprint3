package sprint_3;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import sprint_3.getSetInformation;
import java.util.ArrayList;


public class ClockIn {

    public static void main(String[] args) {
        ArrayList<getSetInformation> Info = new ArrayList<getSetInformation>();
        int count = 0;
        getSetInformation staffInfo = new getSetInformation(count);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        Date date = new Date();
        String id = "3434",password = "1111",name = "Fan Zhen Zhong",datetime;
        datetime = dateFormat.format(date);
        int selection,chosen;
        Scanner scan = new Scanner(System.in);
        staffInfo.setID(id);
        staffInfo.setName(name);
        staffInfo.setPassword(password);
        Info.add(staffInfo);
        
        System.out.println("---------------- FASTEST DELIVERYMAN -------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n1. Clock In");
        System.out.println("2. Exit");
       
        do{ 
        System.out.print("\nPlaese select : ");
        selection = scan.nextInt(); 
        }while(selection != 1 && selection !=2);
        
       if(selection == 1)
        {
            System.out.println("\n---------------- FANTEST DELIVERYMAN CLOCK IN ----------------");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Please enter your ID : ");
            id = scan.next();
            System.out.print("\nPlease enter your password : ");
            password = scan.next();
        }
        else if(selection == 2)
        {
            System.exit(0);
        }

       if(id.equals(staffInfo.getID()) && password.equals(staffInfo.getPassword()))
       {
           System.out.println("\n-----------CLOCK IN STATUS--------------");
           System.out.println("----------------------------------------");
           System.out.println("\nDATE       TIME      ID     NAME");
           
           for(int i = 0; i < Info.size(); i++)
           {
               staffInfo = Info.get(i);
               String str = String.format("%s\n",staffInfo);
               System.out.print(datetime + "  " + str);
           }
       }    
    }  
}
