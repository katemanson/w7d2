package com.example.user.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity {

    EditText mTextToCount;
    Button mGoButton;
    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("WordCount", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextToCount = (EditText)findViewById(R.id.text_to_count);
        mGoButton = (Button)findViewById(R.id.go_button);
        mResultText = (TextView)findViewById(R.id.result_text);

        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textToCount = mTextToCount.getText().toString();
                WordCount wordCounter = new WordCount();
                int wordCount = wordCounter.go(textToCount);

                mResultText.setText("Your text contains " + wordCount + " words");
            }
        });
    }

}
