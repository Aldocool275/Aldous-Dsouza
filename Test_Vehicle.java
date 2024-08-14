public class Test_Vehicle {
    public static void main(String[] args) {
        Rental r1 = new Rental("Honda", 5351,"Activa 6G", 90000, 500, 4);
        Rental r2 = new Rental("Yamaha",7891,"Fascino",66000,800,9);

        r1.getVehicleName();
        r1.price();
        System.out.println("Total Rent:" + r1.calculate_rent());
        r1.rental_display();

        System.out.println("\n");
        r2.getVehicleName();
        r2.price();
        System.out.println("Total Rent:" + r2.calculate_rent());
        r2.rental_display();
    }
}
