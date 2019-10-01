package com.example.test1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class AnswerQuestions extends AppCompatActivity {

    private static QuestionObject questionObject;
    private int questionIndex;
//    private static QuestionObject[] questionObjectList;

    private static List<QuestionObject> questionObjectList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions);

        questionIndex = 0;

//        String[] list = {
//                "Abundance",
//                "Anxiety",
//                "Bruxism",
//                "Discipline",
//                "Drug Addiction"
//        };
        List<String> listGender = new ArrayList<String>();
//        ArrayList<ArrayList<QuestionObject>> listAnswerHingeQuestionList = new ArrayList<ArrayList<QuestionObject>>();

        listGender.add("Male");
        listGender.add("Female");

        List<String> numberDUIList = new ArrayList<String>();
        numberDUIList.add("1");
        numberDUIList.add("2");
        numberDUIList.add("3");
        numberDUIList.add("4");

        List<String> countyDUIList = new ArrayList<String>();
        numberDUIList.add("Weld");
        numberDUIList.add("Boulder");
        numberDUIList.add("Alamosa");

        questionObject = new QuestionObject("What is your gender?",listGender,0,"MultipleChoice",0, false, null);
        QuestionObject questionObject1 = new QuestionObject("What's the total number of DUI's have you had including this one??",numberDUIList,0,"MultipleChoice",0, false, null);
        QuestionObject questionObject2 = new QuestionObject("What county did you receive the DUI?",countyDUIList,1,"Dropdown",0, false, null);





        //        QuestionObject questionObject1 = new QuestionObject("What is your legal gender?",list,0,"MultipleChoice",0);

        questionObjectList.add(questionObject);
        questionObjectList.add(questionObject1);
        questionObjectList.add(questionObject2);

//        questionObjectList.add(
//                new QuestionObject("What is your problem?",list,0,"MultipleChoice",0, false, null));



        if(questionObjectList.get(questionIndex).getFormat() == "Dropdown"){
            FragmentManager manager = getSupportFragmentManager();
            QuestionDropdownFragment fragment = new QuestionDropdownFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }

        if(questionObjectList.get(questionIndex).getFormat() == "MultipleChoice") {
//            val fragment = QuestionMultipleChoiceFragment();
//            val manager = supportFragmentManager;
//            val transaction = manager.beginTransaction();
//            transaction.replace(R.id.frag_content, fragment);
//            transaction.commit();

            FragmentManager manager = getSupportFragmentManager();
            QuestionMultipleChoiceFragment fragment = new QuestionMultipleChoiceFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }
    }

    public QuestionObject getQuestion(){
        QuestionObject question = questionObjectList.get(questionIndex);
        return question;
    }

    public void nextQuestion(){
        questionIndex++;

        if(questionObjectList.get(questionIndex).getFormat() == "Dropdown"){
            FragmentManager manager = getSupportFragmentManager();
            QuestionDropdownFragment fragment = new QuestionDropdownFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }
        if(questionObjectList.get(questionIndex).getFormat() == "MultipleChoice") {

            FragmentManager manager = getSupportFragmentManager();
            QuestionMultipleChoiceFragment fragment = new QuestionMultipleChoiceFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }
        if(questionObjectList.get(questionIndex).getFormat() == "EditText") {
//            val fragment = QuestionMultipleChoiceFragment();
//            val manager = supportFragmentManager;
//            val transaction = manager.beginTransaction();
//            transaction.replace(R.id.frag_content, fragment);
//            transaction.commit();

            FragmentManager manager = getSupportFragmentManager();
            QuestionEditTextFragment fragment = new QuestionEditTextFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag_content, fragment).addToBackStack(null);
            transaction.commit();
        }
    }
}