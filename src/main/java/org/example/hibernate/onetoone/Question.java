package org.example.hibernate.onetoone;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;

import java.security.PrivateKey;
import java.util.List;

@Entity
public class Question {

    @Id
    @Column(name = "question_id")
    private int questionId;
    private  String question;
    @OneToMany(mappedBy = "question" ,fetch = FetchType.EAGER)
//    @Column(name = "answer_Id")
    private List<Answer> answers;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question() {
    }

    public Question(int questionId, String question, List<Answer> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }



}
