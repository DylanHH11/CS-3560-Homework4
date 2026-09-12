public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("instructor", "Two", "10-1234");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Book2", "Author", "PublisherTwo");

        Course course = new Course("CS 3560", instructor1, instructor2, textbook1, textbook2);

        course.print();
    }
}