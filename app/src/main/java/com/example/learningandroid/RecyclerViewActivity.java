package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts=new ArrayList<>();
    FloatingActionButton btnOpenDialogue;
    RecyclerView recyclerView;
    RecyclerContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView=findViewById(R.id.recyclerContact);
        btnOpenDialogue=findViewById(R.id.btnOpenDialogue);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnOpenDialogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog=new Dialog(RecyclerViewActivity.this);
                dialog.setContentView(R.layout.add_contacts);
                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);
                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="" , number="";
                        if(!edtName.getText().toString().equals("")){
                            name= edtName.getText().toString();
                        } else {
                            Toast.makeText(RecyclerViewActivity.this, "Please Enter Contact Name", Toast.LENGTH_SHORT).show();
                        }
                        if(!edtNumber.getText().toString().equals("")){
                             number= edtNumber.getText().toString();
                        }   else {
                            Toast.makeText(RecyclerViewActivity.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                        }
                        arrContacts.add(new ContactModel(R.drawable.user,name,number));

                        adapter.notifyItemInserted(arrContacts.size()-1);
                        recyclerView.scrollToPosition(arrContacts.size()-1);
                        dialog.dismiss();

                    }
                });

                dialog.show();

            }
        });

        arrContacts.add(new ContactModel(R.drawable.a,"A","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.b,"B","9857645455"));
        arrContacts.add(new ContactModel(R.drawable.c,"C","9857646523"));
        arrContacts.add(new ContactModel(R.drawable.d,"D","98576455123"));
        arrContacts.add(new ContactModel(R.drawable.e,"E","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.f,"F","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.g,"G","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.h,"H","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.i,"I","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.j,"J","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.k,"K","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.l,"L","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.m,"M","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.n,"N","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.o,"O","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.b,"P","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.c,"Q","9857645455"));
        arrContacts.add(new ContactModel(R.drawable.d,"R","9857646523"));
        arrContacts.add(new ContactModel(R.drawable.e,"S","98576455123"));
        arrContacts.add(new ContactModel(R.drawable.f,"T","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.g,"U","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.h,"V","9857645123"));
        arrContacts.add(new ContactModel(R.drawable.i,"W","9857645123"));

        adapter=new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}