package com.example.goaltracker;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MonthlyGoalView10 extends AppCompatActivity {
    TextView goal;
    public FloatingActionButton floatingActionButton;
    Button day1,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,
            day14,day15,day16,day17,day18,day19,day20,day21,day22,day23,day24,day25,
            day26,day27,day28,day29,day30;

    // Button click reference
    int x1=1;
    int x2=1;
    int x3=1;
    int x4=1;
    int x5=1;
    int x6=1;
    int x7=1;
    int x8=1;
    int x9=1;
    int x10=1;
    int x11=1;
    int x12=1;
    int x13=1;
    int x14=1;
    int x15=1;
    int x16=1;
    int x17=1;
    int x18=1;
    int x19=1;
    int x20=1;
    int x21=1;
    int x22=1;
    int x23=1;
    int x24=1;
    int x25=1;
    int x26=1;
    int x27=1;
    int x28=1;
    int x29=1;
    int x30=1;

    //day 1 state save SharedPreference
    public void SaveButtonState1(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode109", bState);
        edit.putString("click_modeM109",bState);
        edit.commit();
    }public String LoadButtonState1(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState1 = preferences.getString("click_mode109", "DEFAULT");
        return buttonState1;
    }
    public String LoadButtonStateM1(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM1 = preferences.getString("click_modeM109", "DEFAULT");
        return buttonStateM1;
    }
    //day 2 state save SharedPreference
    public void SaveButtonState2(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode209", bState);
        edit.putString("click_modeM209",bState);
        edit.commit();
    }public String LoadButtonState2(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState2 = preferences.getString("click_mode209", "DEFAULT");
        return buttonState2;
    } public String LoadButtonStateM2(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM2 = preferences.getString("click_modeM209", "DEFAULT");
        return buttonStateM2;
    }
    //day3 state save SharedPreference
    public void SaveButtonState3(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode309", bState);
        edit.putString("click_modeM309",bState);
        edit.commit();
    }public String LoadButtonState3(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState3 = preferences.getString("click_mode309", "DEFAULT");
        return buttonState3;
    }public String LoadButtonStateM3(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM3 = preferences.getString("click_modeM309", "DEFAULT");
        return buttonStateM3;
    }
    //day4 state save SharedPreference
    public void SaveButtonState4(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode409", bState);
        edit.putString("click_modeM409",bState);
        edit.commit();
    }public String LoadButtonState4(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState4 = preferences.getString("click_mode409", "DEFAULT");
        return buttonState4;
    }public String LoadButtonStateM4(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM4 = preferences.getString("click_modeM409", "DEFAULT");
        return buttonStateM4;
    }

    //day5 state save SharedPreference
    public void SaveButtonState5(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode509", bState);
        edit.putString("click_modeM509",bState);
        edit.commit();
    }public String LoadButtonState5(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState5 = preferences.getString("click_mode509", "DEFAULT");
        return buttonState5;
    }public String LoadButtonStateM5(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM5 = preferences.getString("click_modeM509", "DEFAULT");
        return buttonStateM5;
    }
    //day6 state save SharedPreference
    public void SaveButtonState6(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode609", bState);
        edit.putString("click_modeM609",bState);
        edit.commit();
    }public String LoadButtonState6(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState6 = preferences.getString("click_mode609", "DEFAULT");
        return buttonState6;
    }public String LoadButtonStateM6(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM6 = preferences.getString("click_modeM609", "DEFAULT");
        return buttonStateM6;
    }
    //day7 state save SharedPreference
    public void SaveButtonState7(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode709", bState);
        edit.putString("click_modeM709",bState);
        edit.commit();
    }public String LoadButtonState7(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState7 = preferences.getString("click_mode709", "DEFAULT");
        return buttonState7;
    }public String LoadButtonStateM7(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM7 = preferences.getString("click_modeM709", "DEFAULT");
        return buttonStateM7;
    }
    //day8 state save SharedPreference
    public void SaveButtonState8(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode809", bState);
        edit.putString("click_modeM809",bState);
        edit.commit();
    }public String LoadButtonState8(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState8 = preferences.getString("click_mode809", "DEFAULT");
        return buttonState8;
    }public String LoadButtonStateM8(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM8 = preferences.getString("click_modeM809", "DEFAULT");
        return buttonStateM8;
    }
    //day9 state save SharedPreference
    public void SaveButtonState9(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode909", bState);
        edit.putString("click_modeM909",bState);
        edit.commit();
    }public String LoadButtonState9(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState9 = preferences.getString("click_mode909", "DEFAULT");
        return buttonState9;
    }public String LoadButtonStateM9(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM9 = preferences.getString("click_modeM909", "DEFAULT");
        return buttonStateM9;
    }
    //day10 state save SharedPreference
    public void SaveButtonState10(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1009", bState);
        edit.putString("click_modeM1009",bState);
        edit.commit();
    }public String LoadButtonState10(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState10 = preferences.getString("click_mode1009", "DEFAULT");
        return buttonState10;
    }public String LoadButtonStateM10(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM10 = preferences.getString("click_modeM1009", "DEFAULT");
        return buttonStateM10;
    }
    //day11 state save SharedPreference
    public void SaveButtonState11(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1109", bState);
        edit.putString("click_modeM1109",bState);
        edit.commit();
    }public String LoadButtonState11(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState11 = preferences.getString("click_mode1109", "DEFAULT");
        return buttonState11;
    }public String LoadButtonStateM11(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM11 = preferences.getString("click_modeM1109", "DEFAULT");
        return buttonStateM11;
    }
    //day12 state save SharedPreference
    public void SaveButtonState12(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1209", bState);
        edit.putString("click_modeM1209",bState);
        edit.commit();
    }public String LoadButtonState12(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState12 = preferences.getString("click_mode1209", "DEFAULT");
        return buttonState12;
    }public String LoadButtonStateM12(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM12 = preferences.getString("click_modeM1209", "DEFAULT");
        return buttonStateM12;
    }
    //day13 state save SharedPreference
    public void SaveButtonState13(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1309", bState);
        edit.putString("click_modeM1309",bState);
        edit.commit();
    }public String LoadButtonState13(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState13 = preferences.getString("click_mode1309", "DEFAULT");
        return buttonState13;
    }public String LoadButtonStateM13(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM13 = preferences.getString("click_modeM1309", "DEFAULT");
        return buttonStateM13;
    }
    //day14 state save SharedPreference
    public void SaveButtonState14(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1409", bState);
        edit.putString("click_modeM1409",bState);
        edit.commit();
    }public String LoadButtonState14(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState14 = preferences.getString("click_mode1409", "DEFAULT");
        return buttonState14;
    }public String LoadButtonStateM14(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM14 = preferences.getString("click_modeM1409", "DEFAULT");
        return buttonStateM14;
    }
    //day15 state save SharedPreference
    public void SaveButtonState15(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1509", bState);
        edit.putString("click_modeM1509",bState);
        edit.commit();
    }public String LoadButtonState15(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState15 = preferences.getString("click_mode1509", "DEFAULT");
        return buttonState15;
    }public String LoadButtonStateM15(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM15 = preferences.getString("click_modeM1509", "DEFAULT");
        return buttonStateM15;
    }
    //day16 state save SharedPreference
    public void SaveButtonState16(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1609", bState);
        edit.putString("click_modeM1609",bState);
        edit.commit();
    }public String LoadButtonState16(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState16 = preferences.getString("click_mode1609", "DEFAULT");
        return buttonState16;
    }public String LoadButtonStateM16(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM16 = preferences.getString("click_modeM1609", "DEFAULT");
        return buttonStateM16;
    }
    //day17 state save SharedPreference
    public void SaveButtonState17(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1709", bState);
        edit.putString("click_modeM1709",bState);
        edit.commit();
    }public String LoadButtonState17(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState17 = preferences.getString("click_mode1709", "DEFAULT");
        return buttonState17;
    }public String LoadButtonStateM17(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM17 = preferences.getString("click_modeM1709", "DEFAULT");
        return buttonStateM17;
    }
    //day18 state save SharedPreference
    public void SaveButtonState18(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1809", bState);
        edit.putString("click_modeM1809",bState);
        edit.commit();
    }public String LoadButtonState18(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState18 = preferences.getString("click_mode1809", "DEFAULT");
        return buttonState18;
    }public String LoadButtonStateM18(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM18 = preferences.getString("click_modeM1809", "DEFAULT");
        return buttonStateM18;
    }

    //day19 state save SharedPreference
    public void SaveButtonState19(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode1909", bState);
        edit.putString("click_modeM1909",bState);
        edit.commit();
    }public String LoadButtonState19(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState19 = preferences.getString("click_mode1909", "DEFAULT");
        return buttonState19;
    }public String LoadButtonStateM19(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM19 = preferences.getString("click_modeM1909", "DEFAULT");
        return buttonStateM19;
    }
    //day20 state save SharedPreference
    public void SaveButtonState20(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2009", bState);
        edit.putString("click_modeM2009",bState);
        edit.commit();
    }public String LoadButtonState20(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState20 = preferences.getString("click_mode2009", "DEFAULT");
        return buttonState20;
    }public String LoadButtonStateM20(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM20 = preferences.getString("click_modeM2009", "DEFAULT");
        return buttonStateM20;
    }
    //day21 state save SharedPreference
    public void SaveButtonState21(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2109", bState);
        edit.putString("click_modeM2109",bState);
        edit.commit();
    }public String LoadButtonState21(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState21 = preferences.getString("click_mode2109", "DEFAULT");
        return buttonState21;
    }public String LoadButtonStateM21(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM21 = preferences.getString("click_modeM2109", "DEFAULT");
        return buttonStateM21;
    }
    //day22 state save SharedPreference
    public void SaveButtonState22(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2209", bState);
        edit.putString("click_modeM2209",bState);
        edit.commit();
    }public String LoadButtonState22(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState22 = preferences.getString("click_mode2209", "DEFAULT");
        return buttonState22;
    }public String LoadButtonStateM22(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM22 = preferences.getString("click_modeM2209", "DEFAULT");
        return buttonStateM22;
    }
    //day23 state save SharedPreference
    public void SaveButtonState23(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2309", bState);
        edit.putString("click_modeM2309",bState);
        edit.commit();
    }public String LoadButtonState23(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState23 = preferences.getString("click_mode2309", "DEFAULT");
        return buttonState23;
    }public String LoadButtonStateM23(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM23 = preferences.getString("click_modeM2309", "DEFAULT");
        return buttonStateM23;
    }
    //day24 state save SharedPreference
    public void SaveButtonState24(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2409", bState);
        edit.putString("click_modeM2409",bState);
        edit.commit();
    }public String LoadButtonState24(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState24 = preferences.getString("click_mode2409", "DEFAULT");
        return buttonState24;
    }public String LoadButtonStateM24(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM24 = preferences.getString("click_modeM2409", "DEFAULT");
        return buttonStateM24;
    }
    //day25 state save SharedPreference
    public void SaveButtonState25(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2509", bState);
        edit.putString("click_modeM2509",bState);
        edit.commit();
    }public String LoadButtonState25(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState25 = preferences.getString("click_mode2509", "DEFAULT");
        return buttonState25;
    }public String LoadButtonStateM25(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM25 = preferences.getString("click_modeM2509", "DEFAULT");
        return buttonStateM25;
    }
    //day26 state save SharedPreference
    public void SaveButtonState26(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2609", bState);
        edit.putString("click_modeM2609",bState);
        edit.commit();
    }public String LoadButtonState26(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState26 = preferences.getString("click_mode2609", "DEFAULT");
        return buttonState26;
    }public String LoadButtonStateM26(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM26 = preferences.getString("click_modeM2609", "DEFAULT");
        return buttonStateM26;
    }
    //day27 state save SharedPreference
    public void SaveButtonState27(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2709", bState);
        edit.putString("click_modeM2709",bState);
        edit.commit();
    }public String LoadButtonState27(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState27 = preferences.getString("click_mode2709", "DEFAULT");
        return buttonState27;
    }public String LoadButtonStateM27(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM27 = preferences.getString("click_modeM2709", "DEFAULT");
        return buttonStateM27;
    }
    //day28 state save SharedPreference
    public void SaveButtonState28(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2809", bState);
        edit.putString("click_modeM2809",bState);
        edit.commit();
    }public String LoadButtonState28(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState28 = preferences.getString("click_mode2809", "DEFAULT");
        return buttonState28;
    }public String LoadButtonStateM28(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM28 = preferences.getString("click_modeM2809", "DEFAULT");
        return buttonStateM28;
    }
    //day29 state save SharedPreference
    public void SaveButtonState29(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode2909", bState);
        edit.putString("click_modeM2909",bState);
        edit.commit();
    }public String LoadButtonState29(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState29 = preferences.getString("click_mode2909", "DEFAULT");
        return buttonState29;
    }public String LoadButtonStateM29(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM29 = preferences.getString("click_modeM2909", "DEFAULT");
        return buttonStateM29;
    }
    //day30 state save SharedPreference
    public void SaveButtonState30(String bState){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MonthlyGoalView10.this);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("click_mode3009", bState);
        edit.putString("click_modeM3009",bState);
        edit.commit();
    }public String LoadButtonState30(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonState30 = preferences.getString("click_mode3009", "DEFAULT");
        return buttonState30;
    }public String LoadButtonStateM30(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String buttonStateM30 = preferences.getString("click_modeM3009", "DEFAULT");
        return buttonStateM30;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_goal_view10);
        goal = findViewById(R.id.toolbar_title);
        goal.setText(getIntent().getStringExtra("goal"));
        floatingActionButton = findViewById(R.id.name_goalBtn);
        
        
        // initialise buttons
        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.day4);
        day5 = findViewById(R.id.day5);
        day6 = findViewById(R.id.day6);
        day7 = findViewById(R.id.day7);
        day8 = findViewById(R.id.day8);
        day9 = findViewById(R.id.day9);
        day10 = findViewById(R.id.day10);
        day11 = findViewById(R.id.day11);
        day12 = findViewById(R.id.day12);
        day13 = findViewById(R.id.day13);
        day14 = findViewById(R.id.day14);
        day15 = findViewById(R.id.day15);
        day16 = findViewById(R.id.day16);
        day17 = findViewById(R.id.day17);
        day18 = findViewById(R.id.day18);
        day19 = findViewById(R.id.day19);
        day20 = findViewById(R.id.day20);
        day21 = findViewById(R.id.day21);
        day22 = findViewById(R.id.day22);
        day23 = findViewById(R.id.day23);
        day24 = findViewById(R.id.day24);
        day25 = findViewById(R.id.day25);
        day26 = findViewById(R.id.day26);
        day27 = findViewById(R.id.day27);
        day28 = findViewById(R.id.day28);
        day29 = findViewById(R.id.day29);
        day30 = findViewById(R.id.day30);


        //initialise Strings
        String buttonState1 = LoadButtonState1();
        String buttonStateM1 = LoadButtonStateM1();
        String buttonState2 = LoadButtonState2();
        String buttonStateM2 = LoadButtonStateM2();
        String buttonState3 = LoadButtonState3();
        String buttonStateM3 = LoadButtonStateM3();
        String buttonState4 = LoadButtonState4();
        String buttonStateM4 = LoadButtonStateM4();
        String buttonState5 = LoadButtonState5();
        String buttonStateM5 = LoadButtonStateM5();
        String buttonState6 = LoadButtonState6();
        String buttonStateM6 = LoadButtonStateM6();
        String buttonState7 = LoadButtonState7();
        String buttonStateM7 = LoadButtonStateM7();
        String buttonState8 = LoadButtonState8();
        String buttonStateM8 = LoadButtonStateM8();
        String buttonState9 = LoadButtonState9();
        String buttonStateM9 = LoadButtonStateM9();
        String buttonState10 = LoadButtonState10();
        String buttonStateM10 = LoadButtonStateM10();
        String buttonState11 = LoadButtonState11();
        String buttonStateM11 = LoadButtonStateM11();
        String buttonState12 = LoadButtonState12();
        String buttonStateM12 = LoadButtonStateM12();
        String buttonState13 = LoadButtonState13();
        String buttonStateM13 = LoadButtonStateM13();
        String buttonState14 = LoadButtonState14();
        String buttonStateM14 = LoadButtonStateM14();
        String buttonState15 = LoadButtonState15();
        String buttonStateM15 = LoadButtonStateM15();
        String buttonState16 = LoadButtonState16();
        String buttonStateM16 = LoadButtonStateM16();
        String buttonState17 = LoadButtonState17();
        String buttonStateM17 = LoadButtonStateM17();
        String buttonState18 = LoadButtonState18();
        String buttonStateM18 = LoadButtonStateM18();
        String buttonState19 = LoadButtonState19();
        String buttonStateM19 = LoadButtonStateM19();
        String buttonState20 = LoadButtonState20();
        String buttonStateM20 = LoadButtonStateM20();
        String buttonState21 = LoadButtonState21();
        String buttonStateM21 = LoadButtonStateM21();
        String buttonState22 = LoadButtonState22();
        String buttonStateM22 = LoadButtonStateM22();
        String buttonState23 = LoadButtonState23();
        String buttonStateM23 = LoadButtonStateM23();
        String buttonState24 = LoadButtonState24();
        String buttonStateM24 = LoadButtonStateM24();
        String buttonState25 = LoadButtonState25();
        String buttonStateM25 = LoadButtonStateM25();
        String buttonState26 = LoadButtonState26();
        String buttonStateM26 = LoadButtonStateM26();
        String buttonState27 = LoadButtonState27();
        String buttonStateM27 = LoadButtonStateM27();
        String buttonState28 = LoadButtonState28();
        String buttonStateM28 = LoadButtonStateM28();
        String buttonState29 = LoadButtonStateM29();
        String buttonStateM29 = LoadButtonStateM29();
        String buttonState30 = LoadButtonStateM30();
        String buttonStateM30 = LoadButtonStateM30();


        //Checking the button state and save it
        //day1
        if(buttonState1.equals("click_mode109")) {
            day1.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM1.equals("click_modeM109")){
            day1.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day2
        if (buttonState2.equals("click_mode209")){
            day2.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM2.equals("click_modeM209")){
            day2.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day3
        if (buttonState3.equals("click_mode309")){
            day3.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM3.equals("click_modeM309")){
            day3.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day4
        if (buttonState4.equals("click_mode409")){
            day4.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM4.equals("click_modeM409")){
            day4.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day5
        if (buttonState5.equals("click_mode509")){
            day5.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM5.equals("click_modeM509")){
            day5.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day6
        if (buttonState6.equals("click_mode609")){
            day6.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM6.equals("click_modeM609")){
            day6.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day7
        if (buttonState7.equals("click_mode709")){
            day7.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM7.equals("click_modeM709")){
            day7.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day8
        if (buttonState8.equals("click_mode809")){
            day8.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM8.equals("click_modeM809")){
            day8.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day9
        if (buttonState9.equals("click_mode909")){
            day9.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM9.equals("click_modeM909")){
            day9.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day10
        if (buttonState10.equals("click_mode1009")){
            day10.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM10.equals("click_modeM1009")){
            day10.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day 11
        if (buttonState11.equals("click_mode1109")){
            day11.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM11.equals("click_modeM1109")){
            day11.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day12
        if (buttonState12.equals("click_mode1209")){
            day12.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM12.equals("click_modeM1209")){
            day12.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day13
        if (buttonState13.equals("click_mode1309")){
            day13.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM13.equals("click_modeM1309")){
            day13.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day14
        if (buttonState14.equals("click_mode1409")){
            day14.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM14.equals("click_modeM1409")){
            day14.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day15
        if (buttonState15.equals("click_mode1509")){
            day15.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM15.equals("click_modeM1509")){
            day15.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day16
        if (buttonState16.equals("click_mode1609")){
            day16.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM4.equals("click_modeM1609")){
            day16.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day 17
        if (buttonState17.equals("click_mode1709")){
            day17.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM4.equals("click_modeM1709")){
            day17.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day 18
        if (buttonState18.equals("click_mode1809")){
            day18.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM18.equals("click_modeM1809")){
            day18.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day19
        if (buttonState19.equals("click_mode1909")){
            day19.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM19.equals("click_modeM1909")){
            day19.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day20
        if (buttonState20.equals("click_mode2009")){
            day20.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM20.equals("click_modeM2009")){
            day20.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day21
        if (buttonState21.equals("click_mode2109")){
            day21.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM4.equals("click_modeM2109")){
            day21.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day22
        if (buttonState22.equals("click_mode2209")){
            day22.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM22.equals("click_modeM2209")){
            day22.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day23
        if (buttonState23.equals("click_mode2309")){
            day23.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM23.equals("click_modeM2309")){
            day23.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day24
        if (buttonState24.equals("click_mode2409")){
            day24.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM24.equals("click_modeM2409")){
            day24.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day25
        if (buttonState25.equals("click_mode2509")){
            day25.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM25.equals("click_modeM2509")){
            day25.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day26
        if (buttonState26.equals("click_mode2609")){
            day26.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM4.equals("click_modeM2609")){
            day26.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day27
        if (buttonState27.equals("click_mode2709")){
            day27.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM27.equals("click_modeM2709")){
            day27.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day28
        if (buttonState28.equals("click_mode2809")){
            day28.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM28.equals("click_modeM2809")){
            day28.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day29
        if (buttonState29.equals("click_mode2909")){
            day29.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM29.equals("click_modeM2909")){
            day29.setBackgroundResource(R.drawable.button_background_shape);
        }
        //day30
        if (buttonState30.equals("click_mode3009")){
            day30.setBackgroundResource(R.drawable.unchecked);
        }else if (buttonStateM30.equals("click_modeM3009")){
            day30.setBackgroundResource(R.drawable.button_background_shape);
        }


        //Button click listener

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x1==1){
                    day1.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState1("click_mode109");
                }
                if (x1==2){
                    day1.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState1("click_modeM109");
                }
                if (x1==3){
                    day1.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState1("click_mode109");
                }
                if (x1==4){
                    day1.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState1("click_modeM109");
                }
                if (x1==5){
                    day1.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState1("click_mode109");
                }
                if (x1==6){
                    day1.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState1("click_modeM109");
                }
                if (x1==7){
                    day1.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState1("click_mode109");
                }
                if (x1==8){
                    day1.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState1("click_modeM109");
                }
                x1++;
            }
        });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x2==1){
                    day2.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState2("click_mode209");
                }
                if (x2==2){
                    day2.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState2("click_modeM209");
                }
                if (x2==3){
                    day2.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState2("click_mode209");
                }
                if (x2==4){
                    day2.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState2("click_modeM209");
                }
                if (x2==5){
                    day2.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState2("click_mode209");
                }
                if (x2==6){
                    day2.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState2("click_modeM209");
                }
                if (x2==7){
                    day2.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState2("click_mode209");
                }
                if (x2==8){
                    day2.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState2("click_modeM209");
                }
                x2++;
            }
        });
        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x3==1){
                    day3.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState3("click_mode309");
                }
                if (x3==2){
                    day3.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState3("click_modeM309");
                }
                if (x3==3){
                    day3.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState3("click_mode309");
                }
                if (x3==4){
                    day3.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState3("click_modeM309");
                }
                if (x3==5){
                    day3.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState3("click_mode309");
                }
                if (x3==6){
                    day3.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState3("click_modeM309");
                }
                if (x3==7){
                    day3.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState3("click_mode309");
                }
                if (x3==8){
                    day3.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState3("click_modeM309");
                }
                x3++;
            }
        });
        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x4==1){
                    day4.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState4("click_mode409");
                }
                if (x4==2){
                    day4.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState4("click_modeM409");
                }
                if (x4==3){
                    day4.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState4("click_mode409");
                }
                if (x4==4){
                    day4.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState4("click_modeM409");
                }
                if (x4==5){
                    day4.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState4("click_mode409");
                }
                if (x4==6){
                    day4.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState4("click_modeM409");
                }
                if (x4==7){
                    day4.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState4("click_mode409");
                }
                if (x4==8){
                    day4.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState4("click_modeM409");
                }
                x4++;
            }
        });
        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x5==1){
                    day5.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState5("click_mode509");
                }
                if (x5==2){
                    day5.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState5("click_modeM509");
                }
                if (x5==3){
                    day5.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState5("click_mode509");
                }
                if (x5==4){
                    day5.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState5("click_modeM509");
                }
                if (x5==5){
                    day5.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState5("click_mode509");
                }
                if (x5==6){
                    day5.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState5("click_modeM509");
                }
                if (x5==7){
                    day5.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState5("click_mode509");
                }
                if (x5==8){
                    day5.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState5("click_modeM509");
                }
                x5++;
            }
        });
        day6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x6==1){
                    day6.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState6("click_mode609");
                }
                if (x6==2){
                    day6.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState6("click_modeM609");
                }
                if (x6==3){
                    day6.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState6("click_mode609");
                }
                if (x6==4){
                    day6.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState6("click_modeM609");
                }
                if (x6==5){
                    day6.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState6("click_mode609");
                }
                if (x6==6){
                    day6.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState6("click_modeM609");
                }
                if (x6==7){
                    day6.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState6("click_mode609");
                }
                if (x6==8){
                    day6.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState6("click_modeM609");
                }
                x6++;
            }
        });
        day7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x7==1){
                    day7.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState7("click_mode709");
                }
                if (x7==2){
                    day7.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState7("click_modeM709");
                }
                if (x7==3){
                    day7.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState7("click_mode709");
                }
                if (x7==4){
                    day7.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState7("click_modeM709");
                }
                if (x7==5){
                    day7.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState7("click_mode709");
                }
                if (x7==6){
                    day7.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState7("click_modeM709");
                }
                if (x7==7){
                    day7.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState7("click_mode709");
                }
                if (x7==8){
                    day7.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState7("click_modeM709");
                }
                x7++;
            }
        });
        day8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x8==1){
                    day8.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState8("click_mode809");
                }
                if (x8==2){
                    day8.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState8("click_modeM809");
                }
                if (x8==3){
                    day8.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState8("click_mode809");
                }
                if (x8==4){
                    day8.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState8("click_modeM809");
                }
                if (x8==5){
                    day8.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState8("click_mode809");
                }
                if (x8==6){
                    day8.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState8("click_modeM809");
                }
                if (x8==7){
                    day8.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState8("click_mode809");
                }
                if (x8==8){
                    day8.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState8("click_modeM809");
                }
                x8++;
            }
        });
        day9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x9==1){
                    day9.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState9("click_mode909");
                }
                if (x9==2){
                    day9.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState9("click_modeM909");
                }
                if (x9==3){
                    day9.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState9("click_mode909");
                }
                if (x9==4){
                    day9.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState9("click_modeM909");
                }
                if (x9==5){
                    day9.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState9("click_mode909");
                }
                if (x9==6){
                    day9.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState9("click_modeM909");
                }
                if (x9==7){
                    day9.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState9("click_mode909");
                }
                if (x9==8){
                    day9.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState9("click_modeM909");
                }
                x9++;
            }
        });
        day10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x10==1){
                    day10.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState10("click_mode1009");
                }
                if (x10==2){
                    day10.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState10("click_modeM1009");
                }
                if (x10==1){
                    day10.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState10("click_mode1009");
                }
                if (x10==3){
                    day10.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState10("click_modeM1009");
                }
                if (x10==4){
                    day10.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState10("click_mode1009");
                }
                if (x10==5){
                    day10.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState10("click_modeM1009");
                }
                if (x10==6){
                    day10.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState10("click_mode1009");
                }
                if (x10==7){
                    day10.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState10("click_modeM1009");
                }
                x10++;
            }
        });
        day11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x11==1){
                    day11.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState11("click_mode1109");
                }
                if (x11==2){
                    day11.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState11("click_modeM1109");
                }
                if (x11==3){
                    day11.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState11("click_mode1109");
                }
                if (x11==4){
                    day11.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState11("click_modeM1109");
                }
                if (x11==5){
                    day11.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState11("click_mode1109");
                }
                if (x11==6){
                    day11.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState11("click_modeM1109");
                }
                if (x11==7){
                    day11.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState11("click_mode1109");
                }
                if (x11==8){
                    day11.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState11("click_modeM1109");
                }
                x11++;
            }
        });
        day12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x12==1){
                    day12.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState12("click_mode1209");
                }
                if (x12==2){
                    day12.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState12("click_modeM1209");
                }
                if (x12==3){
                    day12.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState12("click_mode1209");
                }
                if (x12==4){
                    day12.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState12("click_modeM1209");
                }
                if (x12==5){
                    day12.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState12("click_mode1209");
                }
                if (x12==6){
                    day12.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState12("click_modeM1209");
                }
                if (x12==7){
                    day12.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState12("click_mode1209");
                }
                if (x12==8){
                    day12.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState12("click_modeM1209");
                }
                x12++;
            }
        });
        day13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x13==1){
                    day13.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState13("click_mode1309");
                }
                if (x13==2){
                    day13.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState13("click_modeM1309");
                }
                if (x13==3){
                    day13.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState13("click_mode1309");
                }
                if (x13==4){
                    day13.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState13("click_modeM1309");
                }
                if (x13==5){
                    day13.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState13("click_mode1309");
                }
                if (x13==6){
                    day13.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState13("click_modeM1309");
                }
                if (x13==7){
                    day13.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState13("click_mode1309");
                }
                if (x13==8){
                    day13.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState13("click_modeM1309");
                }
                x13++;
            }
        });
        day14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x14==1){
                    day14.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState14("click_mode1409");
                }
                if (x14==2){
                    day14.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState14("click_modeM1409");
                }
                if (x14==3){
                    day14.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState14("click_mode1409");
                }
                if (x14==4){
                    day14.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState14("click_modeM1409");
                }
                if (x14==5){
                    day14.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState14("click_mode1409");
                }
                if (x14==6){
                    day14.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState14("click_modeM1409");
                }
                if (x14==7){
                    day14.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState14("click_mode1409");
                }
                if (x14==8){
                    day14.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState14("click_modeM1409");
                }
                x14++;
            }
        });
        day15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x15==1){
                    day15.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState15("click_mode1509");
                }
                if (x15==2){
                    day15.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState15("click_modeM1509");
                }
                if (x15==3){
                    day15.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState15("click_mode1509");
                }
                if (x15==4){
                    day15.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState15("click_modeM1509");
                }
                if (x15==5){
                    day15.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState15("click_mode1509");
                }
                if (x15==6){
                    day15.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState15("click_modeM1509");
                }
                if (x15==7){
                    day15.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState15("click_mode1509");
                }
                if (x15==8){
                    day15.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState15("click_modeM1509");
                }
                x15++;
            }
        });
        day16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x16==1){
                    day16.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState16("click_mode1609");
                }
                if (x16==2){
                    day16.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState16("click_modeM1609");
                }
                if (x16==3){
                    day16.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState16("click_mode1609");
                }
                if (x16==4){
                    day16.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState16("click_modeM1609");
                }
                if (x16==5){
                    day16.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState16("click_mode1609");
                }
                if (x16==6){
                    day16.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState16("click_modeM1609");
                }
                if (x16==7){
                    day16.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState16("click_mode1609");
                }
                if (x16==8){
                    day16.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState16("click_modeM1609");
                }
                x16++;
            }
        });
        day17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x17==1){
                    day17.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState17("click_mode1709");
                }
                if (x17==2){
                    day17.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState17("click_modeM1709");
                }
                if (x17==3){
                    day17.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState17("click_mode1709");
                }
                if (x17==4){
                    day17.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState17("click_modeM1709");
                }
                if (x17==5){
                    day17.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState17("click_mode1709");
                }
                if (x17==6){
                    day17.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState17("click_modeM1709");
                }
                if (x17==7){
                    day17.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState17("click_mode1709");
                }
                if (x17==8){
                    day17.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState17("click_modeM1709");
                }
                x17++;
            }
        });
        day18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x18==1){
                    day18.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState18("click_mode1809");
                }
                if (x18==2){
                    day18.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState18("click_modeM1809");
                }
                if (x18==3){
                    day18.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState18("click_mode1809");
                }
                if (x18==4){
                    day18.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState18("click_modeM1809");
                }
                if (x18==5){
                    day18.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState18("click_mode1809");
                }
                if (x18==6){
                    day18.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState18("click_modeM1809");
                }
                if (x18==7){
                    day18.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState18("click_mode1809");
                }
                if (x18==8){
                    day18.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState18("click_modeM1809");
                }
                x18++;
            }
        });
        day19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x19==1){
                    day19.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState19("click_mode1909");
                }
                if (x19==2){
                    day19.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState19("click_modeM1909");
                }
                if (x19==3){
                    day19.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState19("click_mode1909");
                }
                if (x19==4){
                    day19.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState19("click_modeM1909");
                }
                if (x19==5){
                    day19.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState19("click_mode1909");
                }
                if (x19==6){
                    day19.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState19("click_modeM1909");
                }
                if (x19==7){
                    day19.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState19("click_mode1909");
                }
                if (x19==8){
                    day19.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState19("click_modeM1909");
                }
                x19++;
            }
        });
        day20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x20==1){
                    day20.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState20("click_mode2009");
                }
                if (x20==2){
                    day20.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState20("click_modeM2009");
                }
                if (x20==3){
                    day20.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState20("click_mode2009");
                }
                if (x20==4){
                    day20.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState20("click_modeM2009");
                }
                if (x20==5){
                    day20.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState20("click_mode2009");
                }
                if (x20==6){
                    day20.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState20("click_modeM2009");
                }
                if (x20==7){
                    day20.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState20("click_mode2009");
                }
                if (x20==8){
                    day20.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState20("click_modeM2009");
                }
                x20++;
            }
        });
        day21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x21==1){
                    day21.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState21("click_mode2109");
                }
                if (x21==2){
                    day21.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState21("click_modeM2109");
                }
                if (x21==3){
                    day21.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState21("click_mode2109");
                }
                if (x21==4){
                    day21.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState21("click_modeM2109");
                }
                if (x21==5){
                    day21.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState21("click_mode2109");
                }
                if (x21==6){
                    day21.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState21("click_modeM2109");
                }
                if (x21==7){
                    day21.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState21("click_mode2109");
                }
                if (x21==8){
                    day21.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState21("click_modeM2109");
                }
                x21++;
            }
        });
        day22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x22==1){
                    day22.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState22("click_mode2209");
                }
                if (x22==2){
                    day22.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState22("click_modeM2209");
                }
                if (x22==3){
                    day22.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState22("click_mode2209");
                }
                if (x22==4){
                    day22.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState22("click_modeM2209");
                }
                if (x22==5){
                    day22.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState22("click_mode2209");
                }
                if (x22==6){
                    day22.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState22("click_modeM2209");
                }
                if (x22==7){
                    day22.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState22("click_mode2209");
                }
                if (x22==8){
                    day22.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState22("click_modeM2209");
                }
                x22++;
            }
        });
        day23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x23==1){
                    day23.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState23("click_mode2309");
                }
                if (x23==2){
                    day23.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState23("click_modeM2309");
                }
                if (x23==3){
                    day23.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState23("click_mode2309");
                }
                if (x23==4){
                    day23.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState23("click_modeM2309");
                }
                if (x23==5){
                    day23.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState23("click_mode2309");
                }
                if (x23==6){
                    day23.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState23("click_modeM2309");
                }
                if (x23==7){
                    day23.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState23("click_mode2309");
                }
                if (x23==8){
                    day23.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState23("click_modeM2309");
                }
                x23++;

            }
        });
        day24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x24==1){
                    day24.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState24("click_mode2409");
                }
                if (x24==2){
                    day24.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState24("click_modeM2409");
                }
                if (x24==3){
                    day24.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState24("click_mode2409");
                }
                if (x24==4){
                    day24.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState24("click_modeM2409");
                }
                if (x24==5){
                    day24.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState24("click_mode2409");
                }
                if (x24==6){
                    day24.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState24("click_modeM2409");
                }
                if (x24==7){
                    day24.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState24("click_mode2409");
                }
                if (x24==8){
                    day24.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState24("click_modeM2409");
                }
                x24++;
            }
        });
        day25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x25==1){
                    day25.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState25("click_mode2509");
                }
                if (x25==2){
                    day25.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState25("click_modeM2509");
                }
                if (x25==3){
                    day25.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState25("click_mode2509");
                }
                if (x25==4){
                    day25.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState25("click_modeM2509");
                }
                if (x25==5){
                    day25.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState25("click_mode2509");
                }
                if (x25==6){
                    day25.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState25("click_modeM2509");
                }
                if (x25==7){
                    day25.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState25("click_mode2509");
                }
                if (x25==8){
                    day25.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState25("click_modeM2509");
                }
                x25++;
            }
        });
        day26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x26==1){
                    day26.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState26("click_mode2609");
                }
                if (x26==2){
                    day26.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState26("click_modeM2609");
                }
                if (x26==3){
                    day26.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState26("click_mode2609");
                }
                if (x26==4){
                    day26.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState26("click_modeM2609");
                }
                if (x26==5){
                    day26.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState26("click_mode2609");
                }
                if (x26==6){
                    day26.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState26("click_modeM2609");
                }
                if (x26==7){
                    day26.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState26("click_mode2609");
                }
                if (x26==8){
                    day26.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState26("click_modeM2609");
                }
                x26++;
            }
        });
        day27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x27==1){
                    day27.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState27("click_mode2709");
                }
                if (x27==2){
                    day27.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState27("click_modeM2709");
                }
                if (x27==3){
                    day27.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState27("click_mode2709");
                }
                if (x27==4){
                    day27.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState27("click_modeM2709");
                }
                if (x27==5){
                    day27.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState27("click_mode2709");
                }
                if (x27==6){
                    day27.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState27("click_modeM2709");
                }
                if (x27==7){
                    day27.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState27("click_mode2709");
                }
                if (x27==8){
                    day27.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState27("click_modeM2709");
                }
                x27++;
            }
        });
        day28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x28==1){
                    day28.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState28("click_mode2809");
                }
                if (x28==2){
                    day28.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState28("click_modeM2809");
                }
                if (x28==3){
                    day28.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState28("click_mode2809");
                }
                if (x28==4){
                    day28.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState28("click_modeM2809");
                }
                if (x28==5){
                    day28.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState28("click_mode2809");
                }
                if (x28==6){
                    day28.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState28("click_modeM2809");
                }
                if (x28==7){
                    day28.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState28("click_mode2809");
                }
                if (x28==8){
                    day28.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState28("click_modeM2809");
                }
                x28++;
            }
        });
        day29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x29==1){
                    day29.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState29("click_mode2909");
                }
                if (x29==2){
                    day29.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState29("click_modeM2909");
                }
                if (x29==3){
                    day29.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState29("click_mode2909");
                }
                if (x29==4){
                    day29.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState29("click_modeM2909");
                }
                if (x29==5){
                    day29.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState29("click_mode2909");
                }
                if (x29==6){
                    day29.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState29("click_modeM2909");
                }
                if (x29==7){
                    day29.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState29("click_mode2909");
                }
                if (x29==8){
                    day29.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState29("click_modeM2909");
                }
                x29++;
            }
        });
        day30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x30==1){
                    day30.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState30("click_mode3009");
                }
                if (x30==2){
                    day30.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState30("click_modeM3009");
                }
                if (x30==3){
                    day30.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState30("click_mode3009");
                }
                if (x30==4){
                    day30.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState30("click_modeM3009");
                }
                if (x30==5){
                    day30.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState30("click_mode3009");
                }
                if (x30==6){
                    day30.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState30("click_modeM3009");
                }
                if (x30==7){
                    day30.setBackgroundResource(R.drawable.unchecked);
                    SaveButtonState30("click_mode3009");
                }
                if (x30==8){
                    day30.setBackgroundResource(R.drawable.button_background_shape);
                    SaveButtonState30("click_modeM3009");
                }
                x30++;
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MonthlyGoalView10.this, "Saved", Toast.LENGTH_SHORT).show();
                finish();

            }
        });
        
    }
}