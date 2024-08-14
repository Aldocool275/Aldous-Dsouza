public class StartUp {
    public static void main(String[] args) {
        Player p1 = new Player("Rohit Sharma","Mumbai");
        Player p2 = new Player("Virat Kohli","Delhi",36,1.8f);
        Player p3 = new Player();
        Player p4 = new Player("Suryakumar Yadav","Mumbai",33,1.77f);

        System.out.println("Number of players:" + Player.count);
        p1.player_display();
        p2.player_display();
        p3.player_display();
        p4.player_display();

    }
}
