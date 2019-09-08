package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class AnswerQuestions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val fragLayout = findViewById<TextView>(R.id.output)
//        fragLayout. = "com.example.test1.FragmentTwo"
        setContentView(R.layout.activity_answer_questions)

        //We want a dynamic recyclerview set, statically to begin with.

//        val txtViewQuestionText = findViewById<TextView>(R.id.textView3)
//        val spinner = findViewById<Spinner>(R.id.spinner)
//        spinner.
//        val questionObject = questionFactory("QuestionText",arrayOf("AnswerData"),"Dropdown")

//        txtViewQuestionText.text = questionObject.question
//        findUsers
        val questionObject = questionFactory("hey fella", arrayOf("AnswerData","Hero"),"Dropdown")
//        txtViewQuestionText.text = questionObject.questionText
        val personNames = questionObject.answerData
            //arrayOf("Weld", "Alamosa", "Doug","El Paso")

        if(questionObject.questionFormat == "Dropdown"){
//            var fragment: Fragment? = null
//            if (view === findViewById(R.id.button1)) {
//                fragment = FragmentOne()
//            } else {
//                fragment = FragmentTwo()
//            }
            val fragment = FragmentOne()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frag_content, fragment)
            transaction.commit()

//            if (spinner != null) {
//                val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, personNames)
//                spinner.adapter = arrayAdapter
//
//                spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                        Toast.makeText(this@AnswerQuestions, getString(R.string.selected_item) + " " + personNames[position], Toast.LENGTH_SHORT).show()
//                    }
//
//                    override fun onNothingSelected(parent: AdapterView<*>) {
//                        // Code to perform some action when nothing is selected
//                    }
//                }
//            }

        }

        if(questionObject.questionFormat == "MultipleChoice") {
            val fragment = FragmentTwo()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

//            transaction.replace(R.id.output, fragment)
            transaction.replace(R.id.frag_content, fragment)
            transaction.commit()

//            FragmentManager fragmentManager = getFragmentManager()
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//            ExampleFragment fragment = new ExampleFragment();
//            fragmentTransaction.replace(R.id.frag_content, fragment);
//            fragmentTransaction.commit();
        }

    }


//    fun questionFactory(questionText: String, answerData: Array<String>, questionFormat: String): Object{
//        val questionObject = object {
//            val question = questionText
//            val answerData = answerData
//            val questionFormat = questionFormat
//        }
//        return questionObject
//    }

    private fun questionFactory(questionText: String, answerData: Array<String>, questionFormat: String) =
        object {
            val questionText = questionText
            val answerData = answerData
            val questionFormat = questionFormat
        }
}