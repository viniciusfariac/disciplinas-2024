package com.example.atividadeavaliativa;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDao userDAO;
    private EditText nameEditText, emailEditText, idEditText, sobrenomeEditText, telefoneEditText;
    private TextView usersTextView;

    @SuppressLint("MissingInflatedId")
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
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        usersTextView = findViewById(R.id.usersTextView);
        idEditText = findViewById(R.id.idEditText);
        sobrenomeEditText = findViewById(R.id.sobrenomeEditText);
        telefoneEditText = findViewById(R.id.telefoneEditText);

        userDAO = new UserDao(this);
        userDAO.open();
    }

    public void addLista(View view){
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String sobrenome = sobrenomeEditText.getText().toString();
        int telefone = Integer.parseInt(telefoneEditText.getText().toString());
        User user = new User(0, name, email, sobrenome, telefone);
        userDAO.addUser(user);
        nameEditText.setText("");
        emailEditText.setText("");
        sobrenomeEditText.setText("");
        telefoneEditText.setText("");
    }

    public void removeList(View view){
        int id = Integer.parseInt(idEditText.getText().toString());
        userDAO.deleteUser(id);
        idEditText.setText("");
    }
    public void verLista(View view){
        List<User> users = userDAO.getAllUsers();
        StringBuilder userList = new StringBuilder();
        for (User user : users){
            userList.append("ID: ").append(user.getId())
                    .append(", Name: ").append(user.getName())
                    .append(", Email: ").append(user.getEmail())
                    .append(", Sobrenome: ").append(user.getSobrenome())
                    .append(", Selefone: ").append(user.getTelefone())
                    .append("\n");
        }
        usersTextView.setText(userList.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        userDAO.close();
    }
}