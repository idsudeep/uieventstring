package com.example.classview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText ifname,ilname,iphone,iemail,ipwd;
    private Button isignup;
    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   radioGroup = (RadioGroup) findViewById(R.id.radioG);
     ifname = (EditText) findViewById(R.id.fname);
     ilname = (EditText) findViewById(R.id.lname);
     iphone = (EditText) findViewById(R.id.phone);
     iemail = (EditText) findViewById(R.id.email);
     ipwd = (EditText) findViewById(R.id.pwd);

     isignup= (Button) findViewById(R.id.signup);

    isignup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            selectRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            String f = ifname.getText().toString();
            String l=  ilname.getText().toString();
            String i = iphone.getText().toString();
            String e = iemail.getText().toString();
            String p = ipwd.getText().toString();
            String gender = selectRadioButton.getText().toString();

           // String data = someData.getText().toString();


            Intent intent = new Intent(MainActivity.this,nextview.class);
           // intent.putExtra("data",data);
            intent.putExtra("f",f);
            intent.putExtra("l",l);
            intent.putExtra("i",i);
            intent.putExtra("e",e);
            intent.putExtra("p",p);
            intent.putExtra("gender",gender);

            startActivity(intent);
        }
    });
    }
}