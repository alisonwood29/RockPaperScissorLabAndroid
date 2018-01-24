package example.codeclan.com.rockpaperscissorsapp;

import java.util.ArrayList;
import java.util.Collections;

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
}
