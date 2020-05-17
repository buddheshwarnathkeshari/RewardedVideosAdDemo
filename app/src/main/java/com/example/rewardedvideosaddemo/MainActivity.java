package com.example.rewardedvideosaddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView register=findViewById(R.id.register);
        Intent i=new Intent(MainActivity.this,Registeration.class);
        startActivity(i);

        /*register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Registeration.class);
                startActivity(i);
            }
        });*/
    }
}
