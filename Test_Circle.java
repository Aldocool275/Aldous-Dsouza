public class Test_Circle{
    public static void main(String args[]){
        Circle c1 = new Circle(14);
        Circle c2 = new Circle(7);
        Circle c3 = new Circle(18);

        c1.calculate_area();
        c1.display_area();
        c2.calculate_area();
        c2.display_area();
        c3.calculate_area();
        c3.display_area();
    }
}