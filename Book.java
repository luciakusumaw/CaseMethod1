public class Book {
    String code;
    String title;
    int year;

    public Book (String code, String title, int year) {
        this.code = code;
        this.title= title;
        this.year = year;
    }

    public void printBook() {
        System.out.println("Code: "+ code +" | Title: " +title+ " | Year: " + year);
    } 
}
