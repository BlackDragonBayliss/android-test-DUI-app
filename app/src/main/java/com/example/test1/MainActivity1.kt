package com.example.test1

import android.content.Intent
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

//import com.example.test1.DisplayMessageActivity

import androidx.core.content.ContextCompat.startActivity
import com.example.test1.DisplayMessageActivity
import com.example.test1.R

const val EXTRA_MESSAGE = "com.example.test1.MESSAGE"
//const val EXTRA_MESSAGE = "com"

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(R.layout.question_edittext_fragment)
    }

    /** Called when the user taps the Send button */
//    fun sendMessage(view: View) {
//        val editText = findViewById<EditText>(R.id.editText)
//        val message = editText.text.toString()
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, message)
//        }
//        startActivity(intent)
//    }

    fun answerQuestionsActivityChange(view: View) {
//        val editText = findViewById<EditText>(R.id.editText)
        val message = "from menu"//editText.text.toString()

        val intent = Intent(this, AnswerQuestions::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


    fun resourcesActivityChange(view: View) {
//        val editText = findViewById<EditText>(R.id.editText)
//        val message = editText.text.toString()
        val message = "from menu"
        val intent = Intent(this, Resources::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}