package com.example.cs301_weekone;

public class TwentyFivePerLine {

    public static void main(String[] args) {
        // i made it so it can be expanded to other counts

        // initial values
        int beginCount = 1000;
        int endCount = 2000;
        int integersPerLine = 25;
        int integerOnThisLine = 0;

        //main functionality
        for (int i = beginCount; i <= endCount; i++) {
            System.out.print(i+" ");
            integerOnThisLine++;
            if (integerOnThisLine >= integersPerLine){
                System.out.println();
                integerOnThisLine = 0;
            }
        }
    }
}
