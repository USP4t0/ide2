import java.util.ArrayList;
import java.util.Scanner;

public class MortgageManagement {

    public static void main(String[] args) {
        ArrayList<House> houseList = new ArrayList<House>();
        Scanner scnr = new Scanner(System.in);


        while (true){
            System.out.println("\nReal Estate Listings Management System");
            System.out.println("1. Add Property with Address and Price");
            System.out.println("2. Add Property with Full Details");
            System.out.println("3. Display All Houses");
            System.out.println("4. Update House Details (except Address)");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scnr.nextInt();
            scnr.nextLine();


        }
    }
}
