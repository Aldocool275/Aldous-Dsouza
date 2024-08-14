public class Test_Bill {
    public static void main(String[] args) {
        Elec_Bill e1 = new Elec_Bill();
        Elec_Bill e2 = new Elec_Bill();

        double r = e1.get_rate();
        System.out.println("Rate Per Unit is " + r);
        e1.computeBill(20);
        double b = e1.getBill();
        System.out.println("Your Electricity Bill for this month is Rs." + b);

        r = e2.get_rate();
        System.out.println("Rate Per Unit is " + r);
        e2.computeBill(45);
        b = e2.getBill();
        System.out.println("Your Electricity Bill for this month is Rs." + b);
        
    }
}
