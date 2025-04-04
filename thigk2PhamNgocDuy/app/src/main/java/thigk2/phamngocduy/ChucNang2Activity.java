package thigk2.phamngocduy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityChucNang2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Chức năng 2");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        // Ánh xạ
        Button btnKiemTra = findViewById(R.id.btnKiemTra);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        // Xử lý nút Kiểm tra Đúng/Sai
        btnKiemTra.setOnClickListener(v -> {
            // Giả sử thông tin là sai (có thể thay đổi logic kiểm tra)
            tvKetQua.setText("Thông tin: Sai");
        });
    }
}