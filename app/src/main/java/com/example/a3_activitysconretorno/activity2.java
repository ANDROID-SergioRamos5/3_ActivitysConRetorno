package com.example.a3_activitysconretorno;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        setContentView(R.layout.activity2);

        Toast.makeText(this,getIntent().getStringExtra("ENTRADA"), Toast.LENGTH_LONG).show();
    }
}
