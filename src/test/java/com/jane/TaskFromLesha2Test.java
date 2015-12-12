package com.jane;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by jane on 12/11/15.
 */
public class TaskFromLesha2Test {

    public void testPairs() {
        String text = "   boy go  go  go  boy  boy  boy  boy girl girl";
        List<String> list = TaskFromLesha2.getPopularPairs(text, 2);
        assertEquals("boy boy", list.get(0));
        assertEquals("go go", list.get(1));
    }

}