package com.company;

import java.awt.*;

public class RobotClass {

    public Point keyboardLocation(int listener, Point coordinates, int n) {
        Point newCoordinate = new Point();
        switch (listener) {
            case 'a': { // when robot moves to left
                System.out.println("x=" + coordinates.x + " y=" + coordinates.y);
                if (coordinates.y > 0) {
                    newCoordinate = new Point(coordinates.x, coordinates.y - 1);
                    System.out.println("The current location of the robot is (row,column): " + newCoordinate.x + ',' + newCoordinate.y);
                } else {
                    System.out.println("Warning! You've hit the east boundary wall");
                }
                break;
            }

            case 'd': {  // when robot moves to right
                if (coordinates.y < n - 1) {
                    newCoordinate = new Point(coordinates.x, coordinates.y + 1);
                    System.out.println("The current location of the robot is (row,column): " + newCoordinate.x + ',' + newCoordinate.y);
                } else {
                    System.out.println("Warning! You've hit the east boundary wall");
                }
                break;
            }

            case 'w': {  // when robot moves to up
                if (coordinates.x > 0) {
                    newCoordinate = new Point(coordinates.x - 1, coordinates.y);
                    System.out.println("The current location of the robot is (row,column): " + newCoordinate.x + ',' + newCoordinate.y);
                } else {
                    System.out.println("Warning! You've hit the upper boundary wall");
                }
                break;
            }

            case 's': {  // when robot moves to down
                if (coordinates.x <= n - 1) {
                    newCoordinate = new Point(coordinates.x + 1, coordinates.y);
                    System.out.println("The current location of the robot is (row,column): " + newCoordinate.x + ',' + newCoordinate.y);
                } else {
                    System.out.println("Warning! You've hit the bottom boundary wall");
                }
                break;
            }
            default: {
                break;
            }

        }
        return newCoordinate;
    }
}
