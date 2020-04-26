package com.company;

import java.util.Objects;
import java.util.Scanner;

/**
 * This code can help you to solve almost every Quadratic Equation task (probably).
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c;
        Scanner num = new Scanner(System.in);
        try {
            System.out.println("Enter а: ");
            a = num.nextDouble();
            System.out.println("Enter b: ");
            b = num.nextDouble();
            System.out.println("Enter с: ");
            c = num.nextDouble();
        } catch (Exception e) {
            System.out.println("You have entered incorrect number, please try again.");
            return;
        }// input numbers4
        QuadraticEquation apple = new QuadraticEquation();
        apple.counting(a,b,c);
    }

    public ReturningNumber counting(double a, double b, double c) {
        double d2, d3, d0, d5, d, d4,d6;
        d = b * b - 4 * a * c; // Discriminator, 16-8=8
        if (d < 0) { //Discriminator < 0
            System.out.println("No roots");
            return new ReturningNumber(null, null);
        } else if (d == 0) { // Discriminator = 0
            if (2*a == 0 || -b == 0){
                System.out.println("Cannot divide on 0");
                return new ReturningNumber(null,null);
            }else {
                d0 = -b / (2 * a);
                System.out.println("The answer is" + d0);
                return new ReturningNumber(d0, null);
            }
        } else { //Discriminator > 0
            d2 = -b + Math.sqrt(d);
            d4 = 2*a;
            if (d2 == 0 || d4 == 0){
                System.out.println("Cannot divide on 0, no solutions");
                return new ReturningNumber(null,null);
            }else{
                d6 = d2 / d4;
                d3 = -b - Math.sqrt(d); // First answer "(-b + Math.sqrt(d)) / (2 * a)"
                d5 = d3 / d4; // Second answer
                System.out.println("The answers are " + d3 + ", " + d5);
                return new ReturningNumber(d6,d5);
            }
        }
    }
}

class ReturningNumber {
    public ReturningNumber(Double firstreturn, Double secondreturn) {
        this.firstreturn = firstreturn;
        this.secondreturn = secondreturn;
    }

    Double firstreturn;
    Double secondreturn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturningNumber that = (ReturningNumber) o;
        return Objects.equals(firstreturn, that.firstreturn) &&
                Objects.equals(secondreturn, that.secondreturn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstreturn, secondreturn);
    }
}
