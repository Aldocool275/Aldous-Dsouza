public class Player {
    String player_name;
    String address;
    int age;
    float height;
    static int count = 0;

    Player(){
        count++;
        player_name = "Jasprit Bumrah";
        address = "Jamnagar";
        age = 31;
        height = 1.78f;
    }

    Player(String player_name,String address){
        count++;
        this.player_name = player_name;
        this.address = address;
        age = 37;
        height = 1.74f;
    }

    Player(String player_name,String address,int age,float height){
        count++;
        this.player_name = player_name;
        this.address = address;
        this.age = age;
        this.height = height;
    }

    void player_display(){
        System.out.println("Name:" + player_name + ",Address:" + address + ",Age:" + age + ",Height:" + height);
    }
}
