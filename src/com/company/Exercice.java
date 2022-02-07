package com.company;

public class Exercice {
    public static void main(String[] args) {
        int claudiaAge = 25;
        double firstTwoYears = 10.5;
        int followingYears = 4;

        double dogYears = ((2 * firstTwoYears) + (claudiaAge -2)) * followingYears;

        System.out.print(dogYears);


        if (claudiaAge > 2) {

            System.out.println (dogYears);

        } else {
            double firstYearsDog = claudiaAge * firstTwoYears;
            System.out.println (firstTwoYears);

        }
    }

}
