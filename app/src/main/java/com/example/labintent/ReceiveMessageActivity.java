package com.example.labintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent =getIntent();
        String string = intent.getStringExtra("message");
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(string);
    }
}