public class Circle {
    double radius;
    final double pi = 3.14;
    double area;

    Circle(double r){
        radius = r;
    }

    void calculate_area(){
        area = pi * (radius * radius);
    }

    void display_area(){
        System.out.println("Area of a Circle:" + area);
    }
}
