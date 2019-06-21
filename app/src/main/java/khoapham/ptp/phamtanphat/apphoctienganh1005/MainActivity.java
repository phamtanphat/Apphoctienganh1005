package khoapham.ptp.phamtanphat.apphoctienganh1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtEn,edtVn;
    Button btnAddWord,btnCancel;
    RecyclerView recyclerViewWords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVn = findViewById(R.id.edittextVn);
        edtEn = findViewById(R.id.edittextEn);
        btnAddWord = findViewById(R.id.buttonAddword);
        btnCancel = findViewById(R.id.buttonCancel);
        recyclerViewWords = findViewById(R.id.recyclerviewWords);
    }
}
