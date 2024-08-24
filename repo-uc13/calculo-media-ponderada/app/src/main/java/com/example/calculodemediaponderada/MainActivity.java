package com.example.calculodemediaponderada;

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
    public void calcular(View view){
        EditText nota1 = findViewById(R.id.editTextText_nota1);
        EditText nota2 = findViewById(R.id.editTextText_nota2);
        EditText nota3 = findViewById(R.id.editTextText_nota3);
        EditText peso1 = findViewById(R.id.editTextText_peso1);
        EditText peso2 = findViewById(R.id.editTextText_peso2);
        EditText peso3 = findViewById(R.id.editTextText_peso3);
        TextView resultado = findViewById(R.id.textView);

        double n1 = Double.parseDouble(nota1.getText().toString());
        double n2 = Double.parseDouble(nota2.getText().toString());
        double n3 = Double.parseDouble(nota3.getText().toString());
        double p1 = Double.parseDouble(peso1.getText().toString());
        double p2 = Double.parseDouble(peso2.getText().toString());
        double p3 = Double.parseDouble(peso3.getText().toString());

        double mediaponderada = (n1*p1)+(n2*p2)+(n3*p3)/(p1+p2+p3);

        resultado.setText("A média ponderada é: "+mediaponderada);
    }
}