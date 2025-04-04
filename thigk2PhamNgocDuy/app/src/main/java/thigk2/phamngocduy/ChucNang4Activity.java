package thigk2.phamngocduy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ChucNang4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang4);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Chức năng 4");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách hoạt động kỷ niệm
        List<ActivityKyNiem> kyNiemList = new ArrayList<>();
        kyNiemList.add(new ActivityKyNiem("Ảnh kỷ yếu hoạt động 1", android.R.drawable.ic_menu_gallery));
        kyNiemList.add(new ActivityKyNiem("Ảnh kỷ yếu hoạt động 2", android.R.drawable.ic_menu_camera));
        kyNiemList.add(new ActivityKyNiem("Ảnh kỷ yếu hoạt động 3", android.R.drawable.ic_menu_search));

        // Gắn adapter vào RecyclerView
        KyNiemAdapter adapter = new KyNiemAdapter(this, kyNiemList);
        recyclerView.setAdapter(adapter);
    }
}