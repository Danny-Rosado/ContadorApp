package com.emilianorosado.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mBotonContar, mBotonLimpiar;
    EditText mConteo;ºº QW3C
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotonContar = (Button) findViewById(R.id.boton_contar);
        mBotonLimpiar = (Button) findViewById(R.id.boton_limpiar);
        mConteo = (EditText) findViewById(R.id.campo_conteo);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                mConteo.setText("" +x);
            }
        });
        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mConteo.setText("0");
            }
        });
    }
}
