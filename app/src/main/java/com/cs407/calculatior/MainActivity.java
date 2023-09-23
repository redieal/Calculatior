package com.cs407.calculatior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickPlusFunction(View view){
        EditText numberField1 = (EditText) findViewById(R.id.Number1);
        EditText numberField2 = (EditText) findViewById(R.id.Number2);
        Double value = Double.valueOf(numberField1.getText().toString()) + Double.valueOf(numberField2.getText().toString());
        goToActivity(value.toString());
    }

    public void clickMinusFunction(View view){
        EditText numberField1 = (EditText) findViewById(R.id.Number1);
        EditText numberField2 = (EditText) findViewById(R.id.Number2);
        Double value = Double.valueOf(numberField1.getText().toString()) - Double.valueOf(numberField2.getText().toString());
        goToActivity(value.toString());
    }

    public void clickMultiplicationFunction(View view){
        EditText numberField1 = (EditText) findViewById(R.id.Number1);
        EditText numberField2 = (EditText) findViewById(R.id.Number2);
        Double value = Double.valueOf(numberField1.getText().toString()) * Double.valueOf(numberField2.getText().toString());
        goToActivity(value.toString());
    }

    public void clickDivisionFunction(View view){
        EditText numberField1 = (EditText) findViewById(R.id.Number1);
        EditText numberField2 = (EditText) findViewById(R.id.Number2);
        if(Double.valueOf(numberField2.getText().toString()) == 0){
            goToActivity("The second number cannot be 0");
        }
        else {
            Double value = Double.valueOf(numberField1.getText().toString()) / Double.valueOf(numberField2.getText().toString());
            goToActivity(value.toString());
        }
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}