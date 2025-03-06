package tiil.edu.ex5_addsubmuldiv_var;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
        //gắn các bộ lắng nghe
        btncong.setOnClickListener(bolangnghe_xulycong);
        btntru.setOnClickListener(bolangnghe_xulytru);
        btnnhan.setOnClickListener(bolangnghe_xulynhan);
        // btnchia.setOnClickListener(bolangnghe_xulychia);
        ///ẩn danh
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code xử lý chia
                String so_a = editTextsoa.getText().toString();
                String so_b = editTextsob.getText().toString();

                float a = Float.parseFloat(so_a);
                float b = Float.parseFloat(so_b);

                float thuong = a/b;
                String kq = String.valueOf(thuong);
                textViewkq.setText(kq);

            }
        });
    }
}