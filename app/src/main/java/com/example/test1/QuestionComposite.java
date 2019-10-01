package com.example.test1;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionComposite {
    private ArrayList<QuestionObject> questionObjectList = new ArrayList<QuestionObject>();

    public QuestionComposite(){
        super();
//        this.question = question;
//        this.answerList = answerList;
//        this.correctAnswerIndex = correctAnswerIndex;
//        this.format = format;
//        this.id = id;
        populateStandardQuestionList();
    }
    private void populateStandardQuestionList(){
//        questionObjectList.add(new QuestionObject{});
//        List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
//        QuestionObject questionObject = new QuestionObject("What is your age?", Arrays.asList("Buenos Aires", "Córdoba", "La Plata"), 0, "editTextNumber",0,false,null);

        questionObjectList.add(new QuestionObject("What is your age?", Arrays.asList("Buenos Aires", "Córdoba", "La Plata"), 0, "editTextNumber",0,false,null));

        //continue adding questions, add hinge questions, test hingeQuestion population process



        //        questionObjectList.add(new QuestionObject{"What is your age?", new ArrayList<String>().add(""), 0, "editTextNumber",0,false,null});
//        questionObjectList.add(new QuestionObject{});
//        questionObjectList.add(new QuestionObject{});
//        questionObjectList.add(new QuestionObject{});
    }

    public void appendHingeQuestionToQuestionList(ArrayList<QuestionObject> hingeQuestionList){
        for (QuestionObject question : hingeQuestionList){
            this.questionObjectList.add(question);
        }
    }



//    private int id, correctAnswerIndex;

//    public QuestionComposite(String question, String[] answerList, int correctAnswerIndex, String format, int id){
//        super();
//        this.question = question;
//        this.answerList = answerList;
//        this.correctAnswerIndex = correctAnswerIndex;
//        this.format = format;
//        this.id = id;
//    }

    //handle list A
    //Handle list B
    //Handle list C

    //Build forward fill in backward, move forward.
    //A way to dynamically bind a question answer
    //with another question.

    //If answering questions of a linear list, it should proceed as normal,
    //Unless a hinge question is met then it will require other questions to be answered.
    //and if another question is met then another hinge and so on....

    //Must determine hinge questions, if a hinge question is met, then that hinge question question list,
    //will be appeneded to the rest of the question list.

    //to be answered. so, there is a main quesiton list, a standard question list, and if certain
    //hinge questions are answered, their answer's will add more questions to the question list,
    //to be answered sequentially.

    //so need a manager, to control the question addition process,
    // intake question, if isHinge question, (containing list of questions) for answers,
    //answers containing --- dynamically added listAnswerHingeQuestionList



    //Every hinge question has answers, that have a corresponding list of questions
    // and some of those questions may be hinge questions
    //
    //All questions, all choices, all questions hinge answers... all of this must
    //be statically programmed.
    //
    //






    //Question Builder algorithm.

    //
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//    public String getQuestion() {
//        return question;
//    }
//    public void setAnswerList(String[] answerList) {
//        this.answerList = answerList;
//    }
//    public String[] getAnswerList() {
//        return answerList;
//    }
//    public void setCorrectAnswerIndex(int correctAnswerIndex){
//        this.correctAnswerIndex = correctAnswerIndex;
//    }
//    public int getCorrectAnswerIndex(){
//        return this.correctAnswerIndex;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setFormat(String format) {
//        this.format = format;
//    }
//    public String getFormat() {
//        return format;
//    }
}