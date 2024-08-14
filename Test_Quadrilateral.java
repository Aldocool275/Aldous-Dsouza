public class Test_Quadrilateral {
    public static void main(String[] args) {
        Square s1 = new Square();
        Rectangle2 r1 = new Rectangle2();
        
        double s = s1.computeArea();
        System.out.println("Area of Square is " + s);
        double r = r1.computeArea();
        System.out.println("Area of Rectangle is " + r);
    }
}
