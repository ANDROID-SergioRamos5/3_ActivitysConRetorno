package com.example.a3_activitysconretorno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity1 extends AppCompatActivity {

    TextView texto;
    Button boton;
    @Override
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        setContentView(R.layout.activity1);
        Toast.makeText(this,getIntent().getStringExtra("ENTRADA"), Toast.LENGTH_LONG).show();

        boton = (Button)findViewById(R.id.boton_vueltaActivity1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent datos = new Intent();
                datos.putExtra("SALIDA", "Finalizada Activity 1");
                setResult(RESULT_OK, datos);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        Intent datos = new Intent();
        datos.putExtra("SALIDA", "Finalizada Activity 1");
        setResult(RESULT_CANCELED, datos);
        finish();
    }
}
