package utils;

import java.util.List;

public class DisplayText {
    private List<String> listOfText;

    public DisplayText(String path) throws Exception {
        ReadTextFile readTextFile = new ReadTextFile();
        this.listOfText = readTextFile.readFileToList(path);
    }

    public void printText() {
        for (String sentence: listOfText) {
            System.out.println(sentence);
        }
    }
}
