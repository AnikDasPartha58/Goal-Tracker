package com.example.goaltracker;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    RealmResults<Goal> goalList;


    public MyAdapter(Context context, RealmResults<Goal> goalList) {
        this.context = context;
        this.goalList = goalList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        Goal goal = goalList.get(position);
        holder.goalOutput.setText(goal.getGoal());
        String formatedTime = DateFormat.getDateTimeInstance().format(goal.createdTime);
        holder.timeOutput.setText(formatedTime);

        holder.goalRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // giving  every goal a different avtivity
               switch (holder.getAdapterPosition()){
                   case 0:
                       Intent intent = new Intent(context, MonthlyGoalView1.class);
                       intent.putExtra("goal",goal.goal);
                       intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent);
                       break;
                   case 1:
                      Intent intent1 = new Intent(context,MonthlyGoalView2.class);
                      intent1.putExtra("goal",goal.goal);
                      intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                      context.startActivity(intent1);
                      break;
                   case 2:
                       Intent intent2 = new Intent(context,MonthlyGoalView3.class);
                       intent2.putExtra("goal",goal.goal);
                       intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent2);
                       break;
                   case 3:
                       Intent intent3 = new Intent(context,MonthlyGoalView4.class);
                       intent3.putExtra("goal",goal.goal);
                       intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent3);
                       break;
                   case 4:
                       Intent intent4 = new Intent(context,MonthlyGoalView5.class);
                       intent4.putExtra("goal",goal.goal);
                       intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent4);
                       break;
                   case 5:
                       Intent intent5 = new Intent(context,MonthlyGoalView6.class);
                       intent5.putExtra("goal",goal.goal);
                       intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent5);
                       break;
                   case 6:
                       Intent intent6 = new Intent(context,MonthlyGoalView7.class);
                       intent6.putExtra("goal",goal.goal);
                       intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent6);
                       break;
                   case 7:
                       Intent intent7 = new Intent(context,MonthlyGoalView8.class);
                       intent7.putExtra("goal",goal.goal);
                       intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent7);
                   case 8:
                       Intent intent8 = new Intent(context,MonthlyGoalView9.class);
                       intent8.putExtra("goal",goal.goal);
                       intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent8);
                       break;
                   case 9:
                       Intent intent9 = new Intent(context,MonthlyGoalView10.class);
                       intent9.putExtra("goal",goal.goal);
                       intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       context.startActivity(intent9);
                       break;

                   default:
                       Toast.makeText(context, "Only 10 Goal Can be added ", Toast.LENGTH_LONG).show();
               }




            }
        });

        holder.goalRow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PopupMenu menu = new PopupMenu(context,v);
                menu.getMenu().add("Delete");
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getTitle().equals("Delete")){
                            Realm realm = Realm.getDefaultInstance();
                            realm.beginTransaction();
                            goal.deleteFromRealm();
                            realm.commitTransaction();
                            Toast.makeText(context, "Goal Deleted", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }

                });
                menu.show();
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return goalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        LinearLayout goalRow;
        TextView goalOutput;
        TextView timeOutput;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            goalOutput = itemView.findViewById(R.id.goalOutput);
            timeOutput = itemView.findViewById(R.id.timeOutput);
            goalRow = itemView.findViewById(R.id.goalrow);
        }
    }
}
