package Part1;

/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found

 */
import java.util.Scanner;

public class A76_BuildARoute {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String rest = "";

        if (start.equals("A")) {
            if (end.equals("B")) {
                rest += "right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "right > down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "right > down > left: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("B")) {
            if (end.equals("C")) {
                rest += "down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "down > left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "down > left > up: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("C")) {
            if (end.equals("D")) {
                rest += "left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "left > up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "left > up > right: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("D")) {
            if (end.equals("A")) {
                rest += "up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "up > right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "up > right > down: " + end + " found";
            } else {
                rest += start + " found";
            }
        }


/*
          String result = "";

        if (start.equals("A") && end.equals("A")){
            result = "A found";
        } else if (start.equals("A") && end.equals("B")){
            result = "right: B found";
        } else if (start.equals("A") && end.equals("C")) {
            result = "right > down: C found";
        } else if (start.equals("A") && end.equals("D")) {
            result = "right > down > left: D found";
        }


        if (start.equals("B") && end.equals("B")){
            result = "B found";
        } else if (start.equals("B") && end.equals("C")){
            result = "down: C found";
        } else if (start.equals("B") && end.equals("D")) {
            result = "down > left: D found";
        } else if (start.equals("B") && end.equals("A")) {
            result = "down > left > up: A found";
        }


        if (start.equals("C") && end.equals("C")){
            result = "C found";
        } else if (start.equals("C") && end.equals("D")){
            result = "left: D found";
        } else if (start.equals("C") && end.equals("A")) {
            result = "left > up : A found";
        } else if (start.equals("C") && end.equals("B")) {
            result = "left > up > right: B found";
        }


        if (start.equals("D") && end.equals("D")){
            result = "D found";
        } else if (start.equals("D") && end.equals("A")){
            result = "up: A found";
        } else if (start.equals("D") && end.equals("B")) {
            result = "up > right: B found";
        } else if (start.equals("D") && end.equals("C")) {
            result = "up > right > down: C found";
        }


 */


        System.out.println(rest);
    }

}
