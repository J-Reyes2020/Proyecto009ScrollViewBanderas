package com.android.proyecto009scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtV1;

    String pais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacmos referencia a la etiqueta texto guia que nos indica cual país escoger.
        txtV1 = findViewById(R.id.txt1);

        //Creamos una variable en la cual se guarde el dato de la bandera
        //que se da aleatoriamente con el método Math.random
        int nro=(int)(Math.random()*8);
        switch (nro){
            case 0: pais="Peru";break;
            case 1: pais="RepublicaD";break;
            case 2: pais="Ecuador";break;
            case 3: pais="Bolivia";break;
            case 4: pais="Guatemala";break;
            case 5: pais="Bandera1";break;
            case 6: pais="Paraguay";break;
            case 7: pais="Mexico";break;
        }
        //Envíamos a la etiqueta principal el nombre del país que se nos fue dado
        //con anterioridad con el metodo anterio
        txtV1 = findViewById(R.id.txt1);
        txtV1.setText("Cuál es la bandera de..." + pais);
    }


    //Verificamos que la bandera a la cual le dio Click sea la misma a la dee la etiqueta principal
    public void onClickPresionar(View view) {
        //Hacemos instancia al boton creada con una vairable
        ImageButton b = (ImageButton) view;
        //Convertimos el texto "Tag" de la bandera a un String para poder verificar que sea el misma el cual esta solicitando
        if(b.getTag().toString().equals(pais)){
            //En caso que sea el mismo enviamos este mensaje.

            Toast.makeText(this,"¡Correcto!", Toast.LENGTH_LONG).show();
        }else{
            //De lo contrario envíamos este mensaje
            Toast.makeText(this,"¡Incorrecto! " + b.getTag().toString(), Toast.LENGTH_LONG).show();
        }
    }

}