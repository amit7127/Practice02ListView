package com.example.ankika.practice03listwithinlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankika on 11/17/2017.
 */

public class SecondCustomAdapter extends BaseAdapter {
    ArrayList<User> users;
    Activity activity;
    LayoutInflater layoutInflater;
    public SecondCustomAdapter(ArrayList<User> users, Activity activity) {
        this.users = users;
        this.activity = activity;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.second_list_element, null);
        TextView textView = view1.findViewById(R.id.inner_text);
        User user = (User) getItem(i);
        textView.setText(user.getName().toString());
        return view1;
    }
}
