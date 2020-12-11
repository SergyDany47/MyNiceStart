package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author SergioO
 * En esta clase LoginActivity damos funcionalidad al boton entrar de la interfaz de log in que nos redirigirá al main.
 * Tambien damos funcionalidad al texto "Registrate" para que al pulsar sobre él nos lleve a la interfaz de registro
 */

public class LoginActivity extends AppCompatActivity {
    private TextView txtRegistrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtRegistrate = (TextView) findViewById(R.id.txtRegistrate);
        txtRegistrate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegister();

            }

            private void openRegister() {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        Button btn_entrar = findViewById(R.id.material_btn_entrar);
        btn_entrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        });
    }
}