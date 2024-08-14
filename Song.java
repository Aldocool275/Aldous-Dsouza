import java.util.*;
public class Song {
    Scanner sc = new Scanner(System.in);
    String song;
    String singer;
    String genre;
    int year;

    Song(){
        song = "Perfect";
        singer = "Ed Sheeran";
        genre = "Pop";
        year = 2017;
    }

    Song(String song,String singer,String genre,int year){
        this.song = song;
        this.singer = singer;
        this.genre = genre;
        this.year = year;
    }

    void enter(){
        System.out.print("Enter Song name:");
        song = sc.nextLine();
        System.out.print("Enter Singer name:");
        singer = sc.nextLine();
        System.out.print("Enter Genre:");
        genre = sc.nextLine();
        System.out.print("Enter Release Year:");
        year = sc.nextInt();
        sc.close();
    }

    void song_display(){
        System.out.println("Song:" + song + ", Singer:" + singer + ", Genre:" + genre + ", Year:" + year);
    }

    
    void song_display(String name,String song,String genre,int year){
        System.out.println("Song:" + song + ", Singer:" + singer + ", Genre:" + genre + ", Year:" + year);
    }
}
