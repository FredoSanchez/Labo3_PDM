package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView mSharedName, mSharedGender, mSharedEmail, mSharedPassword;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedName = findViewById(R.id.tv_shared_name);
        mSharedGender = findViewById(R.id.tv_shared_gender);
        mSharedEmail = findViewById(R.id.tv_shared_email);
        mSharedPassword = findViewById(R.id.tv_shared_password);

        Intent mSharedIntent = getIntent();

        if (mSharedIntent!=null){
            data = mSharedIntent.getStringExtra(Intent.EXTRA_TEXT);
        }


        mSharedName.setText(data);
    }
}
