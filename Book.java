abstract class Book{
    int bookid;
    String title;
    int pages;
    String type;
    String publisher;

    abstract void setbook(int bookid,String title,int pages,String type,String publisher);
    abstract void getbook();
}