package khoapham.ptp.phamtanphat.apphoctienganh1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtEn,edtVn;
    Button btnAddWord,btnCancel;
    RecyclerView recyclerViewWords;
    ArrayList<Word> mangtuvung = new ArrayList<>();
    WordAdapter wordAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVn = findViewById(R.id.edittextVn);
        edtEn = findViewById(R.id.edittextEn);
        btnAddWord = findViewById(R.id.buttonAddword);
        btnCancel = findViewById(R.id.buttonCancel);
        recyclerViewWords = findViewById(R.id.recyclerviewWords);

        mangtuvung.add(new Word(0,"One","Một",true));
        mangtuvung.add(new Word(1,"Two","Hai",false));
        mangtuvung.add(new Word(2,"Three","Ba",false));
        mangtuvung.add(new Word(3,"Four","Bốn",false));
        mangtuvung.add(new Word(4,"Five","Năm",true));
        mangtuvung.add(new Word(5,"Six","Sáu",true));

        wordAdapter = new WordAdapter(mangtuvung);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewWords.setLayoutManager(linearLayoutManager);
        recyclerViewWords.setAdapter(wordAdapter);

    }
}
