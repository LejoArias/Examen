package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView name;
    private TextView lastname;

    private Button calculo;

    private EditText rojo;

    private EditText blanco;

    int tomate;

    int cebolla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        name = (TextView) findViewById(R.id.nombre_txt);
        lastname = (TextView) findViewById(R.id.apellido_txt);
        rojo = (EditText) findViewById(R.id.uni_tomate);
        blanco = (EditText) findViewById(R.id.uni_cebolla);
        calculo =(Button) findViewById(R.id.ingresar_btn);


        String nombre = getIntent().getStringExtra("Nombre");
        String apellido = getIntent().getStringExtra("Apellido");

        name.setText("Nombre: "+ nombre);
        lastname.setText("Apellido : "+apellido);


        public void calcular(View view){
            tomate = 2000;
            cebolla = 3000;





        }


    }
}