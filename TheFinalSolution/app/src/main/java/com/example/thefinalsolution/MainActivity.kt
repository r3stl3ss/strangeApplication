package com.example.thefinalsolution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener{
            if (et_password.text.toString().equals(et_password.text.toString().toLowerCase()) || et_password.text.toString().equals(et_password.text.toString().toUpperCase())) {
                Toast.makeText(getApplicationContext(),"Пароль должен содержать хотя бы одну строчную или заглавную букву", Toast.LENGTH_SHORT).show()
            }
            else if (et_password.text.toString().!matches("^.*\\d.*$")) {
                Toast.makeText(getApplicationContext(),"Пароль должен содержать хотя бы одну цифру", Toast.LENGTH_SHORT).show()
            }
            else if (et_username.text.toString().!matches("/^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$/i)")) {
                    Toast.makeText(getApplicationContext(),"Неправильно введена электронная почта", Toast.LENGTH_SHORT).show()
                }
            else if (et_username.text.toString().equals("UserOne@mail.ru")&&et_password.equals("passwordforuserone")) {
                val authorized = Intent(this, IfRegSuccess::class.java)
                startActivity(authorized);
                Toast.makeText(getApplicationContext(),"Вы в приложении!", Toast.LENGTH_SHORT).show()
            }
    }
}

