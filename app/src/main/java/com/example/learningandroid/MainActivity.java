package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOne ,btnBMI,btnlearning,btnTypesOfViews,btnNotification,btnCardView,btnRecyclerView,btnToolbar,btnCustomToast,btnDialogBox,btnCustomDialogBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnBMI = findViewById(R.id.btnBMI);
        btnlearning=findViewById(R.id.btnlearning);
        btnTypesOfViews=findViewById(R.id.btnTypesOfViews);
        btnCardView=findViewById(R.id.btnCardView);
        btnRecyclerView=findViewById(R.id.btnRecyclerView);
        btnToolbar = findViewById(R.id.btnToolbar);
        btnCustomToast = findViewById(R.id.btnCustomToast);
        btnDialogBox = findViewById(R.id.btnDialogBox);
        btnCustomDialogBox = findViewById(R.id.btnCustomDialogBox);
        btnNotification = findViewById(R.id.btnNotification);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BMICalculatorActivity.class);
                startActivity(intent);
            }});

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewsActivity.class);
                startActivity(intent);
            }
        });

        btnTypesOfViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, TypesOfViewsActivity.class);
                startActivity(intent);
            }
        });

        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CardViewActivity.class);
                startActivity(intent);
            }
        });

        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ToolbarActivity.class);
                startActivity(intent);
            }
        });

        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , CustomToastActivity.class);
                startActivity(intent);
            }
        });

        btnDialogBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , DialogueBoxActivity.class);
                startActivity(intent);
            }
        });

        btnCustomDialogBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , CustomDialogueBoxActivity.class);
                startActivity(intent);
            }
        });

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , NotificationExampleActivity.class);
                startActivity(intent);
            }
        });

        Intent intent;
        intent = new Intent(MainActivity.this,LearningIntentActivity.class);
        intent.putExtra("title","Home");
        intent.putExtra("StudentName","Cheeku");
        intent.putExtra("Roll No",10);

        btnlearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });

    }
}