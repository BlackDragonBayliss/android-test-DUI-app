package com.example.test1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
//    int[] arrayIntHolder = new int[20];
//    arrayIntHolder[0] = 1;
// declares an Array of integers.
//int[] arr;
//
//    // allocating memory for 5 integers.
//    arr = new int[5];
//
//    // initialize the first elements of the array
//    arr[0] = 10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_edittext_fragment);

//        View.OnClickListener listener = new View.OnClickListener() {
//            public void onClick(View view) {
//                Fragment fragment = null;
//                if(view == findViewById(R.id.button1)){
////                    fragment = new FragmentOne();
//                    fragment = new FragmentTwo();
//                } else {
//                    fragment = new FragmentTwo();
//                }
//                FragmentManager manager = getSupportFragmentManager();
//                FragmentTransaction transaction = manager.beginTransaction();
//                transaction.replace(R.id.output, fragment);
//                transaction.commit();
//            }
//        };
//
//        Button btn1 = (Button)findViewById(R.id.button1);
//        btn1.setOnClickListener(listener);
//        Button btn2 = (Button)findViewById(R.id.button2);
//        btn2.setOnClickListener(listener);
//
////        ArrayList<String> gfg = new ArrayList<String>();
////        gfg.add("Geeks");
////        System.out.println("ArrayList : " + gfg);
    }


    public void changeQuestion(){

    }
}