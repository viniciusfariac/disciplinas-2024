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
    public void btn_enviar (View view){

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        int number = Integer.parseInt(String.valueOf(editTextNumber.getText()));
        do{
            if (number == 5){
                Toast.makeText(this, "Este é o número certo "+number, Toast.LENGTH_SHORT).show();
                break;
            }
            else {
                Toast.makeText(this, "Este não é o certo", Toast.LENGTH_LONG).show();
                break;
            }
        }while(number > 10);
        Toast.makeText(this, "O número secreto está entre 1 e 10", Toast.LENGTH_LONG).show();
    }
}