package tiil.edu.practice_midtermex;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.widget.Toolbar;

public class ActivityCau3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Activity Câu 3");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Hiển thị nút back
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách bài hát (sử dụng hình ảnh mặc định của Android)
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("Bài hát 1", android.R.drawable.ic_menu_gallery));
        songList.add(new Song("Bài hát 2", android.R.drawable.ic_menu_camera));
        songList.add(new Song("Bài hát 3", android.R.drawable.ic_menu_search));
        songList.add(new Song("Bài hát 4", android.R.drawable.ic_menu_info_details));
        songList.add(new Song("Bài hát 5", android.R.drawable.ic_menu_help));

        // Gắn adapter vào RecyclerView
        SongAdapter adapter = new SongAdapter(this, songList);
        recyclerView.setAdapter(adapter);
    }
}