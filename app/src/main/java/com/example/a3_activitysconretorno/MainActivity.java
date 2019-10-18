package com.example.a3_activitysconretorno;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 =(Button)findViewById(R.id.boton_activity1);
        boton1.setOnClickListener(this);
        boton2 =(Button)findViewById(R.id.boton_activity2);
        boton2.setOnClickListener(this);



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

}
