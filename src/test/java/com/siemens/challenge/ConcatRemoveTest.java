package com.siemens.challenge;

import static com.siemens.challenge.question4.ConcatRemove.concatRemove;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConcatRemoveTest {

    @Test
    public void testExactOperations() {
        assertEquals("yes", concatRemove("blablablabla", "blablabcde", 8));
    }

    @Test
    public void testExcessOperationsEven() {
        assertEquals("yes", concatRemove("blablablabla", "blablabcde", 10));
    }

    @Test
    public void testExcessOperationsOdd() {
        assertEquals("yes", concatRemove("tabtab", "tabtaabcd", 7));
    }

    @Test
    public void testInsufficientOperations() {
        assertEquals("no", concatRemove("tabtab", "tabtaabcd", 4));
    }

    @Test
    public void testDifferentStringSizes() {
        assertEquals("yes", concatRemove("abc", "abcdefgh", 5));
    }

    @Test
    public void testStringsEqual() {
        assertEquals("yes", concatRemove("tabtab", "tabtab", 0));
    }
}

