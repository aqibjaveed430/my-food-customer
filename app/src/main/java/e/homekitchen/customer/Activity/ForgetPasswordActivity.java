package e.homekitchen.customer.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import e.homekitchen.customer.R;

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener{
Button btn_Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        setView();
    }
private void setView(){
    btn_Login = (Button)findViewById(R.id.btn_Login);

    btn_Login.setOnClickListener(this);
}
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Login:
                Intent loginintent = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
                startActivity(loginintent);
                break;
        }
    }
}
