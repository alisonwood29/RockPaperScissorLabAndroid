package example.codeclan.com.rockpaperscissorsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorButton = findViewById(R.id.scissor_button);
        result = findViewById(R.id.result);
    }

    public void onChooseRockButtonClick(View button){
        String playerAnswer = "Rock";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
    }

    public void onChoosePaperButtonClick(View button){
        String playerAnswer = "Paper";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
    }

    public void onChooseScissorButtonClick(View button){
        String playerAnswer = "Scissor";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        String computerAnswer = rockPaperScissor.getRandomAnswer();
        String winner = rockPaperScissor.checkWin(playerAnswer, computerAnswer);
        String output = "The computer chose " + computerAnswer + " so " + winner;
        result.setText(output);
    }








}
