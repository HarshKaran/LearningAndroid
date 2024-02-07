package com.example.learningandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DialogueBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue_box);

        //  Single button Dialogue Box

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Terms and conditions");
        alertDialog.setIcon(R.drawable.baseline_info_24);
        alertDialog.setMessage("Have you read all terms and conditions");
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Yes I am in",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogueBoxActivity.this, "Yes you can proceed!", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();

        //  Double button Dialogue Box

        AlertDialog.Builder delDialogue = new AlertDialog.Builder(DialogueBoxActivity.this);
        delDialogue.setTitle("Delete?");
        delDialogue.setIcon(R.drawable.baseline_delete_24);
        delDialogue.setMessage("Are you want to delete");
        delDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //  For Yes
                Toast.makeText(DialogueBoxActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        delDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // For No
                Toast.makeText(DialogueBoxActivity.this, "Item not Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        delDialogue.show();
    }
    //  Triple button dialogue box
//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder exitDialogue = new AlertDialog.Builder(this);
//        exitDialogue.setIcon(R.drawable.baseline_exit_to_app_24);
//        exitDialogue.setMessage("Are you want to exit");
//        exitDialogue.setTitle("Exit ?");
//        exitDialogue.setPositiveButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(DialogueBoxActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
//            }
//        });
//        exitDialogue.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                DialogueBoxActivity.super.onBackPressed();
//            }
//        });
//        exitDialogue.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(DialogueBoxActivity.this, "Operation Cancelled", Toast.LENGTH_SHORT).show();
//            }
//        });
//        exitDialogue.show();
//  }
}