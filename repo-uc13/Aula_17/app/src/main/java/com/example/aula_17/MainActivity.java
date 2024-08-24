package com.example.aula_17;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    public void btn_calcula (View view) {

        EditText EditTextValor1 = findViewById(R.id.plaintxtvalor1);
        EditText EditTextValor2 = findViewById(R.id.plaintxtvalor2);

        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        double resto = 0;

        double valor1 = 0;
        double valor2 = 0;
        if ((EditTextValor1.getText().toString().isEmpty()) || (EditTextValor2.getText().toString().isEmpty())) {

            Toast.makeText(this, "Insira os valores", Toast.LENGTH_LONG).show();
        } else {
            valor1 = 0;
            valor1 = Double.parseDouble(EditTextValor1.getText().toString());

            valor2 = 0;
            valor2 = Double.parseDouble(EditTextValor2.getText().toString());
        }

        if (valor1 == 0 && valor2 == 0) {

            Toast.makeText(this, "insira valores diferentes de 0", Toast.LENGTH_LONG).show();

        }
        else {

            soma = soma(valor1,valor2);
            subtracao = subtracao(valor1,valor2);
            multiplicacao = multiplicacao(valor1,valor2);
            divisao = divisao(valor1,valor2);
            resto = resto(valor1,valor2);

        }
        if (Double.isNaN(soma) || (Double.isNaN(subtracao)) || (Double.isNaN(multiplicacao)) || (Double.isNaN(divisao)) || (Double.isNaN(resto))){
            soma = 0;
            subtracao = 0;
            multiplicacao = 0;
            divisao = 0;
            resto = 0;
        }

        String resultSoma = String.valueOf(soma);
        String resultSub = String.valueOf(subtracao);
        String resultMult = String.valueOf(multiplicacao);
        String resultDiv = String.valueOf(divisao);
        String resultRest = String.valueOf(resto);

        TextView txtSoma = findViewById(R.id.TxtView1);
        TextView txtSub = findViewById(R.id.TxtView2);
        TextView txtMult = findViewById(R.id.TxtView3);
        TextView txtDiv = findViewById(R.id.TxtView4);
        TextView txtRest = findViewById(R.id.TxtView5);

        txtSoma.setText(resultSoma);
        txtSub.setText(resultSub);
        txtMult.setText(resultMult);
        txtDiv.setText(resultDiv);
        txtRest.setText(resultRest);
    }

    public double soma(double x, double y){
        double resultado = x + y;
        return resultado;
    }

    public double subtracao(double x, double y){
        double resultado = x - y;
        return resultado;
    }

    public double multiplicacao(double x, double y){
        double resultado = x * y;
        return resultado;
    }

    public double divisao(double x, double y){
        double resultado = x / y;
        return resultado;
    }

    public double resto(double x, double y){
        double resultado= x % y;
        return resultado;
    }










}



