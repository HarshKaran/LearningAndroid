package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMICalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        LinearLayout llBMIact;
        TextView txtResult;
        Button btnCalculate;
        EditText edtWeight, edtHeightFt, edtHeightIn;

        edtWeight=findViewById(R.id.edtWeight);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        edtHeightFt=findViewById(R.id.edtHeightFt);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult=findViewById(R.id.txtResult);
        llBMIact=findViewById(R.id.llBMIact);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt=Integer.parseInt(edtWeight.getText().toString());
                int ft=Integer.parseInt(edtHeightFt.getText().toString());
                int in=Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn = ft*12 + in;
                double totCm= totalIn * 2.53;
                double totM= totCm/100;
                double BMI = wt/(Math.pow(totM,2));

                if(BMI > 25){
                    txtResult.setText("You are OverWeight");
                    llBMIact.setBackgroundColor(getResources().getColor(R.color.overweight));
                } else if (BMI < 18) {
                    txtResult.setText("You are UnderWeight");
                    llBMIact.setBackgroundColor(getResources().getColor(R.color.underweight));
                }
                else {
                    txtResult.setText("You are Fit");
                    llBMIact.setBackgroundColor(getResources().getColor(R.color.fit));
                }
            }
        });
    }
}