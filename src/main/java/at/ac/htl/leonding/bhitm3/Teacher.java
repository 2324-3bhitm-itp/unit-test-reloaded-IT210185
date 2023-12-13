package at.ac.htl.leonding.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {

    private int id;
    private Subject subject;
    List<Card> cards = new LinkedList<>();

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject(){
        return this.subject;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void addCard(Card card) {
        cards.remove(id);
    }

    public void removeCard(Card card) {
        card.setTeacher(null);
    }
}