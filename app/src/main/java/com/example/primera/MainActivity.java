package com.example.primera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);
        actualizar();
    }

    @Override
    public void onClick(View view) {
        if (view == boton)
            actualizar();
    }

    // actualizar la fecha y hora
    private void actualizar() {
        texto.setText(new Date().toString());
    }
}
