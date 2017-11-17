package com.example.ankika.practice02listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        User user = (User) getIntent().getSerializableExtra("user");

        TextView id = findViewById(R.id.id);
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);

        id.setText(user.getId()+"");
        name.setText(user.getName());
        email.setText(user.getEmail());
    }
}
