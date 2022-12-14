package com.example.spannablestringexam;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        SpannableStringBuilder span = new SpannableStringBuilder("spannable string");

        span.setSpan(new android.text.style.UnderlineSpan(),
                0,
                9,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        span.insert(12,"***");

        textView.setText(span);
    }
}