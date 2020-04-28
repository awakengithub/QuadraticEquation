package com.company;

import java.util.Scanner;

public class AdditionOfPowers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i;
        try {
            System.out.println("Enter i: ");
            i = num.nextInt();
        } catch (Exception e) {
            System.out.println("You have entered incorrect number, please try again.");
            return;
        }
        AdditionOfPowers laptop = new AdditionOfPowers();
        laptop.counting(i);
    } //Entering number and catching errors

    public int counting(int i) {
        int result = 0;
        for (int counter = 1; counter <= i;counter++){
            result = counter*counter + result;
        }
        return result;
    }
}
