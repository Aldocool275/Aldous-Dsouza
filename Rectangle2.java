import java.util.*;
public class Rectangle2 extends Quadrilateral{
    Scanner sc = new Scanner(System.in);

    double computeArea(){
        System.out.print("Enter length of the rectangle:");
        s1 = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle:");
        s2 = sc.nextDouble();
        return s1 * s2;
    }
}
