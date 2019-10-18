package com.example.a3_activitysconretorno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {

    Button boton;

    @Override
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        setContentView(R.layout.activity2);

        Toast.makeText(this,getIntent().getStringExtra("ENTRADA"), Toast.LENGTH_LONG).show();

        boton = (Button)findViewById(R.id.boton_vueltaActivity2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent datos = new Intent();
                datos.putExtra("SALIDA", "Finalizada Activity 2");
                setResult(RESULT_OK, datos);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        Intent datos = new Intent();
        datos.putExtra("SALIDA", "Finalizada Activity 2");
        setResult(RESULT_CANCELED, datos);
        finish();
    }
}
