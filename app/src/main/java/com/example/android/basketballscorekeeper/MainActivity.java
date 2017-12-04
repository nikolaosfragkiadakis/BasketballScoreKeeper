package com.example.android.basketballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    // The score of Team A.
    int scoreTeamA = 0;
    // The 3 points shots of Team A.
    int threePointsTeamA = 0;
    // The 2 points shots of Team A.
    int twoPointsTeamA = 0;
    // The free throw shots of Team A.
    int freeThrowTeamA = 0;
    // The score of Team B.
    int scoreTeamB = 0;
    // The 3 points shots of Team B.
    int threePointsTeamB = 0;
    // The 2 points shots of Team B.
    int twoPointsTeamB = 0;
    // The free throw shots of Team B.
    int freeThrowTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayStatsForTeamA(threePointsTeamA, twoPointsTeamA, freeThrowTeamA);
        displayStatsForTeamB(threePointsTeamB, twoPointsTeamB, freeThrowTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the stats for Team A.
     */
    public void displayStatsForTeamA(int threePoints, int twoPoints, int freeThrow) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stats);
        scoreView.setText(String.valueOf("Stats: 3P: " + threePoints + " / 2P: " + twoPoints + " / FT: " + freeThrow));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the stats for Team B.
     */
    public void displayStatsForTeamB(int threePoints, int twoPoints, int freeThrow) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stats);
        scoreView.setText(String.valueOf("Stats: 3P: " + threePoints + " / 2P: " + twoPoints + " / FT: " + freeThrow));
    }

    /**
     * This method is called when the 3 Points button is clicked for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        threePointsTeamA = threePointsTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayStatsForTeamA(threePointsTeamA, twoPointsTeamA, freeThrowTeamA);
    }

    /**
     * This method is called when the 3 Points button is clicked for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        threePointsTeamB = threePointsTeamB +1;
        displayForTeamB(scoreTeamB);
        displayStatsForTeamB(threePointsTeamB, twoPointsTeamB, freeThrowTeamB);
    }

    /**
     * This method is called when the 2 Points button is clicked for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        twoPointsTeamA = twoPointsTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayStatsForTeamA(threePointsTeamA, twoPointsTeamA, freeThrowTeamA);
    }

    /**
     * This method is called when the 2 Points button is clicked for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        twoPointsTeamB = twoPointsTeamB +1;
        displayForTeamB(scoreTeamB);
        displayStatsForTeamB(threePointsTeamB, twoPointsTeamB, freeThrowTeamB);
    }

    /**
     * This method is called when the Free Throw button is clicked for Team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        freeThrowTeamA = freeThrowTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayStatsForTeamA(threePointsTeamA, twoPointsTeamA, freeThrowTeamA);
    }

    /**
     * This method is called when the Free Throw button is clicked for Team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        freeThrowTeamB = freeThrowTeamB +1;
        displayForTeamB(scoreTeamB);
        displayStatsForTeamB(threePointsTeamB, twoPointsTeamB, freeThrowTeamB);
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetTheScore(View view) {
        // Reset the score for Team A.
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        // Reset the score for Team B.
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        // Reset the stats for Team A.
        threePointsTeamA = 0;
        twoPointsTeamA = 0;
        freeThrowTeamA = 0;
        displayStatsForTeamA(threePointsTeamA, twoPointsTeamA, freeThrowTeamA);
        // Reset the stats for Team B.
        threePointsTeamB = 0;
        twoPointsTeamB = 0;
        freeThrowTeamB = 0;
        displayStatsForTeamB(threePointsTeamB, twoPointsTeamB, freeThrowTeamB);

    }

}
