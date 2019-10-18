package com.example.a3_activitysconretorno;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1;
    Button boton2;
    Button volver1;
    Button volver2;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 =(Button)findViewById(R.id.boton_activity1);
        boton1.setOnClickListener(this);
        boton2 =(Button)findViewById(R.id.boton_activity2);
        boton2.setOnClickListener(this);

        volver1 = (Button) findViewById(R.id.boton_vueltaActivity1);
        volver2 = (Button) findViewById(R.id.boton_vueltaActivity2);

        texto = (TextView) findViewById(R.id.mostrarTexto);
    }
    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.boton_activity1)
        {
            Intent intento = new Intent(this, activity1.class);
            intento.putExtra("ENTRADA", "De la principal a la Activity 1");
            startActivityForResult(intento,1);
        }
        if (v.getId() == R.id.boton_activity2)
        {
            Intent intento = new Intent(this, activity2.class);
            intento.putExtra("ENTRADA", "De la principal a la Activity 2");
            startActivityForResult(intento,2);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode)
        {
            case 1:
                if(resultCode == activity1.RESULT_OK)
                {
                    texto.setText(data.getStringExtra("SALIDA"));
                }
                if(resultCode == activity1.RESULT_CANCELED)
                {
                    texto.setText(data.getStringExtra("SALIDA"));
                }
            case 2:
            {
                if(resultCode == activity1.RESULT_OK)
                {
                    texto.setText(data.getStringExtra("SALIDA"));
                }
                if(resultCode == activity1.RESULT_CANCELED)
                {
                    texto.setText(data.getStringExtra("SALIDA"));
                }
            }
        }
    }
}
