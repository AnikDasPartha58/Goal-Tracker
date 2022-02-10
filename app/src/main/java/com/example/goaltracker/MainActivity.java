package com.example.goaltracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import io.realm.Sort;

public class MainActivity extends  AppCompatActivity {

    public FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Goal Lists");

        //creating sharedpreference for saving the dialog
        SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart",true);
        if (firstStart){
            //start dialog for showing instruction when open the app first time
            //calling the startdialog
            showStartDialog();
        }

        floatingActionButton = findViewById(R.id.add_goalBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NewGoalActivity.class);
                startActivity(intent);
            }
        });

        // calling the database
        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();
        RealmResults<Goal> goalsList = realm.where(Goal.class).findAll().sort("createdTime", Sort.ASCENDING);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),goalsList);
        recyclerView.setAdapter(myAdapter);


        //if Goal data change
        goalsList.addChangeListener(new RealmChangeListener<RealmResults<Goal>>() {
            @Override
            public void onChange(RealmResults<Goal> goals) {
                myAdapter.notifyDataSetChanged();
            }
        });

    }
    //create the startdialog
    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Instruction")
                .setMessage("Welcome to the Goal Tracker app! \n" +
                        "This app will help you to save the finished record of your goal days.\n" +
                        "Create a goal and save each day's finish record. To learn more check Guide from the top right corner of your screen. You can save 10 goals maximum. I hope 10 goals is enough for one month. This app is personally designed for me. Hope you guys like it too.\n" +
                        "Enjoy the app! ")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
        //calling the SharedPreferences so that the dialog shows only once
        SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart",false);
        editor.apply();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()== R.id.guide){
            Intent intent = new Intent(MainActivity.this,Guide.class);
            startActivity(intent);
        }else if (item.getItemId()== R.id.about){
            Intent intent = new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}