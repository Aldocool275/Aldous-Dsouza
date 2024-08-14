public class Test_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(15);
        Rectangle r3 = new Rectangle(20, 17);
        
        r1.calculate_area();
        r1.display_area();
        r2.calculate_area();
        r2.display_area();
        r3.calculate_area();
        r3.display_area();
    }
}
