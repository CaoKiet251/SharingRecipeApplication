package com.example.sharingrecipeapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sharingrecipeapp.R;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    Button continued;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.continued_btn)
        {
            setContentView(R.layout.activity_successsignup);
            Button login = findViewById(R.id.Login_btn);
            login.setOnClickListener(this);
        }
        if (v.getId() == R.id.returns)
        {
            finish();
        }
        if (v.getId() == R.id.Login_btn)
        {
            Intent login_view = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(login_view);
        }

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ImageButton returns = findViewById(R.id.returns);
        returns.setOnClickListener(this);

        Button continued = findViewById(R.id.continued_btn);
        continued.setOnClickListener(this);


    }
}