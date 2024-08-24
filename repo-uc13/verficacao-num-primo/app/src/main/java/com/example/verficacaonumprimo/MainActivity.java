package com.example.verficacaonumprimo;

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
    public void enviar (View view) {

        EditText num = findViewById(R.id.editText_num);
        int valor = Integer.parseInt(num.getText().toString());

        boolean primo = true;
        if (valor <= 1) {
            primo = false;
        } else {
           for(int i = 2; i < valor; i++) {
                if (valor % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            Toast.makeText(this, "O valor é primo", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O valor não é primo", Toast.LENGTH_SHORT).show();;
        }
    }
}