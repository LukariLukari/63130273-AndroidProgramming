package thigk2.phamngocduy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        EditText edtMonth = findViewById(R.id.edtMonth);
        EditText edtYear = findViewById(R.id.edtYear);
        Button btnCheck = findViewById(R.id.btnCheck);
        TextView txtResult = findViewById(R.id.txtResult);

        btnCheck.setOnClickListener(v -> {
            String month = edtMonth.getText().toString().trim();
            String year = edtYear.getText().toString().trim();

            if (month.equals("4") && year.equals("1975")) {
                txtResult.setText("Chính xác! Chiến dịch Hồ Chí Minh toàn thắng.");
            } else {
                txtResult.setText("Sai rồi! Hãy thử lại.");
            }
        });
    }
}