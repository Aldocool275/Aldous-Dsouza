public class NonFiction extends Book{
    
    void setbook(int bookid,String title,int pages,String type,String publisher){
        this.bookid = bookid;
        this.title = title;
        this.pages = pages;
        this.type = type;
        this.publisher = publisher;
    }

    void getbook(){
        System.out.println("Book ID:" + bookid + ", Title:" + title + ", Number Of pages:" + pages + ", Book Type:" + type + ", Publisher:" + publisher);
    }
}
