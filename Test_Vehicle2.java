public class Test_Vehicle2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Bike b1 = new Bike();

        c1.start();
        c1.change_gear(1);
        c1.speed_up();
        c1.change_gear(2);
        c1.speed_up();
        c1.change_gear(3);
        c1.speed_up();
        c1.change_gear(4);
        c1.speed_up();
        c1.change_gear(5);
        c1.speed_up();
        c1.apply_break();
        c1.apply_break();
        c1.change_gear(4);
        c1.speed_up();

        b1.start();
        b1.change_gear(1);
        b1.speed_up();
        b1.change_gear(2);
        b1.speed_up();
        b1.change_gear(3);
        b1.speed_up();
        b1.change_gear(4);
        b1.speed_up();
        b1.change_gear(5);
        b1.speed_up();
        b1.apply_break();
        b1.apply_break();
        b1.change_gear(4);
        b1.speed_up();
    }
}
