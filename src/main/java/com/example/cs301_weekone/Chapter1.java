package com.example.cs301_weekone;

import java.util.Random;

/*
Code won't run in command line while it's part of the package that's auto created by intellij
TODO Figure out why
Workaround, remove package, manually navigate inside command prompt, run javac/java commands in prompt
 */

public class Chapter1 {
    public static void main(String[] args) {

        // 1.1.1 write a program that prints hello world 10 times
        /*
        for (int i = 0; i<9; i++){
            printMessage();
        }
        */

        // prints 20 examples of random input thetas all showing 1 as the output
        // floating point rounding errors account for the slight mismatches
        for(int i = 0 ; i < 20 ; i++ ){
            double inputTheta = Math.random()*360;
            System.out.println("Theta= " + inputTheta);
            trigIdentity1(inputTheta);
        }

        // Quiz question 14
        boolean bQuiz = ((Math.sqrt(2)*(Math.sqrt(2)) == 2));
        System.out.println(bQuiz);
    }

    private static void printMessage(){
        System.out.println("Hello, World");
    }

    private static void trigIdentity1(double theta){
        double sumOfSquares = (Math.sin(theta)*Math.sin(theta)) + (Math.cos(theta)*Math.cos(theta));
        System.out.println(sumOfSquares);
    }

}

/*
1.1.2   what happens if i remove from the psvm
        a. public
            Still compiles get "error: can't find main(String[]) method in class: Chapter1a" when trying to run
        b. static
            same, can't find main
        c. void
            compile error, "Chapter1a.java:2: error: invalid method declaration; return type required
    public static main(String[] args) {"
        d. args
            compile error, "Chapter1a.java:2: error: <identifier> expected
            public static void main(String[] ) {"
1.1.3   what happens if you misspell i.e. omit second letter
        a. public
            Chapter1a.java:2: error: <identifier> expected
            pblic static void main(String[] args) {
        b. static
            Chapter1a.java:2: error: <identifier> expected
            public satic void main(String[] args) {
        c. void
            Chapter1a.java:2: error: cannot find symbol
            public static vid main(String[] args) {
                  ^
            symbol:   class vid
            location: class Chapter1a
        d. args
            nothing really, you can still implement the "ags" if you wanted, but int his case it doesn't do anything because we're not using the "ags" array

1.1.4   what happens if you add lines as white space?
            unclosed string literal error, which is interesting because in a lot of cases white space doesn't do anything special
 */