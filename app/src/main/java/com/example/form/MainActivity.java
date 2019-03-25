package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.form.utils.AppConstants;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText mEt_Name, mEt_Gender, mEt_Email, mEt_pass;

    //ArrayList<String> List = new ArrayList<String>();

    String[] lista;

    Button mSubmitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEt_Name = findViewById(R.id.et_name);
        mEt_Gender = findViewById(R.id.et_gender);
        mEt_Email = findViewById(R.id.et_mail);
        mEt_pass = findViewById(R.id.et_pass);


        mSubmitButton = findViewById(R.id.btn_submit);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String name = mEt_Name.getText().toString();
            String gender = mEt_Gender.getText().toString();
            String email = mEt_Email.getText().toString();
            String pass = mEt_pass.getText().toString();

            Intent mIntent = new Intent(MainActivity.this,RecordActivity.class);



            mIntent.putExtra(AppConstants.TEXT_KEY1, name);
            mIntent.putExtra(AppConstants.TEXT_KEY2, gender);
            mIntent.putExtra(AppConstants.TEXT_KEY3, email);
            mIntent.putExtra(AppConstants.TEXT_KEY4, pass);



            startActivity(mIntent);
            }
        });
    }
}
