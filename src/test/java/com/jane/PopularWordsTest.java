package com.jane;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link PopularWords}.
 */
public class PopularWordsTest {
    /**
     * Test for {@link String3#maxBlock(String)}.
     */
    @Test
    public void testLazyFox() {
        //lazy-1, fox-2, around-1, a-4, box-3, with-2, mouse-1, that-1, sits-1, in-1, on-1, the-2, top-1
        String text = "a lazy fox around a box with a mouse that sits in a box on the top with the fox and box";

        List<String> words = PopularWords.getPopularWords(text, 2);
        assertEquals("a", words.get(0)); // 4
        assertEquals("box", words.get(1)); // 3
    }
}
