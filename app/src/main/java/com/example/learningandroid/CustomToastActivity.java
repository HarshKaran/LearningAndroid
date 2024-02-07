package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    LinearLayout viewContainer;
    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        btnToast = findViewById(R.id.btnToast);
        // Default toast
        // Toast.makeText(getApplicationContext(), "This is my first toast", Toast.LENGTH_LONG).show();

        //  Custom toast

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout , (ViewGroup)findViewById(R.id.viewContainer));
                toast.setView(view);
                TextView txtMsg = view.findViewById(R.id.txtMsg);
                txtMsg.setText("Message sent Successfully!");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER|Gravity.CLIP_VERTICAL , 0,0);
                toast.show();
            }
        });


    }
}