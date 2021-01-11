package com.example.marketoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    static Saler saler;

    Button login_button;
    EditText name, login, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_button = findViewById(R.id.btn_login);
        name = findViewById(R.id.edt_name);
        login = findViewById(R.id.edt_login);
        password = findViewById(R.id.edt_password);

        saler = new Saler("Bobur", "Bobur","1234");

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals(saler.login)
                        && password.getText().toString().equals(saler.password)){
                    Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this, "To'g'ri login parol yozing", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}