package com.example.denis.gestionacademica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class signUp_GA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__g);

    }
    public void clickRegistrarNuevo(View v){
        //Validaciones
        //guardar en base de datos
        //etc


        Intent intent=new Intent(signUp_GA.this,LoginGAActivity.class);

        signUp_GA.this.startActivity(intent);
        finish();

    }
}
