package example.codeclan.com.rockpaperscissorsapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alisonwood29 on 24/01/2018.
 */

public class RockPaperScissorTest {

    RockPaperScissor rockPaperScissor;

    @Before
    public void before(){
        rockPaperScissor = new RockPaperScissor();
    }

    @Test
    public void canGetList(){
        assertEquals(3, rockPaperScissor.getList().size());
    }

    @Test
    public void canGetRandomAnswer(){
        String expected = rockPaperScissor.getRandomAnswer();
        assertNotNull(expected);
    }

    @Test
    public void rockBeatsScissors(){
        String playerAnswer = "Rock";
        String computerAnswer = "Scissor";
        assertEquals("player wins", rockPaperScissor.checkWin(playerAnswer, computerAnswer));
    }

    @Test
    public void paperBeatsRock(){
        String playerAnswer = "Rock";
        String computerAnswer = "Paper";
        assertEquals("computer wins", rockPaperScissor.checkWin(playerAnswer, computerAnswer));
    }
    @Test
    public void checkDraw(){
        String playerAnswer = "Rock";
        String computerAnswer = "Rock";
        assertEquals("It's a draw, play again", rockPaperScissor.checkWin(playerAnswer, computerAnswer));
    }
}
