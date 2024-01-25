package project_01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class InserterTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue() {

        LinkedList<Integer> testLink = new LinkedList<>();
        ArrayList<Integer> testArray = new ArrayList<>();

        Inserter theInsertedLink = new Inserter(testLink, 1000);
        theInsertedLink.timingTest();
        assertEquals(1000, testLink.size());

        Inserter theInsertedArray = new Inserter(testArray, 1000);
        theInsertedArray.timingTest();
        assertEquals(1000, testArray.size());
    }
}
