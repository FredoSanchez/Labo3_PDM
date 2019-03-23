package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
            /*
            mNameView.setText(mIntent.getStringArrayExtra(Intent.EXTRA_TEXT)[0]);
            mGenderView.setText(mIntent.getStringArrayExtra(Intent.EXTRA_TEXT)[1]);
            mEmailView.setText(mIntent.getStringArrayExtra(Intent.EXTRA_TEXT)[2]);
            mPassView.setText(mIntent.getStringArrayExtra(Intent.EXTRA_TEXT)[3]);
            */
        }
    }
}
