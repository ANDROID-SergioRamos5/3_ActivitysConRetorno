package com.example.a3_activitysconretorno;

import android.content.Intent;
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
        Toast.makeText(this,getIntent().getStringExtra("ENTRADA"), Toast.LENGTH_LONG).show();

        Intent datos = new Intent();
        datos.putExtra("SALIDA", "Finalizada Activity 1");
        setResult(RESULT_OK, datos);
    }

    @Override
    public void onBackPressed()
    {



    }
}
