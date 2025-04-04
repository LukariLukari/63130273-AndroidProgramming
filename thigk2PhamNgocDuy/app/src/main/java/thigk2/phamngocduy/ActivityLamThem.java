package thigk2.phamngocduy;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityLamThem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lam_them);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Làm thêm");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        ListView listView = findViewById(R.id.listViewBonus);

        // Danh sách bài bonus (giả lập)
        String[] bonusItems = {
                "Bài bonus 1",
                "Bài bonus 2",
                "Bài bonus 3",
                "Bài bonus 4"
        };

        // Tạo adapter cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bonusItems);
        listView.setAdapter(adapter);
    }
}