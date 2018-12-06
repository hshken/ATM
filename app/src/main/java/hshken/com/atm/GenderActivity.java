package hshken.com.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends BaseActivity {
    private  EditText edgender;
    private String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void next(View view){
        edgender = findViewById(R.id.ed_gender);
       int gender = Integer.parseInt(edgender.getText().toString());
        user.setGender(gender);
       // getSharedPreferences("GENDER",MODE_PRIVATE)
        //        .edit()
         //       .putString("GENDER",gender)
          //      .apply();
        Intent mainActivity = new Intent(this,MainActivity.class);
        //setResult(RESULT_OK);
        mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(mainActivity);
    }
    public void back(View view){
        finish();

    }
}
