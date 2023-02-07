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

        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);

        //Metode 1 - Addition. Internt Lavet med Interface + override metode. Kan bruges på flere knapper (med samme resultat (addition))
        btnAddition.setOnClickListener(this); //Anvend: Implements OnClickListener (Interface, plus override metode OnClick);

        //Metode 2 - Subtraktion. Lavet med en anonym indre klasse + metode/objekt
        btnSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float num1 = Float.parseFloat(Number1.getText().toString());
                float num2 = Float.parseFloat(Number2.getText().toString());
                float res = num1 - num2;
                result.setText("Equals: " + res);
            }
        });

        //Metode 3 - Multiplikation. Lavet med en Ekstern klasse.
        btnMultiplication.setOnClickListener(new ButtonClicker(Number1, Number2, result));

        //Metode 4 - Division (se bunden af klassen) med anonym metode

    }




    //Til Metode 1 med Interface
    @Override
    public void onClick(View v) {
        float num1 = Float.parseFloat(Number1.getText().toString());
        float num2 = Float.parseFloat(Number2.getText().toString());
        float res = num1 + num2;
        result.setText("Equals: " + res);
    }

    //Til Metode 4
    public void clickButton (View v){
        float num1 = Float.parseFloat(Number1.getText().toString());
        float num2 = Float.parseFloat(Number2.getText().toString());
        float res = num1 / num2;
        result.setText("Equals: " + res);

    }



}

