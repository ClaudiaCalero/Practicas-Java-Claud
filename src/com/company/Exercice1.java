package com.company;

public class Exercice1 {
    public static boolean evenNumber(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 8;
        if (evenNumber(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
