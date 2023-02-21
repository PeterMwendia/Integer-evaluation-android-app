package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private Button check;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        num1=(EditText) findViewById(R.id.num1);
        check=(Button) findViewById(R.id.checkk);
        answer=(TextView) findViewById(R.id.ans);

        check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                int a = Integer.parseInt(value1);
                int rem = a % 2;
                if (rem == 0 ){
                    answer.setText("Number is Even!!");
                }
                else {
                    answer.setText("Number is Odd!!");
                }
                Toast.makeText(getApplicationContext(), String.valueOf("Remainder is "+rem), Toast.LENGTH_LONG).show();
            }
        });
    }
}