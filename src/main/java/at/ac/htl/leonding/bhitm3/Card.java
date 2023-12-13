package at.ac.htl.leonding.bhitm3;

public class Card {
    private int id;
    private Subject subject;
    private Teacher teacher;

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject(){
        return this.subject;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }
}
