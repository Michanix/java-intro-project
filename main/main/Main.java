package main;

import utils.DisplayText;
import components.UI;

public class Main {
    public static void main(String[] args) throws Exception {
        DisplayText displayText = new DisplayText("src/main/text/lvl1/forward/goddessOfModestyAndGold.txt");
        displayText.printText();
        UI ui = new UI();
        ui.run();
    }
}
