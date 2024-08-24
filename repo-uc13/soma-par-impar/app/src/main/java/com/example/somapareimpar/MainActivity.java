package com.example.somapareimpar;

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
    public void enviar(View view){
        EditText num = findViewById(R.id.editText_num);
        int valor = Integer.parseInt(num.getText().toString());

        TextView text = findViewById(R.id.textView2);

        if(valor % 2 == 0){
            int somaPares = 0;
            for (int i = 2; i <= valor; i +=2) {
                somaPares += i;
            }
            text.setText("A soma dos números pares é: " + somaPares);
        }else if(valor % 2 != 0){
            int somaImpares = 0;
            for (int i = 1; i <= valor; i +=2) {
                somaImpares += i;
            }
            text.setText("A soma dos números impares é: " + somaImpares);
        }
    }
}