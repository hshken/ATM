package hshken.com.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {
    private  EditText ednickname;
    private String nickname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }
    public void next(View view){
        ednickname = findViewById(R.id.ed_nickname);
        nickname = ednickname.getText().toString();
        getSharedPreferences("NICKNAME",MODE_PRIVATE)
                .edit()
                .putString("NICKNAME",nickname)
                .apply();
        Intent age = new Intent(this,AgeActivity.class);
        startActivity(age);
    }
}
