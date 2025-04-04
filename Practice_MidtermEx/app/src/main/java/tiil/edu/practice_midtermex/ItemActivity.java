package tiil.edu.practice_midtermex;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Item Activity");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Hiển thị nút back
        }

        TextView tvItem = findViewById(R.id.tvItem);

        // Lấy dữ liệu từ Intent
        String item = getIntent().getStringExtra("item");
        if (item != null) {
            tvItem.setText(item);
            Toast.makeText(this, "Bạn đã chọn: " + item, Toast.LENGTH_SHORT).show();
        }
    }
}
