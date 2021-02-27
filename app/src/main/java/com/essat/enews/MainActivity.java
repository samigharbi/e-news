package com.essat.enews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btConnecter;
    Button btQuitter;
    EditText txtLogin;
    EditText txtPassword;
    int nbEssaisRestant = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //lier la fenêtre au fichier design
        setContentView(R.layout.activity_main);
        //lier les composants au design
        btConnecter = findViewById(R.id.bt_connecter);
        btQuitter = findViewById(R.id.bt_quitter);
        txtLogin = findViewById(R.id.txt_login);
        txtPassword = findViewById(R.id.txt_password);
        //Listeners
        btQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = txtLogin.getText().toString();
                String password = txtPassword.getText().toString();
                if (login.equals("essat") && password.equals("123")) {
                    //ouvrir la fenetre ListNews
                    Intent fenetre = new Intent(MainActivity.this, ListNews.class);
                    startActivity(fenetre);
                } else {
                    //afficher un message d'erreur
                    Toast.makeText(MainActivity.this, R.string.error_login, Toast.LENGTH_LONG).show();
                    txtPassword.setText("");
                    nbEssaisRestant--;
                }
            }
        });

    }

}