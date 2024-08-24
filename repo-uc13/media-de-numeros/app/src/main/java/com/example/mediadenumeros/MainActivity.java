package com.example.mediadenumeros;

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
    public void media (View view){
        EditText n1 = findViewById(R.id.editText_num);
        TextView media = findViewById(R.id.textView_resul);
        double soma = 0;
        int quantidade = Integer.parseInt(n1.getText().toString());
        for (int i = 1; i <= quantidade; i++) {
            EditText numeroInput = findViewById(getResources().getIdentifier("editText_num" + i, "id", getPackageName()));
            double numero = Double.parseDouble(numeroInput.getText().toString());
            soma += numero;
        }

        double mediaResultado = soma / quantidade;
        media.setText("Média: " + mediaResultado);

    }
}