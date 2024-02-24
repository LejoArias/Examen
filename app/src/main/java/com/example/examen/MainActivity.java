package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText lastname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button ingresa = findViewById(R.id.ingresar_btn);
        name = (EditText) findViewById(R.id.nombre_et);
        lastname =(EditText) findViewById(R.id.apellido_et);


    }
    public void ingresar(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Nombre",name.getText().toString());
        intent.putExtra("Apellido",lastname.getText().toString());
        startActivity(intent);
    }
}