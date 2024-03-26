package goncalves.veronica.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {   // Tela principal da Aplicacao //
    @Override

    protected void onCreate(Bundle savedInstanceState) { //metodo chamado quando uma tela e criada//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //constroi elementos de interface, definidos no arquivo xml//

        Button btnEnviar = findViewById(R.id.btnEnviar);  //obtem o botao atraves de seu id//
        btnEnviar.setOnClickListener(new View.OnClickListener() { //define acao do botao ao clicar//
            @Override
            public void onClick(View v) { //exexuta a acao no clique do botao//
                EditText etDigiteAqui= findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);

            }
        });

    }
}