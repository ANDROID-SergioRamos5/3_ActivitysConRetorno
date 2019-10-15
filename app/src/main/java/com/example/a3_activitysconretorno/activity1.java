package com.example.a3_activitysconretorno;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity1 extends AppCompatActivity {

    TextView texto;

    @Override
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        setContentView(R.layout.activity1);
    }

    @Override
    public void onBackPressed() {

        texto = (TextView)findViewById(R.id.textoVuelta);
        texto.setText("Vuelves de la Activity 1");

    }
}
