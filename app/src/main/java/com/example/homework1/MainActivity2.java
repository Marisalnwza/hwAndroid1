package com.example.homework1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button check = findViewById(R.id.checkbutton);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberEditText = findViewById(R.id.editTextNumber);
                String personid = numberEditText.getText().toString();

                if(personid.length()!=13){
                    Toast t = Toast.makeText(MainActivity2.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(personid.equalsIgnoreCase("1111111111111")||personid.equalsIgnoreCase("2222222222222")){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง ");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
                    dialog.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
            }
        });



    }
}