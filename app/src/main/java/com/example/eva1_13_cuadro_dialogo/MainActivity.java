package com.example.eva1_13_cuadro_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //EVENTOS CLICK
    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de Android")
                .setMessage("Hola Mundo")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton OK", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton NO", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton CANCEL", Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();
    }

    public void onClickCDCustom(View v){
        Dialog dlgMiCuadroDialogo = new Dialog(this);

        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);

        TextView txtVwTitu;
        EditText edtTextDatos;
        Button btnAccion;
        txtVwTitu = dlgMiCuadroDialogo.findViewById(R.id.txtVwTitulo);
        edtTextDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtVwTitu.setText("Este es un cuadro de dialogo personalizado");

        btnAccion.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(), edtTextDatos.getText().toString(),
                                Toast.LENGTH_SHORT).show();
                        dlgMiCuadroDialogo.dismiss();
                    }
                }
        );
        dlgMiCuadroDialogo.show();
    }
}