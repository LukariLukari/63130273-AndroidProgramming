package tiil.edu.practice_midtermex;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các nút
        findViewById(R.id.btnCau1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityCau1.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau2).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityCau2.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau3).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityCau3.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCau4).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityCau4.class);
            startActivity(intent);
        });
    }
}