package com.example.cs301_weekone;

// Write a program TwentyFivePerLine.java that,
// using one for loop and one if statement,
// prints the integers from 1000 to 2000 with 25 integers per line.
// Hint: use the % operator.

public class TwentyFivePerLine {

    public static void main(String[] args) {
        // I made it so it can be expanded to other counts
        // initial values
        int beginCount = 1000;
        int endCount = 2000;
        int integersPerLine = 25;

        // added in user argument modification
        if (args.length == 3){
            beginCount = Integer.parseInt(args[0]);
            endCount = Integer.parseInt(args[1]);
            integersPerLine = Integer.parseInt(args[2]);
            if (beginCount > endCount){
                int hold = beginCount;
                beginCount = endCount;
                endCount = hold;
            }
        }
        /*
        //main functionality
        int integerOnThisLine = 0;
        for (int i = beginCount; i <= endCount; i++) {
            System.out.print(i+" ");
            integerOnThisLine++;
            if (integerOnThisLine >= integersPerLine){
                // this ends the program if there's not enough ints left to fill a line
                if (endCount % i < 25){
                    return;
                }
                System.out.println();
                integerOnThisLine = 0;

            }
        }
        */

        // one for loop, one if loop, uses %
        for (int i = beginCount; i <= endCount; i++){
            System.out.print(i+" ");
            if(i % integersPerLine >= integersPerLine-1){
                System.out.println();
            }
        }
    }
}
