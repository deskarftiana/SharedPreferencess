package com.example.aplikasikudeska;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    Button btn_login;
    EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login );

        username = findViewById(R.id.username);
        btn_login = findViewById(R.id.btn_login);
        pass = findViewById(R.id.pass);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                    //jika berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                }
                else {
                    //jika gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password anda SALAH")
                            .setNegativeButton("Retry",null).create().show();
                }
            }


        });
    }
}