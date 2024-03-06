package com.example.carla;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ELOAH extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);

        Log.i("AGENDA_CONTATO","Executando o onCreate");

        setContentView(R.layout.principal_layout);

        EditText edtNome = findViewById(R.id.input_nome);
        EditText edtEmail = findViewById(R.id.input_email);
        EditText edtTelefone = findViewById(R.id.editTextPhone2);

        Button btnEnviar = findViewById(R.id.btn_enviar);
        btnEnviar.setOnClickListener( e -> {
            Toast.makeText(this, "Botão apertado", Toast.LENGTH_LONG).show();
            Log.i("AGENDA_CONTATO","Nome:" + edtNome.getText());
            Log.i("AGENDA_CONTATO","Email:" + edtEmail.getText());
            Log.i("AGENDA_CONTATO","Telefone:" + edtTelefone.getText());
        }); ;


       // TextView txt = new TextView( this);
       // txt.setText(R.string.Hello);
       // setContentView(txt);
       //  setContentView(R.layout.principal_layout);
    }
}
