package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnAddition, btnSubtraction, btnMultiplication, btnDivision;
    EditText Number1, Number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);

        //Metode 1 - Addition. Lavet med Interface + anonynym metode
        btnAddition = findViewById(R.id.btnAddition);

        btnAddition.setOnClickListener(this); //Anvend: Implements OnClickListener (Interface, plus override metode OnClick);

    }




    //Til Metode 1 med Interface:
    @Override
    public void onClick(View v) {
        result.setText();
    }
}