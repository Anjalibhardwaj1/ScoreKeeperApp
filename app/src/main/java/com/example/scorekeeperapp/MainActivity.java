package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the goal score for Team A
     */

    public void displayGoalForTeamA(int score){
        TextView scoreView = findViewById(R.id.Goal_For_TeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team A
     */

    public void displayFoulForTeamA(int score){
        TextView scoreView = findViewById(R.id.Foul_For_TeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for Team B
     */

    public void displayGoalForTeamB(int score){
        TextView scoreView = findViewById(R.id.Goal_For_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team B
     */

    public void displayFoulForTeamB(int score){
        TextView scoreView = findViewById(R.id.Foul_For_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the goal for Team A by 1 point
     */

    public void addOneGoalTeamA(View v) {
        goalTeamA++;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Increase the foul for Team A by 1 point
     */

    public void addOneFoulTeamA(View v) {
        foulTeamA++;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Increase the goal for Team B by 1 point
     */

    public void addOneGoalTeamB(View v) {
        goalTeamB++;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * Increase the foul for Team B by 1 point
     */

    public void addOneFoulTeamB(View v) {
        foulTeamB++;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Resets All values
     */

    public void resetAll(View v) {
         goalTeamA = 0;
         goalTeamB = 0;
         foulTeamA = 0;
         foulTeamB = 0;
         displayGoalForTeamA(goalTeamA);
         displayFoulForTeamA(foulTeamA);
         displayFoulForTeamB(foulTeamB);
         displayGoalForTeamB(goalTeamB);
    }

}
