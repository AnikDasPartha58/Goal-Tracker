package com.example.goaltracker;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import io.realm.Realm;

public class NewGoalActivity extends AppCompatActivity  {

    public FloatingActionButton floatingActionButton;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_goal);
        // Initialise toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Setting the toolbar name
        this.setTitle("New Goal");

        // Initialise EditText and floating action button
        EditText goalInput = findViewById(R.id.goalInput);
        floatingActionButton = findViewById(R.id.done_goalBtn);

        //Setting the database
        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        //Setting onClickListener for floating action button
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the goal name empty
                String goal = "";
                //make a condition for goal name input
                if (! goalInput.getText().toString().equals("")){
                    // Set the goal input in String goal
                     goal = goalInput.getText().toString();
                }else{
                    Toast.makeText(NewGoalActivity.this, "Please Enter Goal Name!", Toast.LENGTH_SHORT).show();
                }

               // Set the created_localtime in ceratedTime
               long createdTime = System.currentTimeMillis();
               //Begin the database teansaction
               realm.beginTransaction();
               //create a realm object so that we can the data from user and save in the database
               Goal title = realm.createObject(Goal.class);
               title.setGoal(goal);
               title.setCreatedTime(createdTime);
               realm.commitTransaction();

               // For display a toast after completing the task
               Toast.makeText(NewGoalActivity.this, "Goal Saved", Toast.LENGTH_SHORT).show();

               //To get rid of this activity
               finish();
            }

        });





    }




    }
