package e.homekitchen.customer.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import e.homekitchen.customer.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
Button btn_register, btn_sign_in;
RelativeLayout rel_forget_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setView();
    }
private void setView(){

        btn_register = (Button) findViewById(R.id.btn_register);
    btn_sign_in = (Button) findViewById(R.id.btn_sign_in);
    rel_forget_password = (RelativeLayout)findViewById(R.id.rel_forget_password);

        btn_register.setOnClickListener(this);
    btn_sign_in.setOnClickListener(this);
        rel_forget_password.setOnClickListener(this);

}
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_register:
            Intent regintent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(regintent);
            break;
            case R.id.btn_sign_in:
            Intent siginintent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(siginintent);
            break;

            case R.id.rel_forget_password:
                Intent forgetintent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(forgetintent);
                break;
        }

    }
}
