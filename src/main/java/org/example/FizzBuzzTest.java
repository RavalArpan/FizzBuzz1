package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {
    @Test
    public void testFizzbuzzForOne(){
        assertEquals("1",Fizzbuzz.fizzbuzz(1));
    }

    @Test
    public void testFizzbuzzForMultipleOfThree(){
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(3));
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(6));
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(9));
    }

    @Test
    public void testFizzbuzzForMultipleOfFive(){
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(5));
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(10));
        assertEquals("Fizz",Fizzbuzz.fizzbuzz(15));
    }

}
