package components;

import java.util.Scanner;

public class ReadInput {
    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getUserDice() {
        return  scanner.next().toUpperCase();
    }
}
