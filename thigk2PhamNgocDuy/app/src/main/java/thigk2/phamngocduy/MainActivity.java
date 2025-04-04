package thigk2.phamngocduy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Quiz");
        }

        // Ánh xạ các nút
        findViewById(R.id.btnChucNang2).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityChucNang2.class);
            startActivity(intent);
        });

        findViewById(R.id.btnChucNang3).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityChucNang3.class);
            startActivity(intent);
        });

        findViewById(R.id.btnChucNang4).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityChucNang4.class);
            startActivity(intent);
        });

        findViewById(R.id.btnAboutMe).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityAboutMe.class);
            startActivity(intent);
        });

        findViewById(R.id.btnLamThem).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityLamThem.class);
            startActivity(intent);
        });
    }
}