public class Vehicle {
    String brand;
    int vehicle_no;
    String model;
    double price;

    Vehicle(String brand,int vehicle_no,String model,double price){
        this.brand = brand;
        this.vehicle_no = vehicle_no;
        this.model = model;
        this.price = price;
    }

    public void getVehicleName(){
        System.out.println("Brand:" + brand + " ,Vehicle Number:" + vehicle_no + " ,Model:" + model);
    }

    public double price(){
        return price;
    }
}
