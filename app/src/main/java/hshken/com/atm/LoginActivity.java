package hshken.com.atm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText ed_userid;
    private EditText ed_password;
    private String userid;
    private String passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){

         userid = ((EditText)findViewById(R.id.ed_userid)).getText().toString();
         passwd = ((EditText)findViewById(R.id.ed_password)).getText().toString();
        if ("ken".equals(userid)&&"0920".equals(passwd)){
            setResult(RESULT_OK);
            finish();
        }else{
            setResult(RESULT_CANCELED);
            finish();

        }
    }
}
