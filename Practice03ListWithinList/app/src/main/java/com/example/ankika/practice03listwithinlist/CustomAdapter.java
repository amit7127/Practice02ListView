package com.example.ankika.practice03listwithinlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ankika on 11/17/2017.
 */

public class CustomAdapter extends BaseAdapter {
    HashMap<String,List<User>> allUsers;
    List<Map.Entry<String, List<User>>> entries;
    Activity activity;
    LayoutInflater layoutInflater;
    public CustomAdapter(HashMap<String,List<User>> allUsers, Activity activity) {
        this.allUsers = allUsers;
        this.activity = activity;
        entries = new ArrayList<>(allUsers.entrySet());
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return allUsers.size();
    }

    @Override
    public Object getItem(int i) {
        int j = 0;
        String name = "";
        for (Map.Entry m:allUsers.entrySet() ) {
            if (j == i){
                name = m.getKey().toString();
            }
            j++;
        }
        return name;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.list_element, null);
        TextView textView = view1.findViewById(R.id.designation);
        String title = getItem(i).toString();
        textView.setText(title);
        //ListView listView  = view1.findViewById(R.id.listview_two);

        //ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        //layoutParams.height = 110 * (allUsers.get(title)).size();
        //listView.setLayoutParams(layoutParams);
        //CustomAdapter adapter = new CustomAdapter(context, blabla..);
        //innerListView.setAdapter(adapter);

        //rowListView.invalidate();

        //SecondCustomAdapter secondCustomAdapter = new SecondCustomAdapter((ArrayList<User>) allUsers.get(title),activity);
        //listView.setAdapter(secondCustomAdapter);

        //Table layout
        TableLayout tableLayout = view1.findViewById(R.id.listview_two);
        List<User> users = allUsers.get(title);
        for (final User user: users ) {
            TableRow tableRow = new TableRow(activity);
            tableRow.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            View headerView = View.inflate(activity, R.layout.second_list_element, null);
            TextView textView1 = headerView.findViewById(R.id.inner_text);
            textView1.setText(user.getName());
            tableRow.addView(headerView);
            tableLayout.addView(tableRow);

            tableRow.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Toast.makeText(activity, "hiiiiiiiiiiiiii" + user.getName(), Toast.LENGTH_SHORT).show();
                    return false;
                }
            });

        }

        return view1;
    }
}
