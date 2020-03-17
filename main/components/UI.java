package components;

public class UI {

    private void greeting() {
        System.out.println("=== Welcome To the Dungeons and Dragons ===");
    }

    private void askName() {
        System.out.println("How shall We call you summoner? ");
        System.out.print("> ");
        ReadInput readInput = new ReadInput();
        String name = readInput.getUserInput();
        System.out.println("Welcome, " + name + "!");
    }

    private void menu() {
        System.out.println("===================");
        System.out.println("===Choose action===");
        System.out.println("===================");
    }

    private void options() {
        System.out.println("[1] Start the game");
        System.out.println("[2] Create character");
        System.out.println("[3] Exit");
        System.out.print("> ");
    }

    public void run() {
        greeting();
        askName();
        menu();
        options();
    }
}
