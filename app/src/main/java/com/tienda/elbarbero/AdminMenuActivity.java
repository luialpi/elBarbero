package com.tienda.elbarbero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMenuActivity extends AppCompatActivity {

    Button btnHabilitar;
    Button btnConsultar;
    Button btnAddBarb;
    Button btnAddProduct;
    Button btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        //Cambiar el titulo de la pantalla
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Administrador");

        btnHabilitar = (Button) findViewById(R.id.buttonCitas);
        btnAddBarb = (Button) findViewById(R.id.buttonAddBarb);
        btnConsultar = (Button) findViewById(R.id.buttonConsult);
        btnAddProduct = (Button) findViewById(R.id.buttonAddProdct);
        btnLogOut = (Button) findViewById(R.id.buttonExit);

        //Salir del modo administrador
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminMenuActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });


    }
}
