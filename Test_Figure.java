public class Test_Figure {
    public static void main(String[] args) {
        Cone c1 = new Cone();

        c1.calculate_area();
        c1.calculate_volume();

        double a = c1.display_area();
        System.out.println("Area of the Cone is " + a);
        double v = c1.display_volume();
        System.out.println("Volume of the Cone is " + v);
    }
}
