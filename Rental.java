public class Rental extends Vehicle{
    double rate;
    int days;
    double total_rent;

    Rental(String brand,int vehicle_no,String model,double price,double rate,int days){
        super(brand,vehicle_no,model,price);
        this.rate = rate;
        this.days = days;
    }

    double calculate_rent(){
        total_rent = rate * days;
        return total_rent;
    }

    void rental_display(){
        System.out.println("Rent per day:" + rate + ", No. of days:" + days);
    }
}
