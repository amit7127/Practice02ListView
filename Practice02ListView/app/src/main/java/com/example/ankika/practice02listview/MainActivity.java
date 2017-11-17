package com.example.ankika.practice02listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        final List<User> users = getDemoUsers();
        CustomAdapter customAdapter = new CustomAdapter(users, MainActivity.this);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                User user = users.get(i);
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);
            }
        });

    }

    List<User> getDemoUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ankika", "amit@gmail.com"));
        users.add(new User(3,"Little", "amit@gmail.com"));
        users.add(new User(4,"ananta", "amit@gmail.com"));
        users.add(new User(5,"jagat", "amit@gmail.com"));
        users.add(new User(6,"lizza", "amit@gmail.com"));
        users.add(new User(7,"ronit", "amit@gmail.com"));
        users.add(new User(8,"soubhagya", "amit@gmail.com"));
        users.add(new User(9,"prakash", "amit@gmail.com"));
        users.add(new User(10,"deba", "amit@gmail.com"));
        users.add(new User(11,"sonu", "amit@gmail.com"));
        users.add(new User(12,"rohit", "amit@gmail.com"));
        users.add(new User(13,"arup", "amit@gmail.com"));

        return users;

    }
}
