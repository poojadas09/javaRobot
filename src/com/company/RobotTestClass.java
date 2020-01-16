package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RobotTestClass {
    public static int n;
    public static void main(String[] args) {
        BoardClass board = new BoardClass();
        n = board.getRowColumn();
        System.out.println("You have entered " + n);
        System.out.println("0,0 is at top-right corner of the board");
        ArrayList<Point> coordinates= board.chooseRandomCoordinate();
        Scanner input = new Scanner(System.in);
        int listener = input.nextInt();
        RobotClass robot = new RobotClass();
        robot.keyboardLocation(listener);
    }
}
