public class Course {
    private String courseName;
    private Instructor instructorOne;
    private Textbook textbookOne;

    public Course(String courseName, Instructor instructorOne, Textbook textbookOne) {
        this.courseName = courseName;
        this.instructorOne = instructorOne;
        this.textbookOne = textbookOne;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructorOne() {
        return instructorOne;
    }



    public Textbook getTextbookOne() {
        return textbookOne;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorOne(Instructor instructorOne) {
        this.instructorOne = instructorOne;
    }



    public void setTextbookOne(Textbook textbookOne) {
        this.textbookOne = textbookOne;
    }



    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor One: " + instructorOne.getFirstName() + " " + instructorOne.getLastName() + " Office: " + instructorOne.getOfficeNumber());
        System.out.println("Textbook One: " + textbookOne.getTitle() + " by " + textbookOne.getAuthor() + " Publisher: " + textbookOne.getPublisher());
    }

}
