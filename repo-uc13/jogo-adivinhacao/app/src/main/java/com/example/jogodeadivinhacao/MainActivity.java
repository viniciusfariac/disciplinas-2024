package com.example.jogodeadivinhacao;

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
    public void jogo (View view){
        EditText palpite = findViewById(R.id.editText_palpite);
        TextView resultado = findViewById(R.id.textView_resultado);
        TextView resulPalpite = findViewById(R.id.editText_palpite);
        int numero = (int) (Math.random() * 100);
        int palpiteUsuario;
        do {
            palpiteUsuario = Integer.parseInt(palpite.getText().toString());

            if (palpiteUsuario < numero){
                resultado.setText("O número é maior!");
            } else if (palpiteUsuario > numero) {
                resultado.setText("O número é menor!");
            }
        } while (palpiteUsuario != numero);

        resultado.setText("Você acertou!");
        resulPalpite.setText(String.valueOf(numero));
    }
}