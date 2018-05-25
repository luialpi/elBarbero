package com.tienda.elbarbero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tienda.elbarbero.R;

public class LoginActivity extends AppCompatActivity {

    Button btnLogIn;
    Button btnRegister;
    EditText usrName;
    EditText passw;
    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Para quitar el nombre que aparece por defecto en el action bar
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("");

        btnLogIn = (Button) findViewById(R.id.buttonLogIn);
        btnRegister = (Button) findViewById(R.id.buttonRegister);
        usrName = (EditText) findViewById(R.id.editTextUserName);
        passw = (EditText) findViewById(R.id.editTextPassword);

        //Consultar por el usuario y redireccionarlo a la pantalla principal
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Por el momento redirecciona directamente
                //->falta completar la consulta a la BD
                user = usrName.getText().toString();
                pass = passw.getText().toString();
                Intent intentMain = new Intent(LoginActivity.this, MainMenuActivity.class);
                Intent intentAdmin = new Intent(LoginActivity.this, AdminMenuActivity.class);

                //Se valida que el nombre de usuario sea Admin
                if(user.equals("Admin") && pass.equals("admin")){

                    startActivity(intentAdmin);

                }else{

                    startActivity(intentMain);

                }

            }
        });

        //Enviar a la pantalla de registro
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
    }
}
