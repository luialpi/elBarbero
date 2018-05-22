package com.tienda.elbarbero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    Button btnRegister;
    EditText usrName;
    EditText phone;
    EditText email;
    EditText passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Cambiar el titulo de la pantalla
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Registro");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRegister = (Button) findViewById(R.id.buttonRegister);
        usrName = (EditText) findViewById(R.id.editTextUserName);
        phone = (EditText) findViewById(R.id.editTextPhone);
        email = (EditText) findViewById(R.id.editTextEmail);
        passw = (EditText) findViewById(R.id.editTextPassword);
    }
}
