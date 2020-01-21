package com.company;

import java.awt.*;
import java.util.Scanner;

public class RobotTestClass {
    public static int n;

    public static void main(String[] args) {
        BoardClass board = new BoardClass();
        n = board.getRowColumn();
        System.out.println("You have entered " + n);
        System.out.println("0,0 is at top-right corner of the board");
        Point coordinates = board.chooseRandomCoordinate();
        try {
            int i = 1;
            Scanner input = new Scanner(System.in);
            while (i > 0) {
                char listener = input.next().charAt(0);
                RobotClass robot = new RobotClass();
                coordinates = robot.keyboardLocation(listener, coordinates, n);
                i++;
            }
            input.close();
        } catch (RuntimeException n) {
            System.out.println("Error occurred " + n);
        }
    }
}
