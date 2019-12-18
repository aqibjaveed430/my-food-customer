package e.homekitchen.customer.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import e.homekitchen.customer.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setView();
    }
private void setView(){
btn_login = (Button)findViewById(R.id.btn_login);

btn_login.setOnClickListener(this);
}
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                Intent loginintent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(loginintent);
                break;
        }
    }
}
