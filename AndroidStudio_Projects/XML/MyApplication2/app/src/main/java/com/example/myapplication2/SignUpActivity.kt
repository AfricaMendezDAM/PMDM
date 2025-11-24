package com.example.myapplication2

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimatableView
import com.google.android.material.textfield.TextInputEditText
import java.util.UUID

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val editTextDate: TextInputEditText
        editTextDate = findViewById(R.id.editTextDate)

        var signUpBtn = findViewById<Button>(R.id.signUpBtn)
        val pwdInput =findViewById<TextInputEditText>(R.id.editTextNewPwd)
        val emailInput= findViewById<TextInputEditText>(R.id.editTextEmail)

        val pwd = pwdInput.text.toString()
        val email = emailInput.text.toString()

        signUpBtn.setOnClickListener {
            if (pwd.isNotBlank() && email.isNotBlank()){

            }
        }

//        editTextDate.setOnClickListener {
//            showDatePickerDialog()
//        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

//    private fun showDatePickerDialog() {
//        val datePickerDialog = DatePickerDialog(
//            this,
//            { DatePicker, year: int, monthOfYear: int, dayOfMonth: int
//            }
//
//        )
//        datePickerDialog.show();
//    }

    private fun createAccount(userEmail: String, pwd: String){
        val userName=findViewById<TextInputEditText>(R.id.editTextName)
        val userFN=findViewById<TextInputEditText>(R.id.editTextApellido1)
        val userSN=findViewById<TextInputEditText>(R.id.editTextApellido2)
        val userBirthDate=findViewById<TextInputEditText>(R.id.editTextDate)
        val newUser= User(
            id= UUID.randomUUID().toString(),
            userEmail,
            userName.text.toString(),
            pwd,
            userFN.text.toString(),
            userSN.text.toString(),
            userBirthDate.text.toString(),
        )


    }

}

