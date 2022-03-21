package com.example.assignmentphase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1i=findViewById(R.id.textView);
        TextView t2i=findViewById(R.id.textView7);
        TextView t3i=findViewById(R.id.textView8);
        TextView t4i=findViewById(R.id.textView9);
        TextView t5i=findViewById(R.id.textView10);
        TextView name=findViewById(R.id.textView2);
        TextView age=findViewById(R.id.textView3);
        TextView address=findViewById(R.id.textView4);
        TextView phone=findViewById(R.id.textView5);
        TextView location=findViewById(R.id.textView6);

        name.setText("NAME");
        age.setText("AGE");
        address.setText("ADDRESS");
        phone.setText("PHONE");
        location.setText("LOCATION");
        Intent i=getIntent();
        Bundle b=i.getExtras();

        String n=b.getString("name");
        String a=b.getString("age");
        String ad=b.getString("address");
        String ph=b.getString("phone");
        String lo=b.getString("location");

        t1i.setText(n);
        t2i.setText(a);
        t3i.setText(ad);
        t4i.setText(ph);
        t5i.setText(lo);

    }
}