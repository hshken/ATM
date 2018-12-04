package hshken.com.atm;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AgeActivity extends BaseActivity {
    private EditText edage;
    private String age;
    int[] numbers ={19,20,21,22,23,24,25};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void next(View view){
        edage = findViewById(R.id.ed_age);
       int age = Integer.parseInt(edage.getText().toString());
        user.setAge(age);
        RecyclerView ageRecyclerView = findViewById(R.id.recycle);
        ageRecyclerView.setHasFixedSize(true);
        ageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ageRecyclerView.setAdapter(new AgeAdapter());

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
        public AgeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.row, parent,false);
            return new AgeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull AgeViewHolder holder, int position) {
            holder.ageText.setText(numbers[position] + "");
               if (numbers[position] ==19)
                holder.ageText.setTextColor(Color.RED);
        }

        @Override
        public int getItemCount() {
            return numbers.length;
        }

        class AgeViewHolder extends RecyclerView.ViewHolder{
            TextView ageText;
            public AgeViewHolder(View itemView) {
                super(itemView);
                ageText = itemView.findViewById(R.id.rowage);
            }
        }
    }
}
