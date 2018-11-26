package hshken.com.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends BaseActivity {
    private EditText edage;
    private String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void next(View view){
        edage = findViewById(R.id.ed_age);
       int age = Integer.parseInt(edage.getText().toString());
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
}
