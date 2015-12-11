package com.jane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple String3.
 */
public class String3Test {

    private String3 string3;

    @Before
    public void setUp() {
        this.string3 = new String3();
    }

    /**
     * Test for {@link String3#maxBlock(String)}.
     */
    @Test
    public void testsForMaxBlock() {
        assertEquals(3, string3.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, string3.maxBlock("XXBBBbbxx"));
    }

    @Test
    public void testStrCopies() {
        assertTrue(string3.strCopies("catcowcat", "cat", 2));
    }
}
