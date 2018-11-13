package hshken.com.atm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText ed_username;
    private EditText ed_passwd;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed_username = findViewById(R.id.ed_userid);
        ed_passwd = findViewById(R.id.ed_password);
        String username = getSharedPreferences("ATM",MODE_PRIVATE)
                .getString("USERID","");
        ed_username.setText(username);
    }
    public void login(View view){
        username = ed_username.getText().toString();
         password=ed_passwd.getText().toString();
        if ("ken".equals(username)&&"0920".equals(password)){
            //存取userid在XML//
            getSharedPreferences("ATM", MODE_PRIVATE)
                    .edit()
                    .putString("USERID", username)
                    .apply();

            setResult(RESULT_OK);
            finish();
        }else{
            setResult(RESULT_CANCELED);
            finish();

        }
    }
}
