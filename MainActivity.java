package com.example.takeawayselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    Random r;

    String[] items = {"Chinese", "Pizza", "Indian", "Chip Shop", "Italian", "Japanese",
            "Thai", "Mexican", "McDonald's"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnRandomize);
        textView = (TextView) findViewById(R.id.tvShowText);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText(items[r.nextInt(items.length)]);
            }
        });
    }


}
