package com.example.mystiq.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.mystiq.MainActivity

import com.example.mystiq.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            var status =
                if (username.text.toString().equals("Test") && password.text.toString().equals("1234")) "Přihlášení proběhlo úspěšně" else "Přihlášení se nezdařilo"

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()

            if (status == "Přihlášení proběhlo úspěšně"){
                startActivity(Intent(this, MainActivity::class.java))
            }


            }
    }
}
