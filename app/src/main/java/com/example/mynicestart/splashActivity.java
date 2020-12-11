package com.example.mynicestart;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author SergioO
 * En esta clase SplashActivity configuramos y damos funcionalidad al splash de nuestra aplicacion
 */

public class splashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView txt_poweredby = findViewById(R.id.txt_poweredby);
        ImageView logo_central = findViewById(R.id.logo_central);
        ImageView logo_bajo = findViewById(R.id.logo_bajo);

        logo_central.setAnimation(animacion1);
        txt_poweredby.setAnimation(animacion2);
        logo_bajo.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3500);
    }
}
