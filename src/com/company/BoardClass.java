package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class BoardClass {
    BoardClass() {
    }

    public static int number;
    public static int[][] board = new int[number][number];

    public int getRowColumn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the board size (N):");
        number = input.nextInt();
        return number;
    }

    public static Point chooseRandomCoordinate() {
        Random rand = new Random();
        // Generate random integers in range 0 to number entered by user
        int rand_row = rand.nextInt(number);
        int rand_col = rand.nextInt(number);
        Point p = new Point(rand_row, rand_col);
            System.out.println("The current location of the robot is (row,column): " + p.x + "," + p.y);
        return p;
    }
}