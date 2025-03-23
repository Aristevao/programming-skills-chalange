package com.aristevao.challenge;

import static com.aristevao.challenge.question4.ConcatRemove.concatRemove;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConcatRemoveTest {

    @Test
    void testExactOperations() {
        assertEquals("yes", concatRemove("abc", "abd", 2));
        assertEquals("yes", concatRemove("hello", "hell", 1));
    }

    @Test
    void testMoreOperationsAvailable() {
        assertEquals("yes", concatRemove("abc", "abd", 10));
        assertEquals("yes", concatRemove("abc", "xyz", 6));
    }

    @Test
    void testNotEnoughOperations() {
        assertEquals("no", concatRemove("abc", "abd", 1));
        assertEquals("no", concatRemove("hello", "world", 3));
    }

    @Test
    void testSameStrings() {
        assertEquals("yes", concatRemove("test", "test", 0));
        assertEquals("yes", concatRemove("test", "test", 2));
    }

    @Test
    void testEmptyStringCases() {
        assertEquals("yes", concatRemove("", "", 0));
        assertEquals("yes", concatRemove("", "hello", 5));
        assertEquals("yes", concatRemove("hello", "", 5));
    }

    @Test
    void testExtraDeletionsAllowed() {
        assertEquals("yes", concatRemove("abc", "abd", 4));
        assertEquals("yes", concatRemove("test", "testing", 10));
    }

    @Test
    void testMaxOperationsAllowed() {
        assertEquals("yes", concatRemove("U_yxcpa=r@FXR,a=ix6Ae6a;!Vpuk:Yn?QEPW)}U[*TAbuMU&n",
                "wN0;(Y}HXFX8z{X{+=e#RQ1J7$d]iD-:p4*V8Y9ESRm[#a&U+h", 100));
    }
}

