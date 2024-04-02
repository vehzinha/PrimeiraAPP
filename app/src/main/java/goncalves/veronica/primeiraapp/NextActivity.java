package goncalves.veronica.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent();//obtem a intencao de mainActivity//
        String textoDigitado = i.getStringExtra("texto");//obtem o texto digitado da intencao//
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado);//muda o texto do next activity//
        startActivity(i);
    }
}
