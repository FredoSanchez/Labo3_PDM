package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.form.utils.AppConstants;

public class RecordActivity extends AppCompatActivity {

    TextView mNameView, mGenderView, mEmailView, mPassView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        mNameView = findViewById(R.id.tv_name);
        mGenderView = findViewById(R.id.tv_gender);
        mEmailView = findViewById(R.id.tv_email);
        mPassView = findViewById(R.id.tv_pass);

        Intent mIntent = getIntent();

        if (mIntent!=null){
            mNameView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY1));
            mGenderView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            mEmailView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY3));
            mPassView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY4));

        }
    }
}
