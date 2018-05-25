package com.tienda.elbarbero;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactsActivity extends AppCompatActivity {

    Button btnCallSanta;
    Button btnCallHeredia;
    Button btnCallAlajuela;
    Button btnCallPinares;

    private String phoneNumber1 = "22829922";
    private String phoneNumber2 = "22609777";

    private final int PHONE_CALL_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        //Para quitar el nombre que aparece por defecto en el action bar
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Contactos");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCallSanta = (Button) findViewById(R.id.buttonCallSantaAna);
        btnCallPinares = (Button) findViewById(R.id.buttonCallPinares);
        btnCallHeredia = (Button) findViewById(R.id.buttonCallHeredia);
        btnCallAlajuela = (Button) findViewById(R.id.buttonCallAlajuela);

        //Boton para llamar a santa ana
        btnCallSanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(phoneNumber1 != null){
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                        newVersions();

                    }else{

                        olderVersions(phoneNumber1);

                    }

                }

            }

            private void olderVersions(String phoneNumber){
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));

                if (CheckPermissions(Manifest.permission.CALL_PHONE)){

                    startActivity(intentCall);

                }else{

                    Toast.makeText(ContactsActivity.this, "You declined the access",
                            Toast.LENGTH_SHORT).show();
                }

            }

            private void newVersions(){

                requestPermissions(new String[]{
                        Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);

            }
        });

        //Boton para llamar a la sede Pinares
        btnCallPinares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(phoneNumber1 != null){
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                        newVersions();

                    }else{

                        olderVersions(phoneNumber1);

                    }

                }

            }

            private void olderVersions(String phoneNumber){
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));

                if (CheckPermissions(Manifest.permission.CALL_PHONE)){

                    startActivity(intentCall);

                }else{

                    Toast.makeText(ContactsActivity.this, "You declined the access",
                            Toast.LENGTH_SHORT).show();
                }

            }

            private void newVersions(){

                requestPermissions(new String[]{
                        Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);

            }

        });
        //Boton para llamar a la sede heredia
        btnCallHeredia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(phoneNumber2 != null){
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                        newVersions();

                    }else{

                        olderVersions(phoneNumber2);

                    }

                }

            }

            private void olderVersions(String phoneNumber){
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));

                if (CheckPermissions(Manifest.permission.CALL_PHONE)){

                    startActivity(intentCall);

                }else{

                    Toast.makeText(ContactsActivity.this, "You declined the access",
                            Toast.LENGTH_SHORT).show();
                }

            }

            private void newVersions(){

                requestPermissions(new String[]{
                        Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);

            }

        });
        //Boton para llamar sede Alajuela
        btnCallAlajuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(phoneNumber1 != null){
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                        newVersions();

                    }else{

                        olderVersions(phoneNumber1);

                    }

                }

            }

            private void olderVersions(String phoneNumber){
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));

                if (CheckPermissions(Manifest.permission.CALL_PHONE)){

                    startActivity(intentCall);

                }else{

                    Toast.makeText(ContactsActivity.this, "You declined the access",
                            Toast.LENGTH_SHORT).show();
                }

            }

            private void newVersions(){

                requestPermissions(new String[]{
                        Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);

            }

        });

    }

    private boolean CheckPermissions(String permission){
        int result = this.checkCallingOrSelfPermission(permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults){

        if(requestCode == PHONE_CALL_CODE){

            String permission = permissions[0];
            int result = grantResults[0];

            if(permission.equals(Manifest.permission.CALL_PHONE)){

                if(result == PackageManager.PERMISSION_GRANTED){

                    Intent intentCall = new Intent(Intent.ACTION_CALL,
                            Uri.parse("tel:"+phoneNumber1));
                    startActivity(intentCall);

                }else{

                    Toast.makeText(ContactsActivity.this, "You declined the access",
                            Toast.LENGTH_SHORT).show();

                }

            }

        }
    }
}
