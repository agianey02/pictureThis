package com.example.abhinavgianey.picturethis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        errorText = (TextView) findViewById(R.id.error_text);
        errorText.setVisibility(View.INVISIBLE);
    }

    public void onLogInClick(View view) {
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText) findViewById(R.id.password)).getText().toString();
        if (authenticate(email, password)) {
            Intent intent = new Intent(this, CameraActivity.class);
            startActivity(intent);
            errorText.setVisibility(View.INVISIBLE);
        } else {
            errorText.setVisibility(View.VISIBLE);
        }
    }

    public boolean authenticate(String email, String password) {
        if (email.equals("gianey.abhinav@gmail.com") && password.equals("idasproul")) {
            return true;
        }
        return false;
    }

}
