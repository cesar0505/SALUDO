package com.example.semana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText texto;
    public Button accion;
    public TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=(EditText) findViewById(R.id.edtNombre);
        accion=(Button) findViewById(R.id.btnSaludo);
        mensaje=(TextView) findViewById(R.id.txtsalida);
    }

    public void elclic(View view){

        String cadena=texto.getText().toString();

        Toast.makeText(getApplicationContext(),cadena,Toast.LENGTH_LONG).show();

        mensaje.setText("Hola " + cadena );

    }
}