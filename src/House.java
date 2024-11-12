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

    //Mutators and Accessors
    public String getAddress(){return address;}
    public double getPrice(){return price;}
    public double getDownPayment(){return downPayment;}
    public double getMortgageRate(){return mortgageRate;}
    public void setAddress(String houseAddress){address = houseAddress;}
    public void setPrice(double housePrice){price = housePrice;}
    public void setDownPayment(double houseDown){downPayment = houseDown;}
    public void setMortgageRate(double houseMortgage){mortgageRate = houseMortgage;}




}
