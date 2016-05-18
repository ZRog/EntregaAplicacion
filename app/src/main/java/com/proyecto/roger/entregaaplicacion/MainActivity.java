package com.proyecto.roger.entregaaplicacion;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    Button siguiente;
    DatePicker dp;
    TextInputEditText tietN,tietE,tietT,tietD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tietN = (TextInputEditText) findViewById(R.id.TietN);
        tietE = (TextInputEditText) findViewById(R.id.TietE);
        tietT = (TextInputEditText) findViewById(R.id.TietT);
        tietD = (TextInputEditText) findViewById(R.id.TietD);

        siguiente = (Button)findViewById(R.id.Sgt);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = tietN.getText().toString();
                String email = tietE.getText().toString();
                String telefono = tietT.getText().toString();
                String descripcion = tietD.getText().toString();

                dp = (DatePicker) findViewById(R.id.DP);
                String dia = Integer.toString(dp.getDayOfMonth());
                String mes = Integer.toString((1+dp.getMonth()));
                String año = Integer.toString(dp.getYear());

                Intent intent = new Intent(MainActivity.this,Datos.class);

                intent.putExtra("Nombre",nombre);
                intent.putExtra("Email",email);
                intent.putExtra("Telefono",telefono);
                intent.putExtra("Descripcion",descripcion);
                intent.putExtra("Dia",dia);
                intent.putExtra("Mes",mes);
                intent.putExtra("Año",año);

                startActivity(intent);
            }
        });
    }

}
