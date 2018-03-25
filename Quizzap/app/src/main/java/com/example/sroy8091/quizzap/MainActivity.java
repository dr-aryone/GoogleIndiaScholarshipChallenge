package com.example.sroy8091.quizzap;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void show_result(View view) {

        EditText name = (EditText) findViewById(R.id.user);
        String user = String.valueOf(name.getText());
        Resources resources = getResources();

        RadioButton r1 = (RadioButton) findViewById(R.id.q1);
        if (r1.isChecked()) {
            score++;
        }

        RadioButton r2 = (RadioButton) findViewById(R.id.q2);
        if (r2.isChecked()) {
            score++;
        }

        RadioButton r3 = (RadioButton) findViewById(R.id.q3);
        if (r3.isChecked()) {
            score++;
        }

        RadioButton r4 = (RadioButton) findViewById(R.id.q4);
        if (r4.isChecked()) {
            score++;
        }

        RadioButton r5 = (RadioButton) findViewById(R.id.q5);
        if (r5.isChecked()) {
            score++;
        }


        CheckBox c1 = (CheckBox) findViewById(R.id.ch1);
        CheckBox c2 = (CheckBox) findViewById(R.id.ch2);
        CheckBox c3 = (CheckBox) findViewById(R.id.ch3);

        if (c1.isChecked() && c2.isChecked() && c3.isChecked()) {
            score++;
        }

        EditText topic = (EditText) findViewById(R.id.topic);
        if (topic.getText().toString().equalsIgnoreCase(resources.getString(R.string.android))) {
            score++;
        }

        if (score == 6) {
            Toast.makeText(MainActivity.this, resources.getString(R.string.awesome)
                    + user + resources.getString(R.string.all_correct), Toast.LENGTH_LONG).show();

        } else if (score < 6 && score > 0) {
            Toast.makeText(MainActivity.this, resources.getString(R.string.your_score)
                    + score + resources.getString(R.string.out_of) +
                    resources.getString(R.string.try_harder) + user, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(MainActivity.this, resources.getString(R.string.hey)
                    + user + resources.getString(R.string.concentrate), Toast.LENGTH_LONG).show();

        }

        score = 0;

    }

}
