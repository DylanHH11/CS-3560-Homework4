public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("instructor", "Two", "10-1234");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Book2", "AuthorTwo", "PublisherTwo");

        Course course = new Course("CS 3560", instructor1, textbook1);

        course.print();
        System.out.println();

        System.out.println("Instructor Two Name and Office: ");
        System.out.println("Name: " + instructor2.getFirstName() + " " + instructor2.getLastName() + " Office: " + instructor2.getOfficeNumber());
        System.out.println("Textbook two title, author, and publisher:");
        System.out.println("Title: " + textbook2.getTitle() + " Author: " + textbook2.getAuthor() + " Publisher: " + textbook2.getPublisher());
    }
}