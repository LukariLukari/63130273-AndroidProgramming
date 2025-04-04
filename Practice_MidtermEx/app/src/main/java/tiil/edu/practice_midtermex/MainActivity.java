package tiil.edu.practice_midtermex;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Setting content view");
        setContentView(R.layout.activity_main);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            Log.d(TAG, "onCreate: Toolbar found, setting as support action bar");
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Practice_MidtermEx");
            }
        } else {
            Log.e(TAG, "onCreate: Toolbar is null");
        }

        // Ánh xạ các nút
        findViewById(R.id.btnCau1).setOnClickListener(v -> {
            Log.d(TAG, "onCreate: btnCau1 clicked");
            Intent intent = new Intent(MainActivity.this, ActivityCau1.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau2).setOnClickListener(v -> {
            Log.d(TAG, "onCreate: btnCau2 clicked");
            Intent intent = new Intent(MainActivity.this, ActivityCau2.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau3).setOnClickListener(v -> {
            Log.d(TAG, "onCreate: btnCau3 clicked");
            Intent intent = new Intent(MainActivity.this, ActivityCau3.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau4).setOnClickListener(v -> {
            Log.d(TAG, "onCreate: btnCau4 clicked");
            Intent intent = new Intent(MainActivity.this, ActivityCau4.class);
            startActivity(intent);
        });
    }
}