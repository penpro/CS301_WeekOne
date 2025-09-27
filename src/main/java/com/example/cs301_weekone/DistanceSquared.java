package com.example.cs301_weekone;// class that allows two command line arguments to be passed in, converts them to integers from the argument array string, casts them to longs to limit
// size erros, and calculates then returns the Euclidean distance from (0,0)
// TODO add error handling for strings that wont parse to ints because of size or format, add error handling for long overflow for large squared values, // maybe switch to symbolic output (string) for numbers larger than long max value

public class DistanceSquared {
 public static void main(String[] args) {
 int x = Integer.parseInt(args[0]);
 int y = Integer.parseInt(args[1]);

// Use long to avoid overflow when squaring ints
 long dx = x;
 long dy = y;

 long distanceSquared = dx * dx + dy * dy;
 System.out.println(distanceSquared);
 }
}