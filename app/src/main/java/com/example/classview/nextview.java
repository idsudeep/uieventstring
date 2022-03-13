package com.example.classview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nextview extends AppCompatActivity {
    TextView afterPressView ,vfname, vlname , vphone,vemail,vpwd,vgender;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextview);
        getSupportActionBar().setTitle("Welcome to UserDetail with String Resource");

       // showData = (TextView) findViewById(R.id.textView2);
        vfname = (TextView) findViewById(R.id.viewfname);
        vlname = (TextView) findViewById(R.id.viewlname);
        vphone = (TextView) findViewById(R.id.viewphone);
        vemail = (TextView) findViewById(R.id.viewemail);
        vpwd = (TextView) findViewById(R.id.viewpwd);
        vgender = (TextView) findViewById(R.id.viewgender);
        backbtn = (Button) findViewById(R.id.backBtn);


       // showData.setText(getIntent().getStringExtra("data"));
       vfname.setText(getIntent().getStringExtra("f"));
        vlname.setText(getIntent().getStringExtra("l"));
        vphone.setText(getIntent().getStringExtra("p"));
        vemail.setText(getIntent().getStringExtra("e"));
        vpwd.setText(getIntent().getStringExtra("p"));
        vgender.setText(getIntent().getStringExtra("gender"));
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(nextview.this,MainActivity.class));
            }
        });


    }
    public void btnonclick(View v){

        afterPressView = (TextView) findViewById(R.id.afterPress);

        afterPressView.setText(R.string.stringR);

    }

}