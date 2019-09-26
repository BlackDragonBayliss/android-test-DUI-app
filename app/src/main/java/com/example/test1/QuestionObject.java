package com.example.test1;

public class QuestionObject {
    private String question, answer;
    private int id, type;

    public QuestionObject(){
        super();
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestions() {
        return question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
}