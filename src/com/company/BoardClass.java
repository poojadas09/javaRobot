package com.company;

import java.util.ArrayList;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;  // Import the Scanner class


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

    public static ArrayList<Point> chooseRandomCoordinate() {
        ArrayList<Point> coordinates = new ArrayList<Point>();
        Random rand = new Random();
        // Generate random integers in range 0 to number entered by user
        int rand_row = rand.nextInt(number);
        int rand_col = rand.nextInt(number);
        coordinates.add(new Point(rand_row, rand_col));
        for (Point p : coordinates) {
            System.out.println("The current location of the robot is (row,column): " + p.x + "," + p.y);
        }
        return coordinates;
    }
}