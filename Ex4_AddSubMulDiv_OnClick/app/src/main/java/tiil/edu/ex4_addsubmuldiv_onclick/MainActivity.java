package cntt.edu.ex4_addsubmuldiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khia bao cac doi tuong gan voi dieu khien tuong ung
    EditText editText1;
    EditText editText2;
    EditText editTextkq;
    Button nutcong, nuttru, nutnhan, nutchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
    }
    void timdieukhien(){
        editText1 = findViewById(R.id.edtsomot);
        editText2 = findViewById(R.id.edtsohai);
        editTextkq = findViewById(R.id.edtkq);
        nutcong = (Button) findViewById(R.id.btncong);
        nuttru = (Button) findViewById(R.id.btntru);
        nutnhan = (Button) findViewById(R.id.btnnhan);
        nutchia = (Button) findViewById(R.id.btnchia);
    }

