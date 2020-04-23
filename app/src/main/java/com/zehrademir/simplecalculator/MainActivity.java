package com.zehrademir.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText=findViewById(R.id.editText2);
        EditText editText2=findViewById(R.id.editText3);
        TextView resultText=findViewById(R.id.textView);
    }

    public void sum(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("You have to enter a number.");
        }
        else{

            int x=Integer.parseInt(editText.getText().toString());
            int y=Integer.parseInt(editText2.getText().toString());
            int resultInt=x+y;
            resultText.setText("Result: "+resultInt);
        }


    }
    public void deduct(View view){

        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("You have to enter a number.");
        }
        else{

            int x=Integer.parseInt(editText.getText().toString());
            int y=Integer.parseInt(editText2.getText().toString());
            int resultInt=x-y;
            resultText.setText("Result: "+resultInt);
        }

    }
    public void multiple(View view){

        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("You have to enter a number.");
        }
        else{

            int x=Integer.parseInt(editText.getText().toString());
            int y=Integer.parseInt(editText2.getText().toString());
            int resultInt=x*y;
            resultText.setText("Result: "+resultInt);
        }

    }
    public void divide(View view){

        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("You have to enter a number.");
        }
        else{

            int x=Integer.parseInt(editText.getText().toString());
            int y=Integer.parseInt(editText2.getText().toString());
            int resultInt=x/y;
            resultText.setText("Result: "+resultInt);
        }
    }
}
