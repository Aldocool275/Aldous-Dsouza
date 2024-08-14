import java.util.Scanner;

public class Square extends Quadrilateral{
    Scanner sc = new Scanner(System.in);
    double computeArea(){
        System.out.print("Enter side of the square:");
        s1 = sc.nextDouble();
        return s1 * s1;
    }
}
