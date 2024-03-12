package es.uc3m.android.alavista8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_MiNido = findViewById(R.id.button_miNido);
        Button button_Pajaroteca = findViewById(R.id.button_pajaroteca);
        Button button_Scanner = findViewById(R.id.button_scanner);
        Button button_Mapa = findViewById(R.id.button_mapa);

        button_MiNido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en "Mi Nido"
                startActivity(new Intent(MainActivity.this, MiNidoActivity.class));
            }
        });

        button_Pajaroteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en "Pajaroteca"
                startActivity(new Intent(MainActivity.this, PajarotecaActivity.class));
            }
        });

        button_Scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en "Scanner"
                startActivity(new Intent(MainActivity.this, ScannerActivity.class));
            }
        });

        button_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en "Mapa"
                startActivity(new Intent(MainActivity.this, MapaActivity.class));
            }
        });


    }
}