package com.example.test1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class AnswerQuestions extends AppCompatActivity {

    public static QuestionObject questionObject;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions);

        String[] list = {
                "Abundance",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction"
        };
        questionObject = new QuestionObject("What's my name?",list,0,"Dropdown",0);
//        questionObject.setFormat("Dropdown");
//        val newQuestion = new QuestionObject();
        //generate questions
//        val listQuestionObjects = [new Ques]

//        public class Main {

//            newT.hour = 3;
//        }

//        val questionObject = questionFactory("hey fella", arrayOf("AnswerData","Hero"),"Dropdown")
//        val questionObject = questionFactory("hey fella", arrayOf("AnswerData","Hero"),"MultipleChoice")
//        val personNames = questionObject.answerData
        if(questionObject.getFormat() == "Dropdown"){
//            QuestionDropdownFragment fragment = new QuestionDropdownFragment();
//            manager = supportFragmentManager;
//            val transaction = manager.beginTransaction();
//            transaction.replace(R.id.frag_content, fragment);
//            transaction.commit();

            FragmentManager manager = getSupportFragmentManager();
            QuestionDropdownFragment fragment = new QuestionDropdownFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }

//        if(questionObject.questionFormat == "MultipleChoice") {
////            val fragment = QuestionMultipleChoiceFragment();
////            val manager = supportFragmentManager;
////            val transaction = manager.beginTransaction();
////            transaction.replace(R.id.frag_content, fragment);
////            transaction.commit();
//
//            FragmentManager manager = getSupportFragmentManager();
//            QuestionMultipleChoiceFragment fragment = new QuestionMultipleChoiceFragment();
//            FragmentTransaction transaction = manager.beginTransaction();
//            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
//            transaction.commit();
//        }

    }

    public QuestionObject getQuestion(){
        return questionObject;
    }
//private fun questionFactory(questionText: String, answerData: Array<String>, questionFormat: String) =
//        object {
//        val questionText = questionText
//        val answerData = answerData
//        val questionFormat = questionFormat
//        }
}