package com.example.sroy.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FactActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);

        // Assign the views from layout to corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeView);

        // Function of the button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button is clicked so update the text view with new fact

                String fact = factBook.getFact();
                int colour = colorWheel.getColors();
                // Update screen with new fact
                relativeLayout.setBackgroundColor(colour);
                factTextView.setText(fact);
                showFactButton.setTextColor(colour);
            }
        };
        showFactButton.setOnClickListener(listener);

    }
}
