import java.util.Scanner;

public class Library {

    static class Book {
        String title;
        String author;
        String subject;
        int publishedYear;

        public Book(String title, String author, String subject, int publishedYear) {
            this.title = title;
            this.author = author;
            this.subject = subject;
            this.publishedYear = publishedYear;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getSubject() {
            return subject;
        }

        public int getPublishedYear() {
            return publishedYear;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Subject: " + subject + ", Published Year: " + publishedYear;
        }
    }

    static class Student {
        String name;
        String studentId;
        String borrowedBook;

        public Student(String name, String studentId, String borrowedBook) {
            this.name = name;
            this.studentId = studentId;
            this.borrowedBook = borrowedBook;
        }

        public String getName() {
            return name;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getBorrowedBook() {
            return borrowedBook;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Student ID: " + studentId + ", Borrowed Book: " + borrowedBook;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 1951);
        Book book2 = new Book("1984", "George Orwell", "Fiction", 1949);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1925);

        Student student1 = new Student("Alice", "1001", "");
        Student student2 = new Student("Bob", "1002", "");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Enter 'list' to list all books, 'borrow' to borrow a book, 'return' to return a book, or 'quit' to quit.");

        while (true) {
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("list")) {
                System.out.println("Book 1: " + book1);
                System.out.println("Book 2: " + book2);
                System.out.println("Book 3: " + book3);
            } else if (command.equalsIgnoreCase("borrow")) {
                System.out.println("Enter the name of the student:");
                String studentName = scanner.nextLine();
                System.out.println("Enter the title of the book:");
                String bookTitle = scanner.nextLine();

                if (studentName.equalsIgnoreCase(student1.getName())) {
                    if (student1.getBorrowedBook().equals("")) {
                        if (bookTitle.equalsIgnoreCase(book1.getTitle())) {
                            student1.borrowedBook = book1.getTitle();
                            System.out.println("Book borrowed successfully.");
                        } else if (bookTitle.equalsIgnoreCase(book2.getTitle())) {
                            student1.borrowedBook = book2.getTitle();
                            System.out.println("Book borrowed successfully.");
                        } else if (bookTitle.equalsIgnoreCase(book3.getTitle())) {
                            student1.borrowedBook = book3.getTitle();
                            System.out.println("Book borrowed successfully.");
                        } else {
                            System.out.println("Invalid book title. Please try again.");
                        }
                    } else {
                        System.out.println("Student already has a borrowed book. Please return it first.");
                    }
                } else if (studentName..println("Student already has a borrowed book. Please return it first.");
                    }
                }equalsIgnoreCase(student2.getName())) {
                    if (student else if (studentName.equalsIgnoreCase(student2.getName())) {
2.getBorrowedBook().equals("")) {
                        if (bookTitle.equalsIgnoreCase(book                    if (student2.getBorrowedBook1.getTitle())) {
                            student2.borrowedBook = book().equals("")) {
                        if (bookTitle.equalsIgnoreCase(book1.1.getTitle();
                            System.out.println("Book borrowed successfully.");
                        }getTitle())) {
                            student2.borrowedBook = book1.getTitle();
                            System.out.println(" else if (bookTitle.equalsIgnoreCase(book2.getTitle())) {
                            student2.borrowedBook =Book borrowed successfully book2.getTitle.");
                        } else if (bookTitle.();
                            System.out.println("Book borrowed successfully.");equalsIgnoreCase(book2.getTitle()))
                        } else if (bookTitle.equalsIgnore {
                            student2.Case(book3.getTitle())) {
                borrowedBook = book2.getTitle();
                                       student2.borrowedBook = book3. System.out.println("BookgetTitle();
                            System.out. borrowed successfully.");
                        } else if (bookTitleprintln("Book borrowed successfully.");
                        } else {.equalsIgnoreCase(book3.getTitle())) {
                            System.out.println("Invalid book title. Please
                            student2.borrowedBook = book try again.");
                        }
                    } else {3.getTitle();
                
                        System.out.println("Student already has            System.out.println("Book borrowed successfully."); a borrowed book. Please return it first.");
                   
                        } else {
                            System.out.println }
                } else {
                    System.out.("Invalid book title. Please try again.");
                       println("Invalid student name. Please try again.");
                }
                    } else {
                        System.out. }
            } else if (command.equalsIgnoreCase("return")) {println("Student already has a borrowed book. Please return it first
                System.out.println("Enter the name of the student:");
.");
                    }
                } else                String studentName = scanner.nextLine();

                if (student {
                    System.out.println("Invalid student name. Please try againName.equalsIgnoreCase(student1.getName())) {.");
                }
            } else if (command.
                    if (!student1.getBorrowedBook().equals("equalsIgnoreCase("return")) {
                System.out.")) {
                        student1.borrowedBook = "";
                       println("Enter the name of the student:");
                String studentName System.out.println("Book returned successfully.");
                    } else = scanner.nextLine();

                if {
                        System.out.println("Student does not (studentName.equalsIgnoreCase(student1.getName())) {
 have any borrowed books.");
                    }
                } else if                    if (!student1.getBorrowedBook().equals(" (studentName.equalsIgnoreCase(student2.getName())) {
                    if")) {
                        student1.borrowedBook = "";
                 (!student2.getBorrowedBook().equals("")) {
                        student2        System.out.println("Book returned successfully.");
                   .borrowedBook = "";
                        System.out } else {
                        System.out.println("Student does.println("Book returned successfully.");
                    } else {
                        System.out. not have any borrowed books.");
                    }
                } else if (studentNameprintln("Student does not have any borrowed books.");
                    }
               .equalsIgnoreCase(student2.getName())) {
                    } else {
                    System.out.println("Invalid student name. Please try again.");
                } if (!student2.getBorrowedBook().equals("")) {
                        student
            } else if (command.equalsIgnoreCase("quit")) {
                System.out.println2.borrowedBook = "";
                        System.out.println("Book returned("Thank you for using the Library Management System! Have a great day!");
                break;
            } successfully.");
                    } else {
                        System. else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
out.println("Student does not have any borrowed books.");
                    }
                } else {
                    System.out.println("Invalid student name. Please try again.");
                }
            } else if (command.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for using the Library Management System!");
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
}