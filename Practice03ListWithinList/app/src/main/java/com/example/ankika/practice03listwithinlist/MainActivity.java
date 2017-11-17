package com.example.ankika.practice03listwithinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        HashMap<String,List<User>> allUsers = getAllUsers();

        CustomAdapter customAdapter = new CustomAdapter(allUsers, MainActivity.this);
        listView.setAdapter(customAdapter);

    }

    HashMap<String, List<User>> getAllUsers(){
        HashMap<String, List<User>> allUsers = new HashMap<>();
        //salesman
        List<User> users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ronit", "ronit@gmail.com"));
        users.add(new User(3,"bibhuti", "bibhuti@gmail.com"));
        users.add(new User(4,"ankika", "ankika@gmail.com"));
        users.add(new User(5,"sriman", "sriman@gmail.com"));
        allUsers.put("Salesman", users);
        //management
        users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ronit", "ronit@gmail.com"));
        users.add(new User(3,"bibhuti", "bibhuti@gmail.com"));
        users.add(new User(4,"ankika", "ankika@gmail.com"));
        users.add(new User(5,"sriman", "sriman@gmail.com"));
        allUsers.put("Managment", users);

        //Account
        users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ronit", "ronit@gmail.com"));
        users.add(new User(3,"bibhuti", "bibhuti@gmail.com"));
        users.add(new User(4,"ankika", "ankika@gmail.com"));
        users.add(new User(5,"sriman", "sriman@gmail.com"));
        allUsers.put("Acount", users);

        //Mentainance
        users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ronit", "ronit@gmail.com"));
        users.add(new User(3,"bibhuti", "bibhuti@gmail.com"));
        users.add(new User(4,"ankika", "ankika@gmail.com"));
        users.add(new User(5,"sriman", "sriman@gmail.com"));
        allUsers.put("Mentainance", users);

        //Programmers
        users = new ArrayList<>();
        users.add(new User(1,"amit", "amit@gmail.com"));
        users.add(new User(2,"ronit", "ronit@gmail.com"));
        users.add(new User(3,"bibhuti", "bibhuti@gmail.com"));
        users.add(new User(4,"ankika", "ankika@gmail.com"));
        users.add(new User(5,"sriman", "sriman@gmail.com"));
        allUsers.put("Programmers", users);

        return allUsers;
    }
}
