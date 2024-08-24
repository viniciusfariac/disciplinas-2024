package com.example.calculadora;

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
    public void enviar (View view){
        EditText num = findViewById(R.id.editText_num);
        int valor1 = Integer.parseInt(num.getText().toString());
        EditText num2 = findViewById(R.id.editText_num2);
        int valor2 = Integer.parseInt(num2.getText().toString());
        EditText operacao = findViewById(R.id.editText_ope);
        TextView resul = findViewById(R.id.textView_resul);
        String op = operacao.getText().toString();

        int resultado = 0;
        switch (op){
            case "+":
                resultado = valor1 + valor2;
                break;
                case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
        }
        resul.setText(String.valueOf(resultado));
    }
}