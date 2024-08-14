public class Bike implements Vehicle2{
    boolean start;
    int gear;
    double speed;

    @Override
    public void start(){
        start = true;
    }

    @Override
    public void change_gear(int a){
        if(start == true){
            gear = a;
            System.out.println("Gear changed to " + gear);
        }else{
            System.out.println("Bike has not started...");
        }
    }

    @Override
    public void speed_up(){
        if(gear == 1){
            speed = 10;
            System.out.println("Bike is at a speed of " + speed + "kph");
        }else if(gear == 2){
            speed = 30;
            System.out.println("Bike is at a speed of " + speed + "kph");
        }else if(gear == 3){
            speed = 50;
            System.out.println("Bike is at a speed of " + speed + "kph");
        }else if(gear == 4){
            speed = 70;
            System.out.println("Bike is at a speed of " + speed + "kph");
        }else if(gear == 5){
            speed = 80;
            System.out.println("Bike is at a speed of " + speed + "kph");
        }else{
            System.out.println("Bike is in neutral mode...");
        }
    }

    @Override
    public void apply_break(){
        gear -= 1;
        speed -= 10;
        System.out.println("Gear changed to " + gear);
        System.out.println("Bike is at a speed of " + speed + "kph");
    }
}
