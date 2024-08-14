public class Manager extends Permanent {
    String vehicle;
    double advance_pay;

    Manager(int empid,String empname,String empaddress,double bs,double da,double hra,double ta,String vehicle,double advance_pay){
        super(empid,empname,empaddress,bs,da,hra,ta);
        this.vehicle = vehicle;
        this.advance_pay = advance_pay;
    }

    void manager_display(){
        System.out.println("Vehicle:" + vehicle + ", Advance Payment:" + advance_pay);
    }
}
