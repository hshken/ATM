package hshken.com.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {
    private  EditText edgender;
    private String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void next(View view){
        edgender = findViewById(R.id.ed_gender);
        gender = edgender.getText().toString();
        getSharedPreferences("GENDER",MODE_PRIVATE)
                .edit()
                .putString("GENDER",gender)
                .apply();
        Intent mainActivity = new Intent(this,MainActivity.class);
        startActivity(mainActivity);
    }
    public void back(View view){
        finish();

    }
}
