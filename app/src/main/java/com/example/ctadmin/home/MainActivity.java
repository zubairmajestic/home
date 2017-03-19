package com.example.ctadmin.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText username = (EditText) findViewById(R.id.editText);
    EditText password = (EditText) findViewById(R.id.editText2);

    public void onButtonClick(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

        }
    }
}
