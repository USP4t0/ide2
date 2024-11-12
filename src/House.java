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

    public double calculateMortgagePayment(){
        double principal = price - downPayment;
        double monthRate = mortgageRate / 100 / 12;


        double mortgagePayment = ((principal * monthRate) / (1 - Math.pow(1 + monthRate,(-30 * 12))));
        return mortgagePayment;
    }


    public double calculateTotalCost(){
        double totalCost = (this.calculateMortgagePayment() * 360) + downPayment;
        return totalCost;
    }


    public void printHouseDetails(){

        System.out.println("House Address: " + address);
        System.out.printf("Price: $%.2f%n", price);
        if (downPayment == 0){System.out.println("Down Payment: N/A");}
        else{System.out.printf("Down Payment: $%.2f%n", downPayment);}
        if (mortgageRate == 0){System.out.println("Mortgage Rate: N/A");}
        else{System.out.println("Mortgage Rate: " + mortgageRate + "%");}
        if (downPayment == 0 && mortgageRate == 0){System.out.println("Monthly Mortgage Payment: N/A");}
        else{System.out.printf("Monthly Mortgage Payment: $%.2f%n", this.calculateMortgagePayment());}
        if (downPayment == 0 && mortgageRate == 0){System.out.println("Total Cost of House (including interest): N/A");}
        else{System.out.printf("Total Cost of House (including interest): $%.2f%n\n", this.calculateTotalCost());}

    }



}
