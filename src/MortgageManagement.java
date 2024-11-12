import java.util.ArrayList;
import java.util.Scanner;

public class MortgageManagement {

    public static void main(String[] args) {
        ArrayList<House> houseList = new ArrayList<House>();
        Scanner scnr = new Scanner(System.in);


        while (true){
            System.out.println("\nWelcome to the Real Estate Listings Management System");
            System.out.println("1. Add Property with Address and Price");
            System.out.println("2. Add Property with Full Details");
            System.out.println("3. Display All Houses");
            System.out.println("4. Update House Details (except Address)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scnr.nextInt();
            scnr.nextLine();




            switch (choice) {
                case 1:
                    //Add house with address and price only
                    System.out.print("Enter house address: ");
                    String address = scnr.nextLine();
                    System.out.print("Enter house price: ");
                    double price = scnr.nextDouble();
                    House basicHouse = new House(address, price);
                    houseList.add(basicHouse);
                    System.out.print("Property with address and price added.");
                    break;
                case 2:
                    //Add house with full details
                    System.out.print("Enter house address: ");
                    String fullAddress = scnr.nextLine();
                    System.out.print("Enter house price: ");
                    double fullPrice = scnr.nextDouble();
                    System.out.print("Enter down payment: ");
                    double fullDown = scnr.nextDouble();
                    System.out.print("Enter mortgage rate (%): ");
                    double fullMortgage = scnr.nextDouble();
                    House fullHouse = new House(fullAddress, fullPrice, fullDown, fullMortgage);
                    houseList.add(fullHouse);
                    System.out.println("Property with full details added.");
                    break;
                case 3:
                    //Prints information of all houses in list
                    if (houseList.size() > 0){
                    for (int i = 0; i < houseList.size(); ++i) {
                        houseList.get(i).printHouseDetails();
                    }}
                    else {
                        System.out.println("No houses to display");
                    }
                    break;
                case 4:
                    int houseNum = -1;
                    System.out.print("Enter the address of the house to update: ");
                    String addressGet =  scnr.nextLine();
                    for (int i = 0; i < houseList.size(); ++i) {
                        if (houseList.get(i).getAddress().equals(addressGet)){
                            houseNum = i;
                        }
                    }
                    if (houseNum == -1){
                        System.out.println("House not found.");
                }
                    else {
                        System.out.print("Enter new price: ");
                        double newPrice = scnr.nextDouble();
                        houseList.get(houseNum).setPrice(newPrice);

                        System.out.print("Enter new down payment: ");
                        double newDown = scnr.nextDouble();
                        houseList.get(houseNum).setDownPayment(newDown);

                        System.out.print("Enter new mortgage rate (%): ");
                        double newMortgage = scnr.nextDouble();
                        houseList.get(houseNum).setMortgageRate(newMortgage);

                        System.out.println("House details updated.");
                        houseList.get(houseNum).printHouseDetails();
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }
}
