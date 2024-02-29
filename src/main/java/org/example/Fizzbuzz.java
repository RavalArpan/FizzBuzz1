package org.example;

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            System.out.println(fizzbuzz(i));
        }
    }

    public static String fizzbuzz(int n) {
        if (n%3 == 0){
            return "Fizz";
        }

        return Integer.toString(n);
    }
}