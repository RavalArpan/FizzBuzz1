package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {
    @Test
    public void testFizzbuzzForOne(){
        assertEquals("1",Fizzbuzz.fizzbuzz(1));
    }

}
