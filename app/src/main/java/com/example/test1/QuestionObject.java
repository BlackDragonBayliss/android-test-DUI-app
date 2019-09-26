package com.example.test1;

public class QuestionObject {
    private String question, format;
    private String[] answerList;
    private int id, correctAnswerIndex;

    public QuestionObject(String question, String[] answerList, int correctAnswerIndex, String format, int id){
        super();
        this.question = question;
        this.answerList = answerList;
        this.correctAnswerIndex = correctAnswerIndex;
        this.format = format;
        this.id = id;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestions() {
        return question;
    }
    public void setAnswerList(String[] answerList) {
        this.answerList = answerList;
    }
    public String[] getAnswerList() {
        return answerList;
    }
    public void setCorrectAnswerIndex(int correctAnswerIndex){
        this.correctAnswerIndex = correctAnswerIndex;
    }
    public int getCorrectAnswerIndex(){
        return this.correctAnswerIndex;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getFormat() {
        return format;
    }
}