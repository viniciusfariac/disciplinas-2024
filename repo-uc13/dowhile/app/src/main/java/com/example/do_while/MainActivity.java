package com.example.do_while;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
    public void enviar (View view){
        EditText numero = findViewById(R.id.editText_enviar);
        int valor;

        do {
            valor = Integer.parseInt(numero.getText().toString());
            if (valor <= 0) {
                Toast.makeText(this, "Digite um número positivo", Toast.LENGTH_SHORT).show();
            }
        } while (valor <=0);
        Toast.makeText(this, "Este número é positivo", Toast.LENGTH_SHORT).show();
    }
}