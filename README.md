Exercises
1.1.2   what happens if I remove from the psvm:

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

1.1.3   what happens if you misspell i.e. omit second letter in:

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

1.1.4   what happens if you add lines as white space inside a string literal?
    unclosed string literal error, which is interesting because in a lot of cases white space doesn't do anything special

1.1.5 With the UserArgument class what happens when you enter

    a. java UserArgument java
        just uses "java" as the arg string
    b. java UserArgument @!&^%
        gives errors for the @ and &
    c.  java UserArgument.java Bob
        runs fine, uses Bob as arg
    d. java UserArgument.java Alice Bob
        runs fine, we only call the first arg in the array which is Alice

1.1.6 Write program that can take in three args and print them out
    modified UserArgument to take in arbitrary number of arguments and print a hello string for each argument