import java.util.*;
public class Cone extends Figure{
    Scanner sc = new Scanner(System.in);
    double height;
    double slant_height;

    void calculate_area(){
        System.out.println("Enter Radius of the cone:");
        radius = sc.nextDouble();
        System.out.println("Enter Slant Height of the cone:");
        slant_height = sc.nextDouble();
        area = (pi * radius) * (radius + slant_height);
    }

    double display_area(){
        return area;
    }

    
    void calculate_volume(){
        System.out.println("Enter Radius of the cone:");
        radius = sc.nextDouble();
        System.out.println("Enter Height of the cone:");
        height = sc.nextDouble();
        volume = 0.33 * pi * radius * radius * height;
    }

    double display_volume(){
        return volume;
    }
}
