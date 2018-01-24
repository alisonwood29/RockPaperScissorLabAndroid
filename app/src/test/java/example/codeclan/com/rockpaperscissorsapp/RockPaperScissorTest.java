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
}
