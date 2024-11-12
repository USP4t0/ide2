public class House {
    private String address;
    private double price;
    private double downPayment;
    private double mortgageRate;

    //Basic constructor
    public House(String houseAddress, double housePrice){
        address = houseAddress;
        price = housePrice;
    }

    //Fully parameterized constructor
    public House(String houseAddress, double housePrice, double houseDown, double houseMortgage){
    address = houseAddress;
    price = housePrice;
    downPayment = houseDown;
    mortgageRate = houseMortgage;
    }





}
