package thigk2.phamngocduy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityChucNang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Chức năng 3");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        ListView listView = findViewById(R.id.listView);

        // Danh sách SV
        String[] students = {
                "Thành tích SV Giỏi",
                "Giải phóng Miền Nam",
                "Đánh bại trước niên vụ",
                "Bại cả thành phố",
                "Mùa sự kiện trước"
        };

        // Tạo adapter cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students);
        listView.setAdapter(adapter);

        // Xử lý sự kiện click vào item
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedStudent = students[position];
            Intent intent = new Intent(ActivityChucNang3.this, Item3Activity.class);
            intent.putExtra("item", selectedStudent);
            startActivity(intent);
        });
    }
}
