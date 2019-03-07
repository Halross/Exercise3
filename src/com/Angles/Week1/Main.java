package com.Angles.Week1;
import java.util.*;
public class Main {
    public static void numbers(int tempF) {

        int tempC = (tempF-32)*5/9;

        System.out.println(tempC+ ": Your temperature in Celsius");
    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature in Fahrenheit?");
        int tempF = scanner.nextInt();

        return tempF;
    }

    public static void main(String[] args) {
        int tempF = 0;
        while(tempF > -460) {
            tempF = input();

            numbers(tempF);
        }
    }
}
