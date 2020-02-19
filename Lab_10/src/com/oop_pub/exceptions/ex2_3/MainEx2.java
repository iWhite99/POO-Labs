package com.oop_pub.exceptions.ex2_3;

import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new DoubleCalculator();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        System.out.println(calculator.add(null, null));
        System.out.println(calculator.add(Double.POSITIVE_INFINITY, 1d));
        System.out.println(calculator.add(Double.NEGATIVE_INFINITY, -1d));

        System.out.println(calculator.divide(1d, 0d));

        // TODO: Test edge cases that would throw exceptions
    }
}
