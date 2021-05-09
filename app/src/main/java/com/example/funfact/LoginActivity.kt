package com.example.funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()

    }

    private fun signIn(){
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signButton = findViewById<MaterialButton>(R.id.next_button)

        signButton.setOnClickListener {
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.text.toString() == "fisk@gmail.com" && password.text.toString() == "24680") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "email must be fisk@gmail.com and password must be 24680", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}