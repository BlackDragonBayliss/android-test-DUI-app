package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class AnswerQuestions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_questions)

        val questionObject = questionFactory("hey fella", arrayOf("AnswerData","Hero"),"Dropdown")
//        val questionObject = questionFactory("hey fella", arrayOf("AnswerData","Hero"),"MultipleChoice")
        val personNames = questionObject.answerData
        if(questionObject.questionFormat == "Dropdown"){
            val fragment = QuestionDropdownFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frag_content, fragment)
            transaction.commit()
        }

        if(questionObject.questionFormat == "MultipleChoice") {
            val fragment = QuestionMultipleChoiceFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            transaction.replace(R.id.frag_content, fragment)
            transaction.commit()
        }

    }

    private fun questionFactory(questionText: String, answerData: Array<String>, questionFormat: String) =
        object {
            val questionText = questionText
            val answerData = answerData
            val questionFormat = questionFormat
        }
}