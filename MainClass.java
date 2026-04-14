import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        students[0] = new Student("22001", "Andi", "Informatics Engineering");
        students[1] = new Student("22002", "Budi", "Informatics Engineering");
        students[2] = new Student("22003", "Image", "Business Information System");

        Book[] books = new Book[4];
        books[0] = new Book("B001", "Algorithm", 2020);
        books[1] = new Book("B002", "Database", 2019);
        books[2] = new Book("B003", "Programming", 2021);
        books[3] = new Book("B004", "Physics", 2024);

        Loan[] loans = new Loan[5];
        loans[0] = new Loan(students[0], books[0], 7);  
        loans[1] = new Loan(students[1], books[1], 3);  
        loans[2] = new Loan(students[2], books[2], 10); 
        loans[3] = new Loan(students[2], books[3], 6);  
        loans[4] = new Loan(students[0], books[1], 4); 

        int choices;
        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines (Largest)");
            System.out.println("5. Search by Student NIM");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            choices = sc.nextInt();
            sc.nextLine();
            
            switch (choices) {
                case 1:
                    System.out.println("\nStudent List:");
                    for (int i = 0; i < students.length; i++) {
                        students[i].printStudent();
                    }
                    break;
                case 2:
                    System.out.println("\nBook List:");
                    for (int i = 0; i < books.length; i++) {
                        books[i].printBook();
                    }
                    break;
                case 3:
                    System.out.println("\nLoan Data:");
                    for (int i = 0; i < loans.length; i++) {
                        loans[i].printLending();
                    }
                    break;
                case 4:
                    for (int i = 1; i < loans.length; i++) {
                        Loan key = loans[i];
                        int j = i - 1;
                        while (j >= 0 && loans[j].fine < key.fine) {
                            loans[j + 1] = loans[j];
                            j = j - 1;
                        }
                        loans[j + 1] = key;
                    }
                    System.out.println("\nAfter sorting (Largest fine):");
                    for (int i = 0; i < loans.length; i++) {
                        loans[i].printLending();
                    }
                    break;
                case 5:
                    System.out.print("Enter NIM: ");
                    String cariNim = sc.nextLine();
                    boolean found = false;
                    System.out.println("\nSearch Result:");
                    for (int i = 0; i < loans.length; i++) {
                        if (loans[i].std.nim.equals(cariNim)) {
                            loans[i].printLending();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Data not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choices != 0);
    }
}
