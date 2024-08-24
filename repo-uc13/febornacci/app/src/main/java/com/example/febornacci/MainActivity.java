package com.example.febornacci;

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
    public void calcular (View view){
        EditText num = findViewById(R.id.editTextText_num);
        TextView resultado = findViewById(R.id.textView2);
        int n = Integer.parseInt(num.getText().toString());

        if (n<= 0) {
            resultado.setText("Por favor, digite um número positivo.");
        }
        int a = 0;
        int b = 1;
        String sequencia = "";

        if (n >= 1) {
            sequencia += a + " ";
        }
        if (n >= 2) {
            sequencia += b + " ";
        }

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            sequencia += temp + " ";
        }

        resultado.setText(sequencia);
    }

}