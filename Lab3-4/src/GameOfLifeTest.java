import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeTest {

    @Test
    public void testEvolution1(){
    int[][]a = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
    int[][]b = {{0,0,0,0,0},{0,0,1,1,0},{0,1,0,1,0},{0,0,0,0,0},{0,0,0,0,0}};
    TorusGameOfLife test = new TorusGameOfLife(a);
    test.evolution(1);
    assertArrayEquals(b, test.getBoard());
    }

}