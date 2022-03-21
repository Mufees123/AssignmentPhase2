package com.example.assignmentphase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1=findViewById(R.id.editText);
        EditText e2=findViewById(R.id.editText2);
        EditText e3=findViewById(R.id.editTextTextMultiLine);
        EditText e4=findViewById(R.id.editText3);
        EditText e5=findViewById(R.id.editTextTextPersonName);
        Button b=findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,MainActivity2.class);
                String name=String.valueOf(e1.getText());
                String age=String.valueOf(e2.getText());
                String address=String.valueOf(e3.getText());
                String phone=String.valueOf(e4.getText());
                String location=String.valueOf(e5.getText());
                Bundle b=new Bundle();
                b.putString("name",name);
                b.putString("age",age);
                b.putString("address",address);
                b.putString("phone",phone);
                b.putString("location",location);
                i.putExtras(b);
                startActivity(i);
                //Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
                Log.d("n",name.toString());

            }
        });
    }
}