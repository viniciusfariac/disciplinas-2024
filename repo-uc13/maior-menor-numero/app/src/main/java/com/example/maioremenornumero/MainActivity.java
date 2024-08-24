package com.example.maioremenornumero;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void calcular (View view) {
        EditText num1 = findViewById(R.id.editTextText_num1);
        EditText num2 = findViewById(R.id.editTextText_num2);
        EditText num3 = findViewById(R.id.editTextText_num3);
        EditText num4 = findViewById(R.id.editTextText_num4);
        EditText num5 = findViewById(R.id.editTextText_num5);
        TextView maior = findViewById(R.id.textView);
        TextView menor = findViewById(R.id.textView3);

        double[] numeros = new double[] {
            Double.parseDouble(num1.getText().toString()),
                    Double.parseDouble(num2.getText().toString()),
                    Double.parseDouble(num3.getText().toString()),
                    Double.parseDouble(num4.getText().toString()),
                    Double.parseDouble(num5.getText().toString())
        };
        double maiorNumero = numeros[0];
        double menorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
            maior.setText("Maior numero: " + maiorNumero);
            menor.setText("Menor numero: " + menorNumero);
        }
    }
}