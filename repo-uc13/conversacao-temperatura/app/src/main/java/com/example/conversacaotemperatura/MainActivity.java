package com.example.conversacaotemperatura;

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
        TextView resfah = findViewById(R.id.textView_resul);
        TextView reskel = findViewById(R.id.textView_resul2);

        double celsius = Double.parseDouble(num.getText().toString());

        double fahrenheit = (celsius * 9 / 5) + 32;
        resfah.setText(String.format("%.2f", fahrenheit));

        double kelvin = celsius + 273.15;
        reskel.setText(String.format("%.2f", kelvin));

    }
}