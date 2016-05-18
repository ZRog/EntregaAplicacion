package com.proyecto.roger.entregaaplicacion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Datos extends AppCompatActivity {

    TextView tvN,tvF,tvT,tvE,tvD;
    Button btn;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);

        btn = (Button)findViewById(R.id.Btn);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        String fecha = parametros.getString("Dia") + "/" + parametros.getString("Mes") + "/" + parametros.getString("Año");
        String telefono = parametros.getString("Telefono");
        String email = parametros.getString("Email");
        String descripcion = parametros.getString("Descripcion");

        tvN = (TextView) findViewById(R.id.tvn);
        tvN.setText(nombre);
        tvF = (TextView) findViewById(R.id.tvf);
        tvF.setText(fecha);
        tvT = (TextView) findViewById(R.id.tvt);
        tvT.setText(telefono);
        tvE = (TextView) findViewById(R.id.tve);
        tvE.setText(email);
        tvD = (TextView) findViewById(R.id.tvd);
        tvD.setText(descripcion);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
