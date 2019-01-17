// Isaiah Hammond, CSCI 1660, 1/17/19
package com.Hammond.Week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city="Galloway";
        int zipCode=43119;
        double dailyHighs[]= {0, 0, 0, 0, 0};
        for(int i =0; i<=4; i++) {
            int day = i + 1;
            System.out.println("Day: " + day);
            dailyHighs[i] = input.nextDouble();
        }
        double avHigh = (dailyHighs[0]+dailyHighs[1]+dailyHighs[2]+dailyHighs[3]+dailyHighs[4])/5;
        System.out.println("Average High is: " + avHigh);
    }
}
