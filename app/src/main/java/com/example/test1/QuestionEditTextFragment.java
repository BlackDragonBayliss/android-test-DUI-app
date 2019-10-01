package com.example.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class QuestionEditTextFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_edittext_fragment, viewGroup, false);
        TextView questionText = (TextView) view.findViewById(R.id.questionText);
        QuestionObject question = ((AnswerQuestions) getActivity()).getQuestion();
        questionText.setText(question.getQuestion());
//        QuestionObject question = ((AnswerQuestions) getActivity()).getResult();
        return view;
    }
}
