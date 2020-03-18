package utils;
/*
* Use this class to work with any kinds of user input
* If some functionality missing to handle user input
* Add it here.
* */
import java.util.Scanner;

public class ReadUserInput {
    private Scanner scanner;

    public ReadUserInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getUserDice() {
        return  scanner.next().toUpperCase();
    }

    public String getUserInput() { return scanner.next(); }
}
