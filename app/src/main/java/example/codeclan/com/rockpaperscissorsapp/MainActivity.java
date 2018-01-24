package example.codeclan.com.rockpaperscissorsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorButton;
    TextView result;
//    Button scoreButton;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorButton = findViewById(R.id.scissor_button);
        result = findViewById(R.id.result);
//        scoreButton = findViewById(R.id.score_button);
        score = findViewById(R.id.score);
    }

    public void onChooseRockButtonClick(View button){
        String playerAnswer = "Rock";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
        HashMap<String, Integer> outcome = rockPaperScissor.trackScore(playerAnswer, computerAnswer);
        score.setText(outcome.toString());
    }

    public void onChoosePaperButtonClick(View button){
        String playerAnswer = "Paper";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
        HashMap<String, Integer> outcome = rockPaperScissor.trackScore(playerAnswer, computerAnswer);
        score.setText(outcome.toString());
    }

    public void onChooseScissorButtonClick(View button){
        String playerAnswer = "Scissor";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
        HashMap<String, Integer> outcome = rockPaperScissor.trackScore(playerAnswer, computerAnswer);

    }

//    public void onClickScoreButton(View button){
//        RockPaperScissor rockPaperScissor = new RockPaperScissor();
//        rockPaperScissor.trackScore();
//        HashMap<String, Integer> outcome = rockPaperScissor.trackScore(playerAnswer, computerAnswer);
//        score.setText(outcome.toString());
//
//    }








}
