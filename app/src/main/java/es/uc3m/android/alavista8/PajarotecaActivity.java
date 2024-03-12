package es.uc3m.android.alavista8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class PajarotecaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajaroteca);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.button_pajaroteca);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.pajaroteca_item) {
                // Código para la opción Mi Nido
                return true;
            } else if (item.getItemId() == R.id.mi_nido_item) {
                startActivity(new Intent(getApplicationContext(), PajarotecaActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.scanner_item) {
                startActivity(new Intent(getApplicationContext(), ScannerActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.mapa_item) {
                startActivity(new Intent(getApplicationContext(), MapaActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }
}
