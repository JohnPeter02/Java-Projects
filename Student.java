public class Student extends Person{
    static String ID;
    static String Course;
    boolean isEnrolled;

    Student(Person p, String ID, String Course){
        super(Name);
        Student.ID = ID;
        Student.Course = Course;
    }

    void ID (String ID) {
        Student.ID = ID;
    }

    void setCourse (String Course) {
        Student.Course = Course;
    }

    String getID () { 
        return ID;
    }

    String getCourse() {
        return Course;
    }

    void setEnroll(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    boolean Enroll() {
        return true;
    }

    boolean isEnrolled() {
        return true;
    }
}
