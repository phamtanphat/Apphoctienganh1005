package khoapham.ptp.phamtanphat.apphoctienganh1005;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.Viewholder>{

    ArrayList<Word> mangword;

    public WordAdapter(ArrayList<Word> mangword) {
        this.mangword = mangword;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.dong_item_word,viewGroup,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, final int position) {
        final Word word = mangword.get(position);
        viewholder.txtEn.setText(word.getEn());
        viewholder.txtEn.setTextColor(Color.rgb(40,167,69));
        viewholder.txtVn.setText(word.isMemorized() ? "----" : word.getVn());
        viewholder.btnToggleWord.setText(word.isMemorized() ? "Forgot" : "isMemorized");
        viewholder.btnToggleWord.setBackgroundColor(word.isMemorized() ? Color.rgb(40,167,69) : Color.rgb(220,53,69));
        viewholder.btnToggleWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(position == word.getId())){
                    Toast.makeText(v.getContext(), "Từ khóa không tồn tại", Toast.LENGTH_SHORT).show();
                }
                mangword.set(position,new Word(word.getId(),word.getEn(),word.getVn(),!word.isMemorized()));
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mangword != null){
            return mangword.size();
        }else{
            return 0;
        }
        //return (mangword!= null) ? mangword.size() : 0;
    }



    class Viewholder extends RecyclerView.ViewHolder{
        TextView txtEn,txtVn;
        Button btnToggleWord , btnRemove;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txtEn = itemView.findViewById(R.id.textviewEn);
            txtVn = itemView.findViewById(R.id.textviewVn);
            btnToggleWord = itemView.findViewById(R.id.buttonToggleWord);
            btnRemove = itemView.findViewById(R.id.buttonRemoveWord);
        }
    }
}
