package com.tienda.elbarbero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tienda.elbarbero.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para quitar el nombre que aparece por defecto en el action bar
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("");

        //cambia al siguiente
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);

    }
}
