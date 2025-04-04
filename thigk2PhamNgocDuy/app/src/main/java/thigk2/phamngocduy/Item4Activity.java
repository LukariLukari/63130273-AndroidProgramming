package thigk2.phamngocduy;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Item4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Item 4 Activity");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        TextView tvItem = findViewById(R.id.tvItem);

        // Lấy dữ liệu từ Intent
        String item = getIntent().getStringExtra("item");
        if (item != null) {
            tvItem.setText(item);
            Toast.makeText(this, "Bạn đã chọn: " + item, Toast.LENGTH_SHORT).show();
        }
    }
}