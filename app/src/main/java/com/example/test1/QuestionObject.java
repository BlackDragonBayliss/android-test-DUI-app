package com.example.test1;

import java.util.ArrayList;
import java.util.List;

public class QuestionObject {
    private String question, format;
    private List<String> answerList;
    private int id, correctAnswerIndex;
    private boolean isHingeQuestion;
//    private String[] listAnswerHingeQuestionList;
    private ArrayList<ArrayList<QuestionObject>> listAnswerHingeQuestionList = new ArrayList<ArrayList<QuestionObject>>();

    public QuestionObject(String question, List<String> answerList, int correctAnswerIndex, String format, int id,
                          boolean isHingeQuestion, ArrayList<ArrayList<QuestionObject>> listAnswerHingeQuestionList){
        super();
        this.question = question;
        this.answerList = answerList;
        this.correctAnswerIndex = correctAnswerIndex;
        this.format = format;
        this.id = id;
        this.isHingeQuestion = isHingeQuestion;
        this.listAnswerHingeQuestionList = listAnswerHingeQuestionList;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion() {
        return question;
    }
    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }
    public List<String> getAnswerList() {
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