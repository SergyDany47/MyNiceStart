package com.example.mynicestart;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;

/**
 * @author SergioO
 * En esta clase RegisterActivity configuramos la funcionalidad del boton volver de la interfaz de registro
 */

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_volver = findViewById(R.id.material_btn_volver);
        btn_volver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}