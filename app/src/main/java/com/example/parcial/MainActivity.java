package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_multiplicar;

    Button button_suma;
    Button button_resta;
    Button button_ncalculo;

    TextView resultado;
    EditText numero1;
    EditText numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_multiplicar = findViewById(R.id.button_multiplicar);
        button_suma = findViewById(R.id.button_suma);
        button_resta = findViewById(R.id.button_resta);
        button_ncalculo = findViewById(R.id.button_ncalculo);
        resultado = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int resultad = n1 * n2;
                resultado.setText("Multiplicación: " + resultad);
            }
        });

        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int resultad = n1 + n2;
                resultado.setText("Suma: " + resultad);
            }
        });


        button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int resultad = n1 - n2;
                resultado.setText("Resta: " + resultad);
            }
        });


        button_ncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1.setText("");
                numero2.setText("");
            }
        });
    }


}