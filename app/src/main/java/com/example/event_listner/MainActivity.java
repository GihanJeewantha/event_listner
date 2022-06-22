package com.example.event_listner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //link XML file element and java code ussing this find view by ID method
        button = findViewById(R.id.button_1);

        //event listner
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView1);
                textView.setText("Welcome for first android program !");

            }
        });
    }
}