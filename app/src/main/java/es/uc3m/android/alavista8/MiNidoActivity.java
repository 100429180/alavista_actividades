package es.uc3m.android.alavista8;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import es.uc3m.android.alavista8.databinding.ActivityMiNidoBinding;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



/*public class MiNidoActivity extends AppCompatActivity
        implements BottomNavigationView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_nido);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.mi_nido_item) {
            Log.d(this.getClass().getName(), "User tapped profile");
            // TODO open profile activity or fragment

        } else if (itemId == R.id.pajaroteca_item) {
            Log.d(this.getClass().getName(), "User tapped settings");
            // TODO open settings activity or fragment

        } else if (itemId == R.id.scanner_item) {
            Log.d(this.getClass().getName(), "User clicked on home");
            // TODO open home activity or fragment

        } else if (itemId == R.id.mapa_item) {
            Log.d(this.getClass().getName(), "User clicked on home");
            // TODO open home activity or fragment
        }
        return true;
    }

}*/

public class MiNidoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_nido);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.mi_nido_item);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.mi_nido_item) {
                // Código para la opción Mi Nido
                return true;
            } else if (item.getItemId() == R.id.pajaroteca_item) {
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


