package com.example.calculatorapp;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import kotlinx.coroutines.channels.ActorKt;


public class ButtonClicker implements View.OnClickListener{
    EditText UxNum1, UxNum2;
    TextView UxResult;


    public ButtonClicker(EditText number1, EditText number2, TextView result) {
        //
        UxNum1 = number1;
        UxNum2 = number2;
        UxResult = result;
    }



    @Override
    public void onClick(View v) {
        float num1 = Float.parseFloat(UxNum1.getText().toString());
        float num2 = Float.parseFloat(UxNum2.getText().toString());
        float txtResult = num1 * num2;
        UxResult.setText("Equals: " + txtResult);
    }
}
