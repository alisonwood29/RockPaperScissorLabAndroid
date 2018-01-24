package example.codeclan.com.rockpaperscissorsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alisonwood29 on 24/01/2018.
 */

public class RockPaperScissor {

    private ArrayList<String> answer;

    public RockPaperScissor(){
        this.answer = new ArrayList<>();
        this.answer.add("Rock");
        this.answer.add("Paper");
        this.answer.add("Scissor");
    }

    public ArrayList<String> getList(){
        return this.answer;
    }


    public String getRandomAnswer() {
        Collections.shuffle(getList());
        return getList().get(0);
    }

    public String checkWin(String playerAnswer, String computerAnswer){
//        String computerAnswer = getRandomAnswer();
        String outcome = "";
        if(playerAnswer == "Rock" && computerAnswer == "Scissor"){
            outcome = "player wins!";
        } else if(playerAnswer == "Rock" && computerAnswer == "Paper"){
            outcome = "computer wins!";
        } else if (playerAnswer == "Paper" && computerAnswer == "Scissor"){
            outcome = "computer wins!";
        } else if(playerAnswer == "Paper" && computerAnswer == "Rock"){
            outcome = "player wins!";
        } else if(playerAnswer == "Scissor" && computerAnswer == "Rock"){
            outcome = "computer wins!";
        } else if(playerAnswer == "Scissor" && computerAnswer == "Paper"){
            outcome = "player wins!";
        } else  {
            outcome = "Draw";
        }
      return outcome;
    }

    public HashMap<String, Integer> trackScore(String playerAnswer, String computerAnswer){
        String outcome = checkWin(playerAnswer, computerAnswer);
        HashMap<String, Integer> score = new HashMap<>();
        if(!(score.containsKey(outcome))){
            score.put(outcome, 1);
        } else {
            score.put(outcome, score.get(outcome) + 1);
        }
        return score;




    }
}
