package at.ac.htl.leonding.bhitm3;

public class Student extends Person {
    String studentID;
    Teacher teacher;

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public Object getStudentID(){
        return this.studentID;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }
}
