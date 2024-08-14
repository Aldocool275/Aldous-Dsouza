public class Client {
    public static void main(String[] args) {
        Song s1 = new Song();
        Song s2 = new Song("Kesariya", "Arijit Singh", "Romance", 2022);
        Song s3 = new Song();
        Song s4 = new Song();

        s3.enter();

        s1.song_display();
        s2.song_display();
        s3.song_display();
        s4.song_display("Faded","Alan Walker","EDM",2019);

    }
}
