public class Loan {
    Student std;
    Book book;
    int loanPeriod;
    int loanLimit = 5;
    int overdue;
    int fine;

   
    public Loan(Student std, Book book, int loanPeriod) {
        this.std = std;
        this.book = book;
        this.loanPeriod = loanPeriod;
    }

 
    public void calculateFine() {
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }

   
    public void printLending() {
        System.out.print(std.name + " | " + book.title + " | ");
        System.out.print("Loan Period (days): " + loanPeriod + " | ");
        System.out.print("Late return of books: " + overdue + " | ");
        System.out.println("fine: " + fine);
    }
}