package com.example.unihelp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    //Una ultima prueba

    private SharedPreferences myPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        Log.d("Sucess","App is running");
        Objects.requireNonNull(getSupportActionBar()).hide();
        myPrefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
    }
    public void start(View view){
        boolean isFirstTime = myPrefs.getBoolean("isFirstTime", true);
        if (isFirstTime) go_to_intro_de_datos();
        else go_to_inicio();
    }
    public void go_to_intro_de_datos(){
        Intent intent = new Intent(this,intro_de_datos.class);
        startActivity(intent);
        finish();
    }
    public void go_to_inicio(){
        Intent intent = new Intent(this,inicio.class);
        startActivity(intent);
        finish();
    }
}