package com.example.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class QuestionMultipleChoiceFragment extends Fragment {
//    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_multiple_choice_fragment, viewGroup, false);

        TextView questionText = (TextView) view.findViewById(R.id.questionText);
        QuestionObject question = ((AnswerQuestions) getActivity()).getQuestion();
        questionText.setText(question.getQuestion());

        Button buttonChoice1 = (Button)view.findViewById(R.id.choice1);
        Button  buttonChoice2 = (Button)view.findViewById(R.id.choice2);
//        Button buttonChoice3 = (Button)view.findViewById(R.id.choice3);
//        Button buttonChoice4 = (Button)view.findViewById(R.id.choice4);

        buttonChoice1.setText(question.getAnswerList().get(0));
        buttonChoice2.setText(question.getAnswerList().get(1));
//        buttonChoice3.setText(question.getAnswerList().get(2));
//        buttonChoice4.setText(question.getAnswerList().get(3));

        //Start of Button Listener for Button1
        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

//                if (mButtonChoice1.getText() == mAnswer){
//                    mScore = mScore + 1;
//                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
//                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

//                }else {
////                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
//                    updateQuestion();
//                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        buttonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

//                if (mButtonChoice2.getText() == mAnswer){
//                    mScore = mScore + 1;
//                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
//                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

//                }else {
////                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
//                    updateQuestion();
//                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
//        buttonChoice3.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //My logic for Button goes in here
//
////                if (mButtonChoice3.getText() == mAnswer){
////                    mScore = mScore + 1;
////                    updateScore(mScore);
//                    updateQuestion();
//                    //This line of code is optiona
////                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
//
////                }else {
//////                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
////                    updateQuestion();
////                }
//            }
//        });
//
//        buttonChoice4.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //My logic for Button goes in here
//
////                if (mButtonChoice3.getText() == mAnswer){
////                    mScore = mScore + 1;
////                    updateScore(mScore);
//                updateQuestion();
//                //This line of code is optiona
////                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
//
////                }else {
//////                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
////                    updateQuestion();
////                }
//            }
//        });


        return view;
    }



//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz);
//
//
//
//
//
//    }

    private void updateQuestion(){
//        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
//        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
//        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
//        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
//
//        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
//        mQuestionNumber++;
        ((AnswerQuestions) getActivity()).nextQuestion();
    }


//    private void updateScore(int point) {
//        mScoreView.setText("" + mScore);
//    }
}