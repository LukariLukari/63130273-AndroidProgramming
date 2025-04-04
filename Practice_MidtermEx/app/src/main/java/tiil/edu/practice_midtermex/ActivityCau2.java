package tiil.edu.practice_midtermex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class ActivityCau2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Activity Câu 2");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Hiển thị nút back
        }

        ListView listView = findViewById(R.id.listView);

        // Danh sách bài hát (có thể thay đổi nội dung)
        String[] songs = {"Bài hát 1", "Bài hát 2", "Bài hát 3", "Bài hát 4", "Bài hát 5"};

        // Tạo adapter cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs);
        listView.setAdapter(adapter);

        // Xử lý sự kiện click vào item
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedSong = songs[position];
            Intent intent = new Intent(ActivityCau2.this, ItemActivity.class);
            intent.putExtra("item", selectedSong);
            startActivity(intent);
        });
    }
}
