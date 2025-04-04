package tiil.edu.practice_midtermex;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityCau1 extends AppCompatActivity {

    private static final String TAG = "ActivityCau1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Setting content view");
        setContentView(R.layout.activity_cau1);

        // Thiết lập Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            Log.d(TAG, "onCreate: Toolbar found, setting as support action bar");
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Activity Câu 1");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
            toolbar.setNavigationOnClickListener(v -> onBackPressed());
        } else {
            Log.e(TAG, "onCreate: Toolbar is null");
        }

        // Ánh xạ các thành phần
        EditText edtSoA = findViewById(R.id.edtSoA);
        EditText edtSoB = findViewById(R.id.edtSoB);
        Button btnTinhTong = findViewById(R.id.btnTinhTong);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        if (edtSoA == null || edtSoB == null || btnTinhTong == null || tvKetQua == null) {
            Log.e(TAG, "onCreate: One or more views are null");
            return;
        }

        btnTinhTong.setOnClickListener(v -> {
            try {
                double soA = Double.parseDouble(edtSoA.getText().toString());
                double soB = Double.parseDouble(edtSoB.getText().toString());
                double tong = soA + soB;
                tvKetQua.setText("Kết quả: " + tong);
            } catch (NumberFormatException e) {
                tvKetQua.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}