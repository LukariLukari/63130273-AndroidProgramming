package tiil.edu.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tham chiếu nút bấm
        Button btnSayHi = findViewById(R.id.btnSayHi);

        // Xử lý sự kiện khi nhấn nút
        btnSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị AlertDialog với thông báo "Xin chào!"
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Thông báo")
                        .setMessage("Xin chào!")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });
    }
}
