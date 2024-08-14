public class Test_Book {
    public static void main(String[] args) {
        Fiction f1 = new Fiction();
        NonFiction n1 = new NonFiction();

        f1.setbook(101,"Harry Potter and the Philosopher's Stone",223,"Fictional","Bloomsbury");
        n1.setbook(102,"The Diary of a Young Girl",328,"Non Fictional","Fingerprint publishing");
        f1.getbook();
        n1.getbook();
    }
}
