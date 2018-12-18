package hshken.com.atm;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AgeActivity extends BaseActivity {
    private EditText edage;
    private int age;
    int[] numbers ={19,20,21,22,23,24,25,26,27,28,29,30};
    String rainbow = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        getResources().getStringArray(R.array.rainbow);
        RecyclerView ageRecyclerView = findViewById(R.id.recycle);
        ageRecyclerView.setHasFixedSize(true);
        ageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ageRecyclerView.setAdapter(new AgeAdapter());
        edage = findViewById(R.id.ed_age);
    }
    public void next(View view){
        int age = Integer.parseInt(edage.getText().toString());
        edage = findViewById(R.id.ed_age);
        user.setAge(age);


        //getSharedPreferences("AGE",MODE_PRIVATE)
        //        .edit()
         //       .putString("AGE",age)
         //       .apply();
        Intent gender = new Intent(this,GenderActivity.class);
        startActivity(gender);
    }
    public void back(View view){

        finish();
    }
    class  AgeAdapter extends RecyclerView.Adapter<AgeAdapter.AgeViewHolder>{
        @NonNull
        @Override
        //將設計藍圖變成可以使用的view    (XML→View)
        public AgeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.row, parent,false);
            return new AgeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull AgeViewHolder holder, final int position) {
            holder.ageText.setText(numbers[position] + "");
            holder.itemView.setBackgroundColor(Integer.parseInt(rainbow[position%6], 16));
               holder.ageText.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Log.d("AgeActivity", "onClick" +numbers[position]);
                       edage.setText(numbers[position]+"");
                   }
               });
        }


        @Override
        public int getItemCount() {
        // 有幾個number
            return numbers.length;
        }

        class AgeViewHolder extends RecyclerView.ViewHolder{
           //讀XML檔
            TextView ageText;
            public AgeViewHolder(View itemView) {
                super(itemView);
                ageText = itemView.findViewById(R.id.rowage);
            }
        }
    }
}
