package com.example.consumoenergia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/* Consumo energía = KW * hora
Consumo energía = W/1000 * hora
*
* */
    private EditText watt;
    private EditText hours;
    private Button calculate;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        watt= findViewById(R.id.editTextWatt);
        hours= findViewById(R.id.editTextHours);
        calculate= findViewById(R.id.buttonCalculate);
        result= findViewById(R.id.textViewResult);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour= Integer.parseInt(hours.getText().toString());
                double watts= Double.parseDouble(watt.getText().toString());
                double value=0;
                for (int i=1;i<=hour;i++){
                     value+= (watts/1000);
                }
                String imprimir= String.format("%.5f",value);
                result.setText(imprimir);
            }
        });
    }
}