package com.example.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class QuestionDropdownFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] items = {"item 1", "item 2", "item 3"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_dropdown_fragment, viewGroup, false);
//        TextView output= (TextView)view.findViewById(R.id.msg1);

        //

        spinner = (Spinner)view.findViewById(R.id.spinner);
//        ArrayAdapter<String>adapter = new ArrayAdapter<String>(QuestionDropdownFragment.this,
//                android.R.layout.simple_spinner_item,paths);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
//        dropdown.setAdapter(adapter);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
//        output.setText("QuestionDropdownFragment");
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}