package com.example.formularioecoenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Aquí enlazo la variable de java boton con el boton visual
        Button btnEnvj = findViewById(R.id.btnEnv);

        //Aqui creamos el boton de captura del nombre
        EditText nombrej = findViewById(R.id.nombre);

        EditText telefonoj = findViewById(R.id.telefono);

        //Pongo el boton a escuchar
        btnEnvj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensaje = "Gracias " + nombrej.getText().toString() + " Telefono " + telefonoj.getText().toString();
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();

                //Voy a lanzar el mensaje de que el boton fue oprimido
                //Toast.makeText(getApplicationContext(),"Formulario Enviado",Toast.LENGTH_SHORT).show();
            }
        });

        //Mejorada
        /*btnEnvj.setOnClickListener(v -> {

                    String mensaje = "Gracias " + nombrej.getText().toString() + " Telefono " + telefonoj.getText().toString();
                    Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();

                    //Voy a lanzar el mensaje de que el boton fue oprimido
                    //Toast.makeText(getApplicationContext(),"Formulario Enviado",Toast.LENGTH_SHORT).show();
                }
        );*/


    }
}