package com.example.goaltracker;

import io.realm.RealmObject;

public class Goal extends RealmObject {
    String goal;
    long createdTime;

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }


    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }
}
