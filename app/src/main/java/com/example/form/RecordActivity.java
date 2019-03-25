package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.form.utils.AppConstants;
import com.example.form.utils.JSON;

public class RecordActivity extends AppCompatActivity {

    TextView mNameView, mGenderView, mEmailView, mPassView;
    Button mShareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        mNameView = findViewById(R.id.tv_name);
        mGenderView = findViewById(R.id.tv_gender);
        mEmailView = findViewById(R.id.tv_email);
        mPassView = findViewById(R.id.tv_pass);
        mShareButton = findViewById(R.id.btn_share);

        Intent mMainIntent = getIntent();

        if (mMainIntent!=null){
            mNameView.setText(mMainIntent.getStringExtra(AppConstants.TEXT_KEY1));
            mGenderView.setText(mMainIntent.getStringExtra(AppConstants.TEXT_KEY2));
            mEmailView.setText(mMainIntent.getStringExtra(AppConstants.TEXT_KEY3));
            mPassView.setText(mMainIntent.getStringExtra(AppConstants.TEXT_KEY4));

        }

        mShareButton.setOnClickListener( v -> {

            Intent mShareIntent = new Intent();

            JSON data = new JSON(mNameView.getText().toString(),mGenderView.getText().toString(),mEmailView.getText().toString(),mPassView.getText().toString());
            mShareIntent.setType("text/plain");
            mShareIntent.setAction(Intent.ACTION_SEND);
            mShareIntent.putExtra(Intent.EXTRA_TEXT, data.getJSON());
            startActivity(mShareIntent);
        });

    }
}
