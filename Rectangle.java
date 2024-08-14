public class Rectangle {
    int length;
    int breadth;
    int area;

    Rectangle(){
        length = 18;
        breadth = 13;
    }

    Rectangle(int l){
        length = l;
        breadth = 12;
    }

    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }

    void calculate_area(){
        area = length * breadth;
    }

    void display_area(){
        System.out.println("Area of Rectangle:" + area);
    }
}
