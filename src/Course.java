public class Course {
    private String courseName;
    private Instructor instructorOne;
    private Instructor instructorTwo;
    private Textbook textbookOne;
    private Textbook textbookTwo;

    public Course(String courseName, Instructor instructorOne, Instructor instructorTwo, Textbook textbookOne, Textbook textbookTwo) {
        this.courseName = courseName;
        this.instructorOne = instructorOne;
        this.instructorTwo = instructorTwo;
        this.textbookOne = textbookOne;
        this.textbookTwo = textbookTwo;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructorOne() {
        return instructorOne;
    }

    public Instructor getInstructorTwo() {
        return instructorTwo;
    }

    public Textbook getTextbookOne() {
        return textbookOne;
    }

    public Textbook getTextbookTwo() {
        return textbookTwo;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorOne(Instructor instructorOne) {
        this.instructorOne = instructorOne;
    }

    public void setInstructorTwo(Instructor instructorTwo) {
        this.instructorTwo = instructorTwo;
    }

    public void setTextbookOne(Textbook textbookOne) {
        this.textbookOne = textbookOne;
    }

    public void setTextbookTwo(Textbook textbookTwo) {
        this.textbookTwo = textbookTwo;
    }

    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor One: " + instructorOne.getFirstName() + " " + instructorOne.getLastName() + " Office: " + instructorOne.getOfficeNumber());
        System.out.println("Instructor Two: " + instructorTwo.getFirstName() + " " + instructorTwo.getLastName() + " Office: " + instructorTwo.getOfficeNumber());
        System.out.println("Textbook One: " + textbookOne.getTitle() + " by " + textbookOne.getAuthor() + " Publisher: " + textbookOne.getPublisher());
        System.out.println("Textbook Two: " + textbookTwo.getTitle() + " by " + textbookTwo.getAuthor() + " Publisher: " + textbookTwo.getPublisher());
    }

}
