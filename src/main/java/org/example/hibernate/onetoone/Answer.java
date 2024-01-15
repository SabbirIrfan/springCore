package org.example.hibernate.onetoone;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;

import java.security.PrivateKey;
@Entity
public class Answer {

    @Id
    @Column(name = "answer_Id")
    private int answerId;
    private String answer;
    @ManyToOne
    Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
    }

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }



    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
