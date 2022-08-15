package com.example.bda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegistrationActivity extends AppCompatActivity {

    private Button donerButton,recipientButton;
    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);

        donerButton = findViewById(R.id.donerButton);
        recipientButton = findViewById(R.id.recipientButton);
        backButton = findViewById(R.id.backButton);

        donerButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                Intent intent = new Intent(SelectRegistrationActivity.this,DonerRegistrationActivity.class);
                startActivity(intent);

            }


        });

        recipientButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                Intent intent = new Intent(SelectRegistrationActivity.this,RecipientRegistrationActivity.class);
                startActivity(intent);

            }


        });


        backButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                Intent intent = new Intent(SelectRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);

            }


        });

    }
}